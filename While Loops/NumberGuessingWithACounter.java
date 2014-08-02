import java.util.Scanner;

public class NumberGuessingWithACounter
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int secret = 1 + (int)(Math.random() * 10);
		int tries = 0;
		int guess;
		
		System.out.println( "I have chosen a number between 1 and 10. Try to guess it." );
		System.out.print( "Your guess: " );
		guess = keyboard.nextInt();
		tries++;
		
		while ( guess != secret )
		{
			System.out.println( "That is incorrect. Guess again." );
			System.out.print( "Your guess: " );
			guess = keyboard.nextInt();
			tries++;
		}
		
		System.out.println( "That's right! You're a good guesser." );
		System.out.println( "It only took you " + tries + " tries." );
	}
}