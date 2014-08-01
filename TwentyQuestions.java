import java.util.Scanner;

public class TwentyQuestions
{
	public static void main( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String q1, q2, guess;
		
		System.out.println( "TWO QUESTIONS!" );
		System.out.println( "Think of an object, and I'll try to guess it.\n" );
		System.out.print( "Question 1) Is it animal, vegetable, or mineral?\n> " );
		q1 = keyboard.next();
		
		System.out.print( "\nQuestion 2) Is it bigger than a breadbox? \n> " );
		q2 = keyboard.next();
		
		if ( q1.equals("animal") )
		{
			if ( q2.equals("yes") )
				guess = "moose";
			else if ( q2.equals("no") )
				guess = "squirrel";
			else
				guess = "way to not answer correctly";
		}
		else if ( q1.equals("vegetable") )
		{	
			if ( q2.equals("no") )
				guess = "carrot";
			else if ( q2.equals("yes") )
				guess = "watermelon";
			else
				guess = "poorly answered question";
		}
		else if ( q1.equals("mineral") )
		{
			if ( q2.equals("yes") )
				guess = "paper clip";
			else if ( q2.equals("no") )
				guess = "Camaro";
			else
				guess = "way to stump the computer";
		}
		else
			guess = "person who refuses to answer two questions";
		
		System.out.println( "My guess is that you are thinking of a " + guess + "." );
		System.out.println( "I would ask you if I'm right, but I don't actually care." );
	}
}