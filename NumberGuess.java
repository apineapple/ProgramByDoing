import java.util.Random;
import java.util.Scanner;

public class NumberGuess
{
	public static void main( String[] args )
	{
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);
		int guess, secret_num = 1 + r.nextInt(10);
		
		System.out.println( "I'm thinking of a number from 1 to 10." );
		System.out.print( "Your guess: " );
		guess = keyboard.nextInt();
		
		if ( guess == secret_num )
			System.out.println( "\nThat's right! My secret number was " + secret_num + "!" );
		else
			System.out.println( "\nSorry, but I was really thinking of " + secret_num + "." );
	}
}