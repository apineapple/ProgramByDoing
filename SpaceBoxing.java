import java.util.Scanner;

public class SpaceBoxing
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int weight, planet;
		double space_weight = 0;
		
		System.out.print( "Please enter your current earth weight: " );
		weight = keyboard.nextInt();
		System.out.println( "\nI have information for the following planets:" );
		System.out.println( "   1. Venus   2. Mars   3. Jupiter" );
		System.out.println( "   4. Saturn  5. Uranus 6. Neptune" );
		
		System.out.print( "\nWhich planet are you visiting? " );
		planet = keyboard.nextInt();
		
		if ( planet == 1 ) // Venus
			space_weight = weight * 0.78;
		else if ( planet == 2 ) // Mars
			space_weight = weight * 0.39;
		else if ( planet == 3 ) // Jupiter
			space_weight = weight * 2.65;
		else if ( planet == 4 ) // Saturn
			space_weight = weight * 1.17;
		else if ( planet == 5 ) // Uranus
			space_weight = weight * 1.05;
		else if ( planet == 6 ) // Neptune
			space_weight = weight * 1.23;
		
		System.out.println( "\nYour weight would be " + space_weight + " pounds on that planet." );
	}
}
		