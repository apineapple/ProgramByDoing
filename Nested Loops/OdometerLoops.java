import java.util.Scanner;

public class OdometerLoops
{
	public static void main( String[] args ) throws Exception
	{
		Scanner keyboard = new Scanner(System.in);
		int base_num;
		
		System.out.print( "Which base (2-10): " );
		base_num = keyboard.nextInt();
		
		// 1. Yes it still works
		for ( int thous=0; thous < base_num; thous++ )
		{
			for ( int hund=0; hund < base_num; hund++ )
			{
				for ( int tens=0; tens < base_num; tens++ )
				{
					for ( int ones=0; ones < base_num; ones++ )
					{
						System.out.print( " " + thous + "" + hund + "" + tens + "" + ones + "\r" );
						Thread.sleep(500);
					}
				}
			}
		}

		System.out.println();
	}
}
