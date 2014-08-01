public class ElseAndIf
{
	public static void main( String[] args )
	{
		int people = 30;
		int cars = 40;
		int buses = 15;
		
		// 1. else if is allowing a chain of if statements that will occur if the one
		//		previous to it failed the logic test. else will trigger if none of the
		//		if statements passed the logic test
		// 2. When the 'else' is removed from 'else if' it creates a new if test that will
		//		run regardless of a previous true if
		
		if ( cars > people )
		{
			System.out.println( "We should take the cars." );
		}
		else if ( cars < people )
		{
			System.out.println( "We should not take the cars." );
		}
		else
		{
			System.out.println( "We can't decide." );
		}
		
		if ( buses > cars )
		{
			System.out.println( "That's too many buses." );
		}
		else if ( buses < cars )
		{
			System.out.println( "Maybe we could take the buses." );
		}
		else
		{
			System.out.println( "We still can't decide." );
		}
		
		if ( people > buses )
		{
			System.out.println( "All right, let's just take the buses." );
		}
		else
		{
			System.out.println( "Find, let's stay home then." );
		}
	}
}