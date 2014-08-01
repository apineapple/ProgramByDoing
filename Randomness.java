import java.util.Random;

public class Randomness
{
	public static void main( String[] args )
	{
		// 3. When the Random seed is set to a number it has the same numbers 
		//	every time it is re-run
		// 4. Same as above
		Random r = new Random();
		
		int x = 1 + r.nextInt(10);
		
		System.out.println( "My random number is " + x );
		
		// 1. When the 1 + is removed from the statements below 
		// 	the range becomes 0 - 4
		// 2. When it is changed to 3 + the range becomes 3 - 7
		System.out.println( "Here are some numbers from 1 to 5!" );
		System.out.print( 1 + r.nextInt(5) + " " );
		System.out.print( 1 + r.nextInt(5) + " " );
		System.out.print( 1 + r.nextInt(5) + " " );
		System.out.print( 1 + r.nextInt(5) + " " );
		System.out.print( 1 + r.nextInt(5) + " " );
		System.out.print( 1 + r.nextInt(5) + " " );
		System.out.println();
		
		System.out.println( "Here are some numbers from 1 to 100!" );
		System.out.print( 1 + r.nextInt(100) + "\t" );
		System.out.print( 1 + r.nextInt(100) + "\t" );
		System.out.print( 1 + r.nextInt(100) + "\t" );
		System.out.print( 1 + r.nextInt(100) + "\t" );
		System.out.print( 1 + r.nextInt(100) + "\t" );
		System.out.print( 1 + r.nextInt(100) + "\t" );
		System.out.println();
		
		int num1 = 1 + r.nextInt(10);
		int num2 = 1 + r.nextInt(10);
		
		if ( num1 == num2 )
			System.out.println( "The random numbers were the same! Weird!" );
		if ( num1 != num2 ) 
			System.out.println( "The random numbers were different! Not too surprising, actually." );
	}
}