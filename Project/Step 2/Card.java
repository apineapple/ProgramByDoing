public class Card{
	int value;
	String suit;
	String name;
	
	Card( String n, String s, int v ){
		this.name = n;
		this.suit = s;
		this.value = v;
	}
	
	public String toString()
	{
		return this.name + "" + this.suit;
	}

	
	public static void main( String[] args ){
		Card test = new Card( "Ace", "Spade", 1 );
		Card test2 = new Card( "seven", "Hearts", 7 );
		
		System.out.println( test );
		System.out.println( test2 );
	}

}