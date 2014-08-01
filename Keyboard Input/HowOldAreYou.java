import java.util.Scanner;

public class HowOldAreYou
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		String name;
		int age;
		
		System.out.print( "Hey, what's your name? " );
		name = keyboard.next();
		System.out.print( "\nOk, " + name + ", how old are you? " );
		age = keyboard.nextInt();
		System.out.println();
		
		if ( age < 16 )
			System.out.println( "You can't drive, " + name );
		if ( age < 18 )
			System.out.println( "You can't vote, " + name );
		if ( age < 25 )
			System.out.println( "You can't rent a car, " + name );
		else
			System.out.println( "You can do anything that's legal, " + name );
		
	}
}