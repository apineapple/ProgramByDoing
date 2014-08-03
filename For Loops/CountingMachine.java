import java.util.Scanner;

public class CountingMachine
{
	public static void main( String[] args )
	{
		int choice;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print( "Count to: " );
		choice = keyboard.nextInt();
		
		for ( int i = 0; i <= choice; i++ )
		{
			System.out.print( i + " " );
		}
		
		System.out.println();
	}
}