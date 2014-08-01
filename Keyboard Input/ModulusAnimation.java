public class ModulusAnimation
{
	public static void main( String[] args ) throws Exception
	{
		for ( int i=0; i<80; i++ )
		{
			if ( i%10 == 0 )
				System.out.print( " Mr. Mitchell is cool.  \r" );
			else if ( i%10 == 1 )
				System.out.print( " l. Mr. Mitchell is co  \r" );
			else if ( i%10 == 2 )
				System.out.print( " cool. Mr. Mitchell is  \r" );
			else if ( i%10 == 3 )
				System.out.print( " is cool. Mr. Mitchell  \r" );
			else if ( i%10 == 4 )
				System.out.print( " ll is cool. Mr. Mitche \r" );
			else if ( i%10 == 5 )
				System.out.print( " hell is cool. Mr. Mitc \r" );
			else if ( i % 10 == 6 )
				System.out.print( " tchell is cool. Mr. Mi \r" );
			else if ( i % 10 == 7 )
				System.out.print( " Mitchell is cool. Mr.  \r" );
			else if ( i % 10 == 8 )
				System.out.print( " . Mitchell is cool. Mr \r" );
			else if ( i % 10 == 9 )
				System.out.print( " r. Mitchell is cool. M \r" );

			Thread.sleep(200);
		}
		
	}
}
