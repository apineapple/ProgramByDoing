public class MultiplicationTable
{
	public static void main( String[] args )
	{
		System.out.println( " x | 1\t2\t3\t4\t5\t6\t7\t8\t9");
		System.out.println( "==+===============================================================" );
		
		for ( int x = 1; x <= 12; x++ )
		{
			if (x < 10 )
				System.out.print ( " " + x + " | " );
			else
				System.out.print ( x + " | " );
			for ( int y = 1; y <= 9; y++ )
			{
				System.out.print( (x * y) + "\t" );
			}
		
			System.out.println();
		}
	}
}