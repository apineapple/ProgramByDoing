import java.util.Scanner;
import java.util.Random;

public class HiLoLimited
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int secret = 1 + r.nextInt(100);
		int tries = 1;
		int guess;
		
		System.out.println( "I'm thinking of a number between 1-100. You have 7 guesses." );
		System.out.print( "First guess: " );
		guess = keyboard.nextInt();
		tries++;
		
		while ( secret != guess && tries < 8 )
		{
			if ( secret < guess )
			{
				System.out.println( "Sorry, you're too high." );
				System.out.print( "Guess # " + tries + ": " );
				guess = keyboard.nextInt();
				tries++;
			} 
			else if ( secret > guess )
			{
				System.out.println( "Sorry, you're too low." );
				System.out.print( "Guess # " + tries + ": " );
				guess = keyboard.nextInt();
				tries++;
			}
			else
			{
				System.out.println ("ERROR.");
				tries = 8;
			}
		}
		
		if ( secret == guess )
			System.out.println( "You guess it! What are the odds?!?" );
		else if ( tries > 7 )
		{	
			System.out.println( "Sorry, you didn't guess it in 7 tries. You lose." );
		}
	}
}