import java.util.Random;
import java.util.Scanner;

public class OneShotHiLo
{
	public static void main( String[] args )
	{
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);
		int guess;
		int secret_num = 1 + r.nextInt(100);
		
		System.out.println( "I'm thinking of a number between 1 - 100. Try to guess it." );
		System.out.print( "> " );
		guess = keyboard.nextInt();
		
		if ( guess == secret_num )
			System.out.println( "You guess it! What are the odds?!?" );
		else if ( guess > secret_num )
			System.out.println( "Sorry, you are too high. I was thinking of " + secret_num + "." );
		else if ( guess < secret_num )
			System.out.println( "Sorry, you are too low. I was thinking of " + secret_num + "." );
		else
			System.out.println( "You are a much strong mind than me. I succumb to your will!" );
		
	}
}