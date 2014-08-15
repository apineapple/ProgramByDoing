import java.util.Scanner;

class Student
{
	String name;
	int grade;
	double avg;
}

public class BasicRecords
{
	public static void main( String[] args )
	{
		Scanner kb = new Scanner(System.in);
		Student s_one = new Student(); 
		Student s_two = new Student();
		Student s_three = new Student();
		
		System.out.print( "Enter the first student's name: " );
		s_one.name = kb.next();
		System.out.print( "Enter the first student's grade: " );
		s_one.grade = kb.nextInt();
		System.out.print( "Enter the first student's average: " );
		s_one.avg = kb.nextDouble();
		System.out.println();

		System.out.print( "Enter the second student's name: " );
		s_two.name = kb.next();
		System.out.print( "Enter the second student's grade: " );
		s_two.grade = kb.nextInt();
		System.out.print( "Enter the second student's average: " );
		s_two.avg = kb.nextDouble();
		System.out.println();

		System.out.print( "Enter the third student's name: " );
		s_three.name = kb.next();
		System.out.print( "Enter the third student's grade: " );
		s_three.grade = kb.nextInt();
		System.out.print( "Enter the third student's average: " );
		s_three.avg = kb.nextDouble();
		System.out.println();
		
		System.out.println( "The names are: " + s_one.name + " " + s_two.name + " " + s_three.name );
		System.out.println( "The grades are: " + s_one.grade + " " + s_two.grade + " " + s_three.grade );
		System.out.println( "The averages are: " + s_one.avg + " " + s_two.avg + " " + s_three.avg );
		
		System.out.println( "\nThe average for the three students is: " + ((s_one.avg + s_two.avg + s_three.avg) / 3) );
	}
}