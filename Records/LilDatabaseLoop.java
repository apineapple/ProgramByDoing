import java.util.Scanner;

public class LilDatabaseLoop
{
	public static void main( String[] args )
	{
		Scanner kb = new Scanner(System.in);
		Student[] s_db = new Student[3];
		
		for ( int i = 0; i < s_db.length; i++ )
		{
			s_db[i] = new Student();
			
			System.out.print( "Enter student " + (i + 1) + "'s name: " );
			s_db[i].name = kb.next();
			System.out.print( "Enter student " + (i + 1) + "'s grade: " );
			s_db[i].grade = kb.nextInt();
			System.out.print( "Enter student " + (i + 1) + "'s average: ");
			s_db[i].avg = kb.nextDouble();
			System.out.println();
		}
		
		System.out.print( "The names are: " );
		for ( int i = 0; i < 3; i++ )
			System.out.print( s_db[i].name + " " );
		System.out.println();	
		
		System.out.print( "The grades are: " );
		for ( int i = 0; i < 3; i++ )
			System.out.print( s_db[i].grade + " " );
		System.out.println();	

		System.out.print( "The averages are: " );
		for ( int i = 0; i < 3; i++ )
			System.out.print( s_db[i].avg + " " );
		System.out.println();	
	}
}