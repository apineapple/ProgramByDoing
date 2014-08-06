import java.io.File;
import java.util.Scanner;

public class SummingSeveralNumbersFromAnyFile
{
	public static void main( String[] args ) throws Exception
	{
		Scanner keyboard = new Scanner(System.in);
		String userFile;
		int num, total = 0;
		
		System.out.print( "Which file would you like to read numbers from: " );
		userFile = keyboard.next();
		
		File txtFile = new File(userFile);
		Scanner readFile = new Scanner(txtFile);
		
		System.out.println( "Reading numbers from \"" + userFile + "\"\n" );
		
		while ( readFile.hasNext() )
		{
			num = readFile.nextInt();
			total += num;
			System.out.print( num + " " );
		}
		readFile.close();
		System.out.println( "\nTotal is " + total );
	}
}