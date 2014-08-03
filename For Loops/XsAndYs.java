public class XsAndYs
{
	public static void main( String[] args )
	{
		double y;
		
		System.out.println( " x\ty"  );
		System.out.println( "-----------------" );
		
		for ( double x = -10.0; x <= 10.0; x += 0.5 )
		{
			y = x * x;
			System.out.println( x + "\t" + y );
		}
	}
}