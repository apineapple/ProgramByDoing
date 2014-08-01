import java.util.Scanner;

public class AgeMessages3
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		String name;
		// testing out StringBuilder after comments from Code Review
		StringBuilder sb = new StringBuilder();
		int age;
		
		System.out.print( "Your name: " );
		name = keyboard.next();
		System.out.print( "Your age: " );
		age = keyboard.nextInt();
		
		if ( age < 16 )
		{
			sb.append("You can't drive, ").append(name)
			.append(".");
		}
		else if ( age >= 16 && age < 18 )
		{
			sb.append("You can drive but not vote, ").append(name)
			.append(".");
		}
		else if ( age >= 18 && age < 25 )
		{
			sb.append("You can vote but not rent a car, ").append(name)
			.append(".");
		}
		else
		{
			sb.append("You can pretty much do anything, ").append(name)
			.append(".");
		}
		
		System.out.println(sb);
	}
}