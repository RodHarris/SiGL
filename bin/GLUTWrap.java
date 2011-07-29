package sigl;

import com.sun.opengl.util.GLUT;

/**
	This is an auto generated class created via the Java reflection mechanism
	@author Rod Harris
*/

public final class GLUTWrap
{

	public static GLUT glut;

	public static final int STROKE_ROMAN = com.sun.opengl.util.GLUT.STROKE_ROMAN;
	public static final int STROKE_MONO_ROMAN = com.sun.opengl.util.GLUT.STROKE_MONO_ROMAN;
	public static final int BITMAP_9_BY_15 = com.sun.opengl.util.GLUT.BITMAP_9_BY_15;
	public static final int BITMAP_8_BY_13 = com.sun.opengl.util.GLUT.BITMAP_8_BY_13;
	public static final int BITMAP_TIMES_ROMAN_10 = com.sun.opengl.util.GLUT.BITMAP_TIMES_ROMAN_10;
	public static final int BITMAP_TIMES_ROMAN_24 = com.sun.opengl.util.GLUT.BITMAP_TIMES_ROMAN_24;
	public static final int BITMAP_HELVETICA_10 = com.sun.opengl.util.GLUT.BITMAP_HELVETICA_10;
	public static final int BITMAP_HELVETICA_12 = com.sun.opengl.util.GLUT.BITMAP_HELVETICA_12;
	public static final int BITMAP_HELVETICA_18 = com.sun.opengl.util.GLUT.BITMAP_HELVETICA_18;

	private GLUTWrap() {}

	public static final void glutBitmapCharacter( int a0, char a1 )
	{
		assert dprintln( "glutBitmapCharacter( " + a0 + ", " + a1 + " )" );
		glut.glutBitmapCharacter( a0, a1 );
	}
	public static final int glutBitmapLength( int a0, java.lang.String a1 )
	{
		assert dprintln( "glutBitmapLength( " + a0 + ", " + a1 + " )" );
		return glut.glutBitmapLength( a0, a1 );
	}
	public static final void glutBitmapString( int a0, java.lang.String a1 )
	{
		assert dprintln( "glutBitmapString( " + a0 + ", " + a1 + " )" );
		glut.glutBitmapString( a0, a1 );
	}
	public static final int glutBitmapWidth( int a0, char a1 )
	{
		assert dprintln( "glutBitmapWidth( " + a0 + ", " + a1 + " )" );
		return glut.glutBitmapWidth( a0, a1 );
	}
	public static final void glutSolidCone( double a0, double a1, int a2, int a3 )
	{
		assert dprintln( "glutSolidCone( " + a0 + ", " + a1 + ", " + a2 + ", " + a3 + " )" );
		glut.glutSolidCone( a0, a1, a2, a3 );
	}
	public static final void glutSolidCube( float a0 )
	{
		assert dprintln( "glutSolidCube( " + a0 + " )" );
		glut.glutSolidCube( a0 );
	}
	public static final void glutSolidCylinder( double a0, double a1, int a2, int a3 )
	{
		assert dprintln( "glutSolidCylinder( " + a0 + ", " + a1 + ", " + a2 + ", " + a3 + " )" );
		glut.glutSolidCylinder( a0, a1, a2, a3 );
	}
	public static final void glutSolidDodecahedron()
	{
		assert dprintln( "glutSolidDodecahedron()" );
		glut.glutSolidDodecahedron();
	}
	public static final void glutSolidIcosahedron()
	{
		assert dprintln( "glutSolidIcosahedron()" );
		glut.glutSolidIcosahedron();
	}
	public static final void glutSolidOctahedron()
	{
		assert dprintln( "glutSolidOctahedron()" );
		glut.glutSolidOctahedron();
	}
	public static final void glutSolidRhombicDodecahedron()
	{
		assert dprintln( "glutSolidRhombicDodecahedron()" );
		glut.glutSolidRhombicDodecahedron();
	}
	public static final void glutSolidSphere( double a0, int a1, int a2 )
	{
		assert dprintln( "glutSolidSphere( " + a0 + ", " + a1 + ", " + a2 + " )" );
		glut.glutSolidSphere( a0, a1, a2 );
	}
	public static final void glutSolidTeapot( double a0 )
	{
		assert dprintln( "glutSolidTeapot( " + a0 + " )" );
		glut.glutSolidTeapot( a0 );
	}
	public static final void glutSolidTeapot( double a0, boolean a1 )
	{
		assert dprintln( "glutSolidTeapot( " + a0 + ", " + a1 + " )" );
		glut.glutSolidTeapot( a0, a1 );
	}
	public static final void glutSolidTetrahedron()
	{
		assert dprintln( "glutSolidTetrahedron()" );
		glut.glutSolidTetrahedron();
	}
	public static final void glutSolidTorus( double a0, double a1, int a2, int a3 )
	{
		assert dprintln( "glutSolidTorus( " + a0 + ", " + a1 + ", " + a2 + ", " + a3 + " )" );
		glut.glutSolidTorus( a0, a1, a2, a3 );
	}
	public static final void glutStrokeCharacter( int a0, char a1 )
	{
		assert dprintln( "glutStrokeCharacter( " + a0 + ", " + a1 + " )" );
		glut.glutStrokeCharacter( a0, a1 );
	}
	public static final int glutStrokeLength( int a0, java.lang.String a1 )
	{
		assert dprintln( "glutStrokeLength( " + a0 + ", " + a1 + " )" );
		return glut.glutStrokeLength( a0, a1 );
	}
	public static final float glutStrokeLengthf( int a0, java.lang.String a1 )
	{
		assert dprintln( "glutStrokeLengthf( " + a0 + ", " + a1 + " )" );
		return glut.glutStrokeLengthf( a0, a1 );
	}
	public static final void glutStrokeString( int a0, java.lang.String a1 )
	{
		assert dprintln( "glutStrokeString( " + a0 + ", " + a1 + " )" );
		glut.glutStrokeString( a0, a1 );
	}
	public static final int glutStrokeWidth( int a0, char a1 )
	{
		assert dprintln( "glutStrokeWidth( " + a0 + ", " + a1 + " )" );
		return glut.glutStrokeWidth( a0, a1 );
	}
	public static final float glutStrokeWidthf( int a0, char a1 )
	{
		assert dprintln( "glutStrokeWidthf( " + a0 + ", " + a1 + " )" );
		return glut.glutStrokeWidthf( a0, a1 );
	}
	public static final void glutWireCone( double a0, double a1, int a2, int a3 )
	{
		assert dprintln( "glutWireCone( " + a0 + ", " + a1 + ", " + a2 + ", " + a3 + " )" );
		glut.glutWireCone( a0, a1, a2, a3 );
	}
	public static final void glutWireCube( float a0 )
	{
		assert dprintln( "glutWireCube( " + a0 + " )" );
		glut.glutWireCube( a0 );
	}
	public static final void glutWireCylinder( double a0, double a1, int a2, int a3 )
	{
		assert dprintln( "glutWireCylinder( " + a0 + ", " + a1 + ", " + a2 + ", " + a3 + " )" );
		glut.glutWireCylinder( a0, a1, a2, a3 );
	}
	public static final void glutWireDodecahedron()
	{
		assert dprintln( "glutWireDodecahedron()" );
		glut.glutWireDodecahedron();
	}
	public static final void glutWireIcosahedron()
	{
		assert dprintln( "glutWireIcosahedron()" );
		glut.glutWireIcosahedron();
	}
	public static final void glutWireOctahedron()
	{
		assert dprintln( "glutWireOctahedron()" );
		glut.glutWireOctahedron();
	}
	public static final void glutWireRhombicDodecahedron()
	{
		assert dprintln( "glutWireRhombicDodecahedron()" );
		glut.glutWireRhombicDodecahedron();
	}
	public static final void glutWireSphere( double a0, int a1, int a2 )
	{
		assert dprintln( "glutWireSphere( " + a0 + ", " + a1 + ", " + a2 + " )" );
		glut.glutWireSphere( a0, a1, a2 );
	}
	public static final void glutWireTeapot( double a0 )
	{
		assert dprintln( "glutWireTeapot( " + a0 + " )" );
		glut.glutWireTeapot( a0 );
	}
	public static final void glutWireTeapot( double a0, boolean a1 )
	{
		assert dprintln( "glutWireTeapot( " + a0 + ", " + a1 + " )" );
		glut.glutWireTeapot( a0, a1 );
	}
	public static final void glutWireTetrahedron()
	{
		assert dprintln( "glutWireTetrahedron()" );
		glut.glutWireTetrahedron();
	}
	public static final void glutWireTorus( double a0, double a1, int a2, int a3 )
	{
		assert dprintln( "glutWireTorus( " + a0 + ", " + a1 + ", " + a2 + ", " + a3 + " )" );
		glut.glutWireTorus( a0, a1, a2, a3 );
	}
	private static boolean dprintln( String s )
	{
		System.err.println( s );
		return true;
	}
}
