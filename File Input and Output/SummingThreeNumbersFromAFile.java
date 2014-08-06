import java.io.File;
import java.util.Scanner;

public class SummingThreeNumbersFromAFile
{
	public static void main( String[] args ) throws Exception
	{
		String fileName = "3nums.txt";
		File txtFile = new File( fileName );
		Scanner readFile = new Scanner(txtFile);
		
		int num1, num2, num3, total;
		
		System.out.print( "Reading numbers from file \"" + fileName + "\"... " );
		
		num1 = readFile.nextInt();
		num2 = readFile.nextInt();
		num3 = readFile.nextInt();
		readFile.close();
		total = num1 + num2 + num3;
		
		System.out.println( "done.\n" );
		
		System.out.println( num1 + " + " + num2 + " + " + num3 + " = " + total );
		
	}
}