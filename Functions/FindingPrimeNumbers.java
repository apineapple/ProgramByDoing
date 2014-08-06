public class FindingPrimeNumbers
{
	public static void main( String[] args )
	{
		for ( int x = 2; x <= 100; x++ )
		{
			// Blocked out option 1
			// System.out.print( x + " " );
			
			if ( isPrime(x) )
				System.out.println( x );
			 
			// System.out.println();
		}
	}
	
	public static boolean isPrime( int n )
	{
		for ( int x = 2; x < n; x++ )
		{
			if ( n % x == 0 )
				return false;
		}
		return true;
	}
}