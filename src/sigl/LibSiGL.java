package sigl;

import org.junit.*;
import org.junit.runner.*;
import org.junit.runner.notification.*;

import static org.junit.Assert.*;

import static jsi3.lib.filesystem.Statics.*;
import static jsi3.lib.console.Statics.*;
import static jsi3.lib.text.Statics.*;

public class LibSiGL
{
	public static final int BUILD = 86;

	public static final long BUILD_TIME = 1312169688350L;
	

	public static void main( String[] args ) throws Exception
	{
		if( args.length == 1 && "--version".equals( args[ 0 ] ) )
		
		version( 0 );

		if( args.length == 1 && "--copy".equals( args[ 0 ] ) )

		show_copyrights();

		if( args.length == 1 && "--unit".equals( args[ 0 ] ) )

		run_unit_tests();

		if( args.length == 1 && "--wrap".equals( args[ 0 ] ) )

		SiGLClassGenerator.run();
		
		usage( 0 );
	}


	
	@Test
	public void test1()
	{
	}
	



	public static void version( int exit_code )
	{
		System.err.println( "LibSiGL build " + BUILD + " on " + new java.util.Date( BUILD_TIME ) );

		if( exit_code > 0 ) return;

		System.exit( exit_code );
	}

	
	private static void run_unit_tests()
	{
		Result result = JUnitCore.runClasses( LibSiGL.class );

		cout.println( "Unit Testing Results:" );
		
		cout.println( "   Passed:          %b", result.wasSuccessful() );
		
		cout.println( "   Time Taken:      %dms", result.getRunTime() );
		
		cout.println( "   Tests Run:       %d", result.getRunCount() );
		
		cout.println( "   Tests Failed:    %d", result.getFailureCount() );
		
		cout.println( "   Tests Ingored:   %d", result.getIgnoreCount() );
		
		for( Failure failure : result.getFailures() )
		{
			cerr.println( failure );
		}
		
		if( result.wasSuccessful() )
		{
			System.exit( 0 );
		}
		else
		{
			System.exit( -1 );
		}
	}


	static void show_copyrights() throws Exception
	{
		for( String line : load_text_resource( LibSiGL.class, "copyrights/list.txt" ).split( "\n" ) )
		{
			if( no_data( line ) ) continue;
			
			line = line.trim();
			
			if( line.startsWith( "#" ) ) continue;
			
			String[] tokens = line.split( " : " );
			
			if( tokens.length != 2 ) continue;
			
			System.out.println( "\n" + tokens[ 0 ] );
			
			//System.out.println( "\n" + tokens[ 1 ] );
			
			System.out.println( "\n" + load_text_resource( LibSiGL.class, "copyrights/" + tokens[ 1 ].trim() ) );
		}
		
		System.exit( 0 );
	}
	
	
	static void usage( int exit_code )
	{
		System.err.println( "usage: LibSiGL [options]" );

		System.err.println( "   --version  :  prints build number and date" );
		System.err.println( "   --copy     :  copyright info for this library and all included dependencies" );
		System.err.println( "   --unit     :  runs units tests" );
		System.err.println( "   --wrap     :  generate GL wrapper classes" );

		if( exit_code > 0 ) return;

		System.exit( exit_code );
	}
}
