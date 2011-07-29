package sigl;

import java.nio.*;

import static sigl.GLWrap.*;


public class FBOTexture extends Texture
{
	public final int fbo_id;


	protected FBOTexture( int format, int width, int height )
	{
		super( format, width, height, null );

		int[] ids = { 0 };

		glGenFramebuffersEXT( 1, ids, 0 );

		fbo_id = ids[ 0 ];

		glBindFramebufferEXT( GL_FRAMEBUFFER_EXT, fbo_id );

		glFramebufferTexture2DEXT( GL_FRAMEBUFFER_EXT, GL_COLOR_ATTACHMENT0_EXT, GL_TEXTURE_2D, id, 0 );

		glBindFramebufferEXT( GL_FRAMEBUFFER_EXT, 0 );
	}


	public void bind()
	{
		glBindFramebufferEXT( GL_FRAMEBUFFER_EXT, fbo_id );

		glViewport( 0, 0, width, height );
	}


	public void unbind()
	{
		glBindFramebufferEXT( GL_FRAMEBUFFER_EXT, 0 );
	}
}

