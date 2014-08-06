public class NestingLoops
{
	public static void main( String[] args )
	{
		// this is #1 - I'll call it "CN"
		// 1. The inner loop moves "faster" it cycles through all of itself and then 
		//	triggers the outer loop to advance one more.
		// 2. If the loops are swapped the number moves "slowly" and the char moves "faster" 
		
		for ( char c = 'A'; c <= 'E'; c++ )
		{
			for ( int n = 1; n <= 3; n++ )
			{
				System.out.println( c + " " + n );
			}
		}
		
		System.out.println( "\n" );
		
		// this is #2 - I'll call it "AB"
		for ( int a = 1; a <= 3; a++ )
		{
			for ( int b = 1; b <= 3; b++ )
			{
				// 3. If changed to println all it will show on 9 lines instead of 1 long line
				System.out.print( a + "-" + b + " " );
			}
			// * You will add a line of code here.
			// 4. This line will run after the 2nd for loop has finished
			// 	so there will be 3 lines with 3 things
			System.out.println();
		}
		
		System.out.println( "\n" );
		
	}
}