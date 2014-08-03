import java.util.Scanner;

public class LetterAtATime
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		String message;
		
		System.out.print( "What is your message? " );
		message = keyboard.nextLine();
		int msg_len = message.length();
		
		
		System.out.println( "Your message is " + msg_len + " characters long." );
		System.out.println( "The first character is at position 0 and is '" + message.charAt(0) + "'." );
		System.out.println( "The last character is at position " + (msg_len - 1) + " and is '" + message.charAt(msg_len - 1) + "'.\n" );
		
		System.out.println( "Here are all the characters, one at a time:\n" );

		// changed to count vowels
		int vowel_count = 0;

		
		// 1. If <= is used for the for loop it will break because the String starts a 0
		// 	and if it exceeds the length of the string it can't proceed.
		// 2. The length of "box" is 3, the last character is at position 2
		// 3. The loops repeats as long as i < msg_len because Strings are treated like 
		//	arrays and start at 0 so the length has to be reduced by one to get the last position
		// 
		for ( int i = 0; i < msg_len; i++ )
		{
			System.out.println( "\t" + i + " - '" + message.charAt(i) + "'" );
			
			char letter = message.charAt(i);
			
			if ( letter == 'a' || letter == 'A' 
				|| letter == 'e' || letter == 'E' 
				|| letter == 'i' || letter == 'I' 
				|| letter == 'o' || letter == 'O'
				|| letter == 'u' || letter == 'U' )
			{
				vowel_count++;
			}
			
		}
		
		System.out.println( "\nYour message contains vowels " + vowel_count + " times. Isn't that interesting?" );
			
	}
}
		