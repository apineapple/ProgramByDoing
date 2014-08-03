import java.util.Scanner;

public class CountingFor
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println( "Type in a message, and I'll display it five times." );
		System.out.print( "Message: ");
		String message = keyboard.nextLine();
		
		// 1. the n = n + 1 is used to advance the loop so that it will not be infinite
		// 2. int n = 1 declaring what the looping counter will be and setting it to a value
		// 3. changed to loop 10x
		// 4. changed to count by 2 
		// for ( int n = 1; n <= 5; n++ )
		for ( int n = 2; n <= 10 ; n = n + 2 )
		{
			System.out.println( n + ". " + message );
		}
	}
}