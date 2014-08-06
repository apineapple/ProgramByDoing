// This also met the specs for Refresher2

import java.util.Scanner;

public class Refresher
{
	public static void main( String[] args )
	{
		Scanner kb = new Scanner(System.in);
		String name;
		int loop_end = 10;
		
		System.out.print( "What is your name: " );
		name = kb.next();
		System.out.println();
		
		if ( name.equals("Mitchell") )
			loop_end = 5;
			
		for ( int x = 1; x <= loop_end; x++ )
		{
			System.out.println( name );
		}
	}
}