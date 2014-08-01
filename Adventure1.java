import java.util.Scanner;

public class Adventure1
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		String answer1, answer2, answer3;
		System.out.print( "Your alarm is going off! Do you wish to \"snooze\" the alarm or \"turn off\" the alarm and wake up?\n> " );
		answer1 = keyboard.nextLine();
		
		if (answer1.equals("snooze") )
		{
			System.out.print( "You see a giant marshmallow you can \"eat\" or you can \"box\" Abraham Lincoln?\n> " );
			answer2 = keyboard.next();
			
			if ( answer2.equals("eat") )
			{
				System.out.print( "Your stomach becomes upset...Keep eating? (\"yes\" or \"no\")\n> " );
				answer3 = keyboard.next();
				// option 1
				if (answer3.equals("yes") )
					System.out.println( "You wake up and feel oddly full. You also discover your pillow is missing..." );
				// option 2
				else if (answer3.equals("no") )
					System.out.println( "You wake up and with your pillow in your mouth. Good thing you didn't eat it!" );
				else
					System.out.println( "You need to answer correctly...You lose." );
			}
			
			else if ( answer2.equals("box") )
			{
				System.out.print( "Abe bobs and weaves around you quickly jabbing. Do you \"jab\" back or \"uppercut\"?\n> " );
				answer3 = keyboard.next();
				// option 3
				if ( answer3.equals("jab") )
					System.out.println( "You wake up as pennies rain down upon you." );
				// option 4
				else if ( answer3.equals("uppercut") )
					System.out.println( "You wake up with a five dollar bill clinched in your fist." );
				else
					System.out.println( "You need to answer correctly...You lose." );
			}
			else
				System.out.println( "You need to answer correctly...You lose." );
		}
		else if ( answer1.equals("turn off") )
		{
			System.out.print( "You wake up. Do you want some \"coffee\" or a \"shower\"?\n> " );
			answer2 = keyboard.next();
			if ( answer2.equals("coffee") )
			{
				System.out.print( "Do you take your coffee with \"sugar\" or \"cream\"?\n> " );
				answer3 = keyboard.next();
				
				// option 5
				if ( answer3.equals("cream") )
					System.out.println( "That's some damn good coffee. And hot too!" );
				// option 6
				else if ( answer3.equals("sugar") )
					System.out.println( "No amount of Java can save you from these nested ifs." );
				else
					System.out.println( "You need to answer correctly...You lose." );
			}
			else if ( answer2.equals("shower") )
			{
				System.out.print( "Do you want to take a \"hot\" or \"cold\" shower?\n> " );
				answer3 = keyboard.next();
				
				// option 7
				if ( answer3.equals("hot") )
					System.out.println( "The warm water feels great! What a wonderful way to start the day!" );
				// option 8
				else if ( answer3.equals("cold") )
					System.out.println( "That is toooooooooo cold. Good-bye nipples." );
				else	
					System.out.println( "You need to answer correctly...You lose." );			
			}	
		}
		else
			System.out.println( "You need to answer correctly...You lose." );
	}
}