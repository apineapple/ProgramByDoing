import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;


public class HighScore
{
	public static void main( String[] args ) throws Exception
	{
		PrintWriter fileout;
		Scanner keyboard = new Scanner(System.in);
		int score;
		String name, saveFile = "highscore.txt";
		
		fileout = new PrintWriter( new FileWriter(saveFile) );
		
		System.out.println( "You got a high score!\n" );
		
		System.out.print( "Please enter your score: " );
		score = keyboard.nextInt();
		System.out.print( "Please enter your name: " );
		name = keyboard.next();
		
		fileout.println( score );
		fileout.println( name );
		fileout.close();
		
		System.out.println( "Data stored into " + saveFile + "." );
	}
}