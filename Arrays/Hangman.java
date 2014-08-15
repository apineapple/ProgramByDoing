import java.util.Scanner;

public class Hangman
{
	public static void main( String[] args )
	{
		String[] word_list = { "ruby", "python", "java", "tootsie", "chairlift", "kittens" };
		char[] game_word;
		char[] hidden_word;
		Scanner keyboard = new Scanner(System.in);
		String user_guess;
		int turn = 1;
				
		game_word = word_list[ (int)(Math.random() * word_list.length) ];
		
		for ( int i = 0; i < game_word.length(); i++ )
		{
			hidden_word += "_";
		}		
		
		while (true)
		{
			System.out.println( "-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n" );
			
			System.out.print( "Word:\t" );
			for ( int i = 0; i < hidden_word.length(); i++ )
			{
				System.out.print( hidden_word.charAt(i) + " " );
			}
			System.out.println();
			
			System.out.print( "Guess: " );
			user_guess = keyboard.next();
			
			for ( int i = 0; i < game_word.length(); i++ )
			{
				if ( user_guess.equals(game_word.charAt(i)) )
					hidden_word[i] = game_word.charAt(i);
			}
			turn++;
			if ( turn > 9 )
				break;
		}
			
	}
}
		