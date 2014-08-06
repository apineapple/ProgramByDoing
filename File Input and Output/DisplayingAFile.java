import java.io.File;
import java.util.Scanner;

public class DisplayingAFile
{
	public static void main( String[] args ) throws Exception
	{
		Scanner keyboard = new Scanner(System.in);
		String fileName, fileLine;
		
		System.out.print( "Open which file: " );
		fileName = keyboard.next();
		
		File txtFile = new File(fileName);
		Scanner readFile = new Scanner(txtFile);
		
		while (readFile.hasNext() )
		{
			fileLine = readFile.nextLine();
			System.out.println( fileLine );
		}
		readFile.close();
	}
}