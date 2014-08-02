import java.util.Scanner;

public class CountingWhile
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println( "Type in the a message, and I'll display it five times." );
		System.out.print( "Message: " );
		String message = keyboard.nextLine();
		// 4. Added ability for user to choose how many times it loops
		System.out.print( "How many times? " );
		int user_end = keyboard.nextInt();
		int n = 0;
		// 2. Changed to loop 10x instead of 5x
		while ( n < user_end )
		{
			// 3. Changed to count by 10s
			System.out.println( ((n + 1) * 10) + ". " + message );
			// 1. The ++ adds one to the value of n
			
			n++;
		}
	}
}