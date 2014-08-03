import java.util.Scanner;

public class CountingMachineRevisited
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int count_from, count_to, count_by;
		
		System.out.print( "Count from: " );
		count_from = keyboard.nextInt();
		System.out.print( "Count to  : " );
		count_to = keyboard.nextInt();
		System.out.print( "Count by  : " );
		count_by = keyboard.nextInt();
		System.out.println();
		
		for ( int i = count_from; i <= count_to; i += count_by )
		{
			System.out.print( i + " " );
		}
		System.out.println();
	}
}