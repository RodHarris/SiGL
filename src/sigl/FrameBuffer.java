package sigl;

import static sigl.GLWrap.*;
import static sigl.GLUWrap.*;

import static jsi3.lib.console.Statics.*;


public class FrameBuffer
{
	int id;
	
	
	public FrameBuffer()
	{
	}
	
	
	public void initGL()
	{
		id = gen_frame_buffer();
	}
	
	
	public Texture attach_texture( Texture tex, int target )
	{
		bind();

		tex.apply();
		
		glFramebufferTexture2DEXT( GL_FRAMEBUFFER_EXT, target, GL_TEXTURE_2D, tex.id, 0 );
		
		tex.unapply();
		
		unbind();
		
		return tex;
	}
	
	
	public RenderBuffer attach_render_buffer( RenderBuffer rbo, int target )
	{
		bind();
		
		glFramebufferRenderbufferEXT( GL_FRAMEBUFFER_EXT, target, GL_RENDERBUFFER_EXT, rbo.id );
		
		unbind();
		
		return rbo;
	}
	
	
	public void bind()
	{
		glBindFramebufferEXT( GL_FRAMEBUFFER_EXT, id );
	}
	
	
	public void unbind()
	{
		glBindFramebufferEXT( GL_FRAMEBUFFER_EXT, 0 );
	}
	
	
	private int gen_frame_buffer()
	{
		int[] ids = { 0 };
		
		glGenFramebuffersEXT( 1, ids, 0 );
		
		return ids[ 0 ];
	}
	
	
	public boolean check_complete()
	{
		bind();
		
		try
		{
			int status = glCheckFramebufferStatusEXT( GL_FRAMEBUFFER_EXT );
			
			cdebug.println( "Status = %d", status );

			if( status != GL_FRAMEBUFFER_COMPLETE_EXT )
			{
				cwarn.println( "Status not complete: %s", gluErrorString( status ) );
				
				return false;
			}

			return true;
		}
		finally
		{
			unbind();
		}
	}
}

