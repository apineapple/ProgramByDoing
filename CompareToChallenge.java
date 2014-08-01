public class CompareToChallenge
{
	public static void main( String[] args )
	{
		// examples less than 0
		int ex1 = "axe".compareTo("dog");
		int ex2 = "yo-yo".compareTo("zoo");
		int ex3 = "geico".compareTo("progressive");
		int ex4 = "eddie".compareTo("frank");
		int ex5 = "Ben".compareTo("Nick");
		
		// examples greater than 0
		int ex6 = "zebra".compareTo("alpha");
		int ex7 = "silly".compareTo("love song");
		int ex8 = "guitar".compareTo("drum");
		int ex9 = "dog".compareTo("cat");
		int ex10 = "sun".compareTo("moon");
		
		// examples equal to 0
		int ex11 = "bee".compareTo("bee");
		int ex12 = "waterfall".compareTo("waterfall");
		
		System.out.println( "Comparing \"axe\" with \"dog\" produces " + ex1 );
		System.out.println( "Comparing \"yo-yo\" with \"zoo\" produces " + ex2 );
		System.out.println( "Comparing \"geico\" with \"progressive\" produces " + ex3 );
		System.out.println( "Comparing \"eddie\" with \"frank\" produces " + ex4 );
		System.out.println( "Comparing \"Ben\" with \"Nick\" produces " + ex5 );

		System.out.println();

		System.out.println( "Comparing \"zebra\" with \"alpha\" produces " + ex6 );
		System.out.println( "Comparing \"silly\" with \"love song\" produces " + ex7 );
		System.out.println( "Comparing \"guitar\" with \"drum\" produces " + ex8 );
		System.out.println( "Comparing \"dog\" with \"cat\" produces " + ex9 );
		System.out.println( "Comparing \"sun\" with \"moon\" produces " + ex10 );
		
		System.out.println();
		
		System.out.println( "Comparing \"bee\" with \"bee\" produces " + ex11 );
		System.out.println( "Comparing \"waterfall\" with \"waterfall\" produces " + ex12 );
	}
}