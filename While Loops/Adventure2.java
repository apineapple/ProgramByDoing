import java.util.Scanner;

public class Adventure2
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		int nextroom = 1;
		int smelly_turns = 0;
		String choice = "";
		
		while ( nextroom != 0 )
		{
			// entry way, options => living room (3), kitchen (2)
			if ( nextroom == 1 )
			{
				System.out.println( "You are in the entry way of the apartment. The kitchen is to the \"left\" and the hallway is \"forward\"." );
				System.out.print( "> " );
				choice = keyboard.nextLine();
				System.out.println();
				
				if ( choice.equals("left") )
					nextroom = 2;
				else if ( choice.equals("forward") )
					nextroom = 3;
				else if ( choice.equals("back") )
					nextroom = 0;
				else
					System.out.println( choice + " wasn't one of the options. Try again.\n\n" );
			}
			
			// kitchen, options => entry way (1)
			if ( nextroom == 2 )
			{
				System.out.println( "You are in the kitchen. You make yourself a cup of coffee." );
				System.out.println( "Mmmm... Now that you've got that you can go \"back\" and explore the rest of the apartment." );
				System.out.print( "> " );
				choice = keyboard.nextLine();
				System.out.println();

				if ( choice.equals("back") )
					nextroom = 1;
				else
					System.out.println( choice + " wasn't one of the options. Try again.\n\n" );
			}
			
			// living room, options => entry way (1), TV (7), back hall (4)
			if ( nextroom == 3 )
			{
				System.out.println( "The TV is playing an odd show you've never seen before. It appears people are talking, but they don't seem to be speaking in any language you've ever heard before." );
				System.out.println( "Would you like to sit down and \"watch TV\" for a few minutes or continue \"forward\" or \"backward\"?" );
				System.out.print( "> " );
				choice = keyboard.nextLine();
				System.out.println();

				if ( choice.equals("watch TV") )
					nextroom = 7;
				else if ( choice.equals("back") )
					nextroom = 1;
				else if ( choice.equals("forward") )
					nextroom = 4;
				else
					System.out.println( choice + " wasn't one of the options. Try again.\n\n" );
			}
			
			// back hall, options => living room (3), bedroom1 (8), bathroom (5)
			if ( nextroom == 4 )
			{
				System.out.println( "You feel an odd fatigue slowly creeping into your body. The back hallway is dark and odd pictures line the walls." );
				System.out.println( "There is a bedroom to the \"left\" and a bathroom to the \"right\" of you." );
				System.out.print( "> " );
				choice = keyboard.nextLine();
				System.out.println();

				if ( choice.equals("left") )
					nextroom = 8;
				else if ( choice.equals("right") )
					nextroom = 5;
				else
					System.out.println( choice + " wasn't one of the options. Try again.\n\n" );
					
			}
			
			// bathroom, options => bedroom2 (6), back hall (4), entry hall (1) if remain for 5 turns
			if ( nextroom == 5 )
			{
				System.out.println( "A horrifying smell accosts your nostrils. You vomit involuntarily. Choose quickly...\"forward\" or \"back\" before the scent becomes too much and you die." );
				System.out.print( "> " );
				choice = keyboard.nextLine();
				System.out.println();

				smelly_turns++;
				// if user is in the bathroom 3 times start them over
				if ( smelly_turns >= 3 )
				{
					System.out.println( "The smell has become too much and you pass out on the bathroom floor." );
					System.out.println( "When you wake up you are no longer in the bathroom.\n\n" );
					nextroom = 1;
					smelly_turns = 0;
				}
				else
				{
					if ( choice.equals("forward") )
						nextroom = 6;
					else if ( choice.equals("back") )
						nextroom = 4;
					else
						System.out.println( choice + " wasn't one of the options. Try again.\n\n" );
				}
					
			}
			
			// bedroom2, options => bathroom (5), win (0)
			if ( nextroom == 6 )
			{
				System.out.println( "\"Who could make such a horrifying smell?\" you ask yourself as you gasp for air. Then suddenly you realize the thing that made that smell is now sleeping in the bed in front of you...Will you \"slay\" the beast or run \"back\" into that awful smell?" );
				System.out.print( "> " );
				choice = keyboard.nextLine();
				System.out.println();

				if ( choice.equals("slay") )
				{	
					nextroom = 0;
					System.out.println( "You draw your a broadsword you did not realize you had been carrying and drive it right into the heart of the beast. It squeals and writhes in pain as life slowly drains from it's body. The smell immediately vanishes and your apartment is safe once again!" );
				}
				else if ( choice.equals("back") )
					nextroom = 5;
				else 
					System.out.println( choice + " wasn't one of the options. Try again.\n\n" );
					
			}
			
			// TV, options => living room (3), entry way (1)
			if ( nextroom == 7 )
			{
				System.out.println( "You quickly realize the program you are watching is some alien transmission." );
				System.out.println( "Two human-like shapes are staring back at you tapping the camera, but the television appears to be slightly cracking. You see the remote on the coffee table. Would you like to \"change the channel\" or \"continue watching\" this odd show?" );
				System.out.print( "> " );
				choice = keyboard.nextLine();
				System.out.println();

				if ( choice.equals("change the channel") )
				{
					System.out.println( "As soon as you change the channel the draw to watch television is lost...You go back to the living room\n\n" );
					nextroom = 3;
				}
				else
				{
					System.out.println( "Suddenly the television cracks open and the two thing come bursting out! The look on you with indifference, but swiftly move and grab you with a strength you've never felt before. You pass out as you look directly into one of their eyes.\n\n" );
					nextroom = 1;
				}
			}
			
			// bedroom1, options => back hall (4), win (0)
			if ( nextroom == 8 )
			{
				System.out.println( "You are about to win the game! Do you want to \"win\" or go \"back\" and not win?" );
				System.out.print( "> " );
				choice = keyboard.nextLine();
				System.out.println();

				if ( choice.equals("win") )
					nextroom = 0;
				else if ( choice.equals("back") )
					nextroom = 4;
				else
					System.out.println( choice + " wasn't one of the options. Try again.\n\n" );
			}
		}
		
		System.out.println( "\n*********************" );
		System.out.println(   "****** YOU WIN ******" );
		System.out.println(   "*********************" );
		
	}
}