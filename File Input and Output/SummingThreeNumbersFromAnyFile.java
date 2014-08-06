import java.io.File;
import java.util.Scanner;

public class SummingThreeNumbersFromAnyFile
{
	public static void main( String[] args ) throws Exception
	{
		Scanner keyboard = new Scanner(System.in);
		
		String usrFile;
		int num1, num2, num3, total;
				
		System.out.print( "Which file would you like to read numbers from: " );
		usrFile = keyboard.next();

		// File reading
		File txtFile = new File(usrFile);
		Scanner readFile = new Scanner(txtFile);
				
		System.out.println( "Reading numbers from file \"" + usrFile + "\"\n" );
		
		num1 = readFile.nextInt();
		num2 = readFile.nextInt();
		num3 = readFile.nextInt();
		total = num1 + num2 + num3;
		readFile.close();
		
		System.out.println( num1 + " + " + num2 + " + " + num3 + " = " + total );
		
		
	
	}
}