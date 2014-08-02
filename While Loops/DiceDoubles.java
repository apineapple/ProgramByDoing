import java.util.Random;

public class DiceDoubles
{
	public static void main( String[] args )
	{
		Random r = new Random();
		int dice1 = 1 + r.nextInt(6);
		int dice2 = 1 + r.nextInt(6);
		int total_val = dice1 + dice2;
		
		System.out.println( "HERE COMES THE DICE!\n" );
		
		while ( dice1 != dice2 )
		{
			System.out.println( "Roll #1: " + dice1 );
			System.out.println( "Roll #2: " + dice2 );
			System.out.println( "The total is " + total_val + "!" );
			dice1 = 1 + r.nextInt(6);
			dice2 = 1 + r.nextInt(6);
		}
		
		System.out.println( "Roll #1: " + dice1 );
		System.out.println( "Roll #2: " + dice2 );
		System.out.println( "The total is " + total_val + "!" );
	}
}