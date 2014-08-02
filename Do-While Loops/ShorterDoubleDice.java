import java.util.Random;

public class ShorterDoubleDice
{
	public static void main( String[] args )
	{
		Random r = new Random();
		int dice1, dice2;
		
		System.out.println( "HERE COME THE DICE!\n" );
		
		do
		{
			dice1 = 1 + r.nextInt(6);
			dice2 = 1 + r.nextInt(6);
			
			System.out.println( "Roll #1: " + dice1 );
			System.out.println( "Roll #2: " + dice2 );
			System.out.println( "The total is " + (dice1 + dice2) + "\n");
		} while ( dice1 != dice2 );
	}
}		