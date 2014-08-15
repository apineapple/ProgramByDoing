import java.util.Scanner;

public class IsItThereOrNot
{
	public static void main( String[] args )
	{
		int[] numbers = new int[10];
		int user_num;
		Scanner keyboard = new Scanner(System.in);
		boolean num_found = false;
		
		System.out.print( "Array: " );
		for ( int i = 0; i < numbers.length; i++ )
		{
			numbers[i] = 1 + (int)(Math.random() * 50);
			System.out.print( numbers[i] + " " );
		}
		System.out.println();
		
		System.out.print( "Value to find: " );
		user_num = keyboard.nextInt();
		
		for ( int i = 0; i < numbers.length; i++ )
		{
			if ( user_num == numbers[i] && ! num_found )
				num_found = true;
		}
		
		System.out.println();
		if (num_found)
			System.out.println( user_num + " is in the array." );
		else
			System.out.println( user_num + " is not in the array." );
			
	}
}
		