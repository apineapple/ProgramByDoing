import java.util.Scanner;

public class AlphabeticalOrder
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		String last_name, wait_time;
		
		System.out.print( "What's your last name? " );
		last_name = keyboard.next();
		
		if ( "Carswell".compareToIgnoreCase(last_name) >= 0 )
			wait_time = "You don't have to wait long";
		else if ( "Jones".compareToIgnoreCase(last_name) >= 0 )
			wait_time = "That's not bad";
		else if ( "Smith".compareToIgnoreCase(last_name) >= 0 )
			wait_time = "Looks like a bit of a wait";
		else if ( "Young".compareToIgnoreCase(last_name) >= 0 )
			wait_time = "It's gonna be a while";
		else
			wait_time = "You're not going anywhere for a while";
			
		System.out.println( wait_time + " before we get to you, \"" + last_name + "\"." );
	}
}