import java.util.Random;
import java.util.Scanner;

public class AgainWithTheNumberGuessing
{
	public static void main( String[] args )
	{
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);
		int guess;
		int secret = 1 + r.nextInt(10);
		int tries = 0;
		
		System.out.println( "I have chosen a number between 1 and 10. Try to guess it." );
			
		do
		{
			System.out.print( "Your guess: " );
			guess = keyboard.nextInt();
			tries++;
			if ( secret != guess )
				System.out.println( "That is incorrect. Guess again." );
		} while ( secret != guess );
		
		System.out.println( "That's right! You're a good guesser." );
		System.out.println( "It only took you " + tries + " tries." );
	}
}