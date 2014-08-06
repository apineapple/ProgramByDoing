public class GettingIndividualDigits
{
	public static void main( String[] args )
	{
		for ( int tens = 1; tens < 10; tens++ )
		{	
			for ( int ones = 0; ones < 10; ones++ )
			{
				System.out.println ( tens + "" + ones + ", " + tens + "+" + ones + " = " + (tens + ones) );
			}
		}
	}
}