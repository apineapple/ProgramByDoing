import java.util.Scanner;

public class WorstGuessing
{
	public static void main( String[] args )
	{
		int guess, secret_num = 4;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println( "TEH WORST NUBMER GESSING GAME EVAR!!!!!!!1!\n" );
		
		System.out.print( "I\"M THKING OF A NBR FROM 1-10. TRY 2 GESS! " );
		guess = keyboard.nextInt();
		
		if ( guess == secret_num )
			System.out.println( "\nLOL!!! U GOT IT! I CANT BELEIVE U GESSED IT WAS 4!" );
		else
			System.out.println( "\nW00T! U SUX0R!!! I PWN J00!!! IT WAS 4!" );
		
	}
}