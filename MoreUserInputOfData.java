import java.util.Scanner;

public class MoreUserInputOfData
{
	public static void main( String[] args )
	{
		String first_name, last_name, login;
		int grade, student_id;
		double gpa;
		Scanner keyboard = new Scanner(System.in);
		
		// Collect information
		System.out.print( "First name: " );
		first_name = keyboard.next();
		System.out.print( "Last name: " );
		last_name = keyboard.next();
		System.out.print( "Grade (9-12): " );
		grade = keyboard.nextInt();
		System.out.print( "Student ID: " );
		student_id = keyboard.nextInt();
		System.out.print( "Login: " );
		login = keyboard.next();
		System.out.print( "GPA (0.0-4.0): " );
		gpa = keyboard.nextDouble();
		
		// Display information
		System.out.println( "Your information:" );
		System.out.println( "\tLogin: " + login );
		System.out.println( "\tID: " + student_id );
		System.out.println( "\tName: " + last_name + ", " + first_name );
		System.out.println( "\tGPA: " + gpa );
		System.out.println( "\tGrade: " + grade );
	}
}