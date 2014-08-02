import java.util.Scanner;

public class AddingValuesInALoop
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int total = 0;
		int add_num = 1;
		System.out.println( "I will add up the numbers you give me." );

		while ( add_num != 0 )
		{
			System.out.print( "Number: " );
			add_num = keyboard.nextInt();
			total += add_num;
			if ( add_num != 0 )
				System.out.println( "The total so far is " + total );
		}
		
		System.out.println( "\nThe total is " + total );
	}
}