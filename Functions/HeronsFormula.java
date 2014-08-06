// 1. Both files output the same results
// 2. This file is 30 lines, the non-function one is 50
// 3. It was much easier to fix the error on this file because it was only
//		in one place. 

public class HeronsFormula
{
	public static void main( String[] args )
	{
		double a;
		
		a = triangleArea(3, 3, 3);
		System.out.println("A triangle with sides 3,3,3 has an area of " + a );

		a = triangleArea(3, 4, 5);
		System.out.println("A triangle with sides 3,4,5 has an area of " + a );
 
		a = triangleArea(7, 8, 9);
		System.out.println("A triangle with sides 7,8,9 has an area of " + a );

		System.out.println("A triangle with sides 5,12,13 has an area of " + triangleArea(5, 12, 13) );
		System.out.println("A triangle with sides 10,9,11 has an area of " + triangleArea(10, 9, 11) );
		System.out.println("A triangle with sides 8,15,17 has an area of " + triangleArea(8, 15, 17) );
		System.out.println( "A triangle with sides 9, 9 , 9 has an area of " + triangleArea(9, 9, 9) );
		// 4. It was not hard to add this call it only took one line. The other took 6
	}
 
	public static double triangleArea( int a, int b, int c )
	{
		// the code in this function computes the area of a triangle whose sides have lengths a, b, and c
		double s, A;

		s = (a+b+c) / 2.0;
		A = Math.sqrt( s*(s-a)*(s-b)*(s-c) );

		return A;
		// ^ after computing the area, "return" it
	}
}
