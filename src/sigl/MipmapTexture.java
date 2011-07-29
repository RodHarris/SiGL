
package sigl;

import java.nio.*;

import static sigl.GLWrap.*;
import static sigl.GLUWrap.*;
import static sigl.Statics.*;

import static  jsi3.lib.gui.Statics.*;
import static jsi3.lib.console.Statics.*;

import java.awt.image.*;

public class MipmapTexture
{
	public final int id;

	public final int format;

	public final int width;

	public final int height;
	
	public final int max_levels;


	public int wrap_s = GL_REPEAT;

	public int wrap_t = GL_REPEAT;

	public int mag_filter = GL_NEAREST;

	public int min_filter = GL_NEAREST;

	public int mode = GL_REPLACE;
	
	public double anisotropy_filter_level = 1.0;
	
	
	private int tex_unit;
	
	
	protected MipmapTexture( int format, BufferedImage image_0, int max_levels )
	{
		int w = image_0.getWidth();

		int h = image_0.getHeight();
		
		this.format = format;

		this.width = w;

		this.height = h;
		
		this.max_levels = max_levels;
		
		image_hints = quality_image_hints;
		
		int[] tex_ids = { 0 };

		glGenTextures( 1, tex_ids, 0 );

		this.id = tex_ids[ 0 ];

		glPixelStorei( GL_UNPACK_ALIGNMENT, 1 );
		
		glActiveTexture( GL_TEXTURE0 );

		glBindTexture( GL_TEXTURE_2D, id );
		
		Buffer image_data = image_to_buffer( image_0 );
		
		if( max_levels >= 0 )
		{
			glTexParameteri( GL_TEXTURE_2D, GL_TEXTURE_BASE_LEVEL, 0 );
			
			glTexParameteri( GL_TEXTURE_2D, GL_TEXTURE_MAX_LEVEL, max_levels );
			
			gluBuild2DMipmapLevels( GL_TEXTURE_2D, format, width, height, format, GL_UNSIGNED_BYTE, 0, 0, max_levels, image_data );

/*
			for( int i=1; i<=max_levels; i++ )
			{
				int iscale = i + 1;
				
				w /= 2;
				
				h /= 2;
				
				BufferedImage image_i = resize_image( image_0, w, h );
				
				view_image( image_i );
				
				image_data = image_to_buffer( image_i );
				
				cdebug.println( "Generating level %d mipmap [%dx%d]", i, w, h );
				
				glTexImage2D( GL_TEXTURE_2D, i, format, w, h, 0, format, GL_UNSIGNED_BYTE, image_data );
			}
*/
		}
		else
		{
			glTexParameteri( GL_TEXTURE_2D, GL_GENERATE_MIPMAP, GL_TRUE );
			
			glTexImage2D( GL_TEXTURE_2D, 0, format, width, height, 0, format, GL_UNSIGNED_BYTE, image_data );
		}
		
		glBindTexture( GL_TEXTURE_2D, 0 );
	}
	
	
	public void apply()
	{
		apply( GL_TEXTURE0 );
	}
	

	public void apply( final int tex_unit )
	{
		this.tex_unit = tex_unit;
		
		glActiveTexture( tex_unit );
		
		glBindTexture( GL_TEXTURE_2D, id );
		
		if( max_levels >= 0 )
		{
			glTexParameteri( GL_TEXTURE_2D, GL_TEXTURE_BASE_LEVEL, 0 );
			glTexParameteri( GL_TEXTURE_2D, GL_TEXTURE_MAX_LEVEL, max_levels );
		}
		
		glTexParameterf( GL_TEXTURE_2D, GL_TEXTURE_MAX_ANISOTROPY_EXT, (float) anisotropy_filter_level );

		glTexParameteri( GL_TEXTURE_2D, GL_TEXTURE_WRAP_S, wrap_s );
		glTexParameteri( GL_TEXTURE_2D, GL_TEXTURE_WRAP_T, wrap_t );
		glTexParameteri( GL_TEXTURE_2D, GL_TEXTURE_MAG_FILTER, mag_filter );
		glTexParameteri( GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, min_filter );

		glTexEnvf( GL_TEXTURE_ENV, GL_TEXTURE_ENV_MODE, mode );

		glEnable( GL_TEXTURE_2D );
	}


	public void unapply()
	{
		glActiveTexture( tex_unit );
		
		glBindTexture( GL_TEXTURE_2D, 0 );
		
		this.tex_unit = 0;
	}
	
	
	public void delete()
	{
		int[] tex_ids = { id };
		
		glActiveTexture( tex_unit );
		
		glDeleteTextures( 1, tex_ids, 0 );
		
		this.tex_unit = 0;
	}
}
