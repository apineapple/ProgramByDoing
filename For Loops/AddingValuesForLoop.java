import java.util.Scanner;

public class AddingValuesForLoop
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int choice, sum_total = 0;
		
		
		System.out.print( "Number: " );
		choice = keyboard.nextInt();
		System.out.println();
		
		for ( int i = 1; i <= choice; i++ )
		{
			sum_total += i;
			System.out.print( i + " " );
		}
		System.out.println( "\nThe sum is " + sum_total + "." );
	}
}