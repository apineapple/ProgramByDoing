public class WhatIf
{
	public static void main( String[] args )
	{
		int people = 20;
		int cats = 20;
		int dogs = 15;
		
		// 1. The if will run the code below it if the logic is true
		// 2. The { } are there to house the code that will be run if true
		// 3. Changing cats to equal people so neither runs
		
		if ( people < cats )
		{
			System.out.println( "Too many cats! The world is doomed!" );
		}
		
		if ( people > cats )
		{
			System.out.println( "Not many cats! The world is saved!" );
		}
		
		if ( people < dogs )
		{
			System.out.println( "The world is drooled on!" );
		}
		
		if ( people > dogs )
		{
			System.out.println( "The world is dry!" );
		}
		
		dogs += 5;
		
		if ( people >= dogs )
		{
			System.out.println( "People are greater than or equal to dogs." );
		}
		
		if ( people <= dogs )
		{
			System.out.println( "People are less than or equal to dogs." );
		}
		
		if ( people == dogs )
		{
			System.out.println( "People are dogs." );
		}
	}
}