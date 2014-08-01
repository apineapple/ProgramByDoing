import java.util.Scanner;

public class GenderGame
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		String gender, first_name, last_name, marital_status;
		String formal_name;
		int age;
		
		System.out.print( "What is your gender (M or F): " );
		gender = keyboard.next();
		
		System.out.print( "First name: " );
		first_name = keyboard.next();
		
		System.out.print( "Last name: " );
		last_name = keyboard.next();
		
		System.out.print( "Age: " );
		age = keyboard.nextInt();
		
		if ( age >= 20 )
		{
			if ( gender.equals("F") )
			{
				System.out.print( "\nAre you married, " + first_name + " (y or n)? " );
				marital_status = keyboard.next();
				if ( marital_status.equals("y") )
					formal_name = "Mrs. " + last_name;
				else
					formal_name = "Ms. " + last_name;
			}
			else
				formal_name = "Mr. " + last_name;
		}
		else
			formal_name = first_name + " " + last_name;
		
		System.out.println( "\nThen I shall call you " + formal_name );
	}
}