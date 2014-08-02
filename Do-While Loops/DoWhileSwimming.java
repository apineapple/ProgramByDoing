import java.util.Scanner;

public class DoWhileSwimming
{
	public static void main( String[] args ) throws Exception
	{
		Scanner keyboard = new Scanner(System.in);
		
		String swimmer1 = "GALLANT";
		String swimmer2 = "GOOFUS";
		
		double minimumTemperature = 79.0; // degress Fahrenheit
		double currentTemperature;
		double savedTemperature;
		int swimTime;
		
		System.out.print( "What is the current water temperature? " );
		currentTemperature = keyboard.nextDouble();
		// saves a copy of this value so we can get it back later
		savedTemperature = currentTemperature; 
		
		System.out.println( "\nOkay so the current water temperature is " + currentTemperature + "F." );
		System.out.println( swimmer1 + " approaches the lake...." );
		
		swimTime = 0;
		
		// 1. With the temp at 80.5 they both swim for the same amount of time
		// 2. At temp 78 GOOFUS swims for 1 min
		// 3. GALLANT checks the water before entering
		// 4. GOOFUS dives into the water and swims before checking
		// 5. While loop checks before running it, Do-While will run at least once
		// 6. While = Pre-Test Do-While = Post-Test
		
		
		while ( currentTemperature >= minimumTemperature )
		{
			System.out.print( "\t" + swimmer1 + " swims for a bit." );
			swimTime++;
			System.out.println( " Swim time: " + swimTime + " min." );
			Thread.sleep(600); // pauses for 600 milliseconds
			currentTemperature -= 0.5; // subtracts 1/2 a degree from the water temperature
			System.out.println( "\tThe current water temperature is now " + currentTemperature + "F." );
		}
		
		System.out.println( swimmer1 + " stops swimming. Total swim time: " + swimTime + " min." );
		
		currentTemperature = savedTemperature; // restores original water temperature
		
		System.out.println( "\nOkay, so the current water temperature is " + currentTemperature + "F." );
		
		swimTime = 0;
		
		do
		{
			System.out.print( "\t" + swimmer2 + " swims for a bit." );
			swimTime++;
			System.out.println( " Swim time: " + swimTime + " min." );
			Thread.sleep(600);
			currentTemperature -= 0.5;
			System.out.println( "\tThe current temperature is now " + currentTemperature + "F." );
		} while ( currentTemperature >= minimumTemperature );
		
		System.out.println( swimmer2 + " stops swimming. Total swim time: " + swimTime + " min." );
	}
}