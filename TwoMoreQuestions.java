import java.util.Scanner;

public class TwoMoreQuestions
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		String answer1, answer2;
		
		System.out.println( "TWO MORE QUESTIONS, BABY!\n" );
		System.out.println( "Think of something and I'll try to guess it!\n" );
		
		System.out.print( "Question 1) Does it stay inside or outside or both? " );
		answer1 = keyboard.next();
		
		System.out.print( "Question 2) Is it a living thing? " );
		answer2 = keyboard.next();
		
		// not allowed to use else if or else
		// required to use if with &&
		if ( answer1.equals("inside") && answer2.equals("yes") )
			System.out.println("\nYou were totally thinking about Gus the house cat!" );
		if ( answer1.equals("inside") && answer2.equals("no") )
			System.out.println("\nThe only thing you could be thinking of was a bed." );
		if ( answer1.equals("outside") && answer2.equals("yes") )
			System.out.println("\nIt's outside and alive...Was it a bear?" );
		if ( answer1.equals("outisde") && answer2.equals("no") )
			System.out.println("\nStop thinking about dead bears you sicko!" );
		if ( answer1.equals("both") && answer2.equals("yes") )
			System.out.println("\nYou're thinking of yourself. How vain!" );
		if ( answer1.equals("both") && answer2.equals("no") )
			System.out.println("\nG-g-g-g-ghost!");
	}
}
	