import java.util.ArrayList;

public class Deck{
	ArrayList<Card> cards = new ArrayList<Card>();
	
	public static void main(String[] args) {
		Deck test = new Deck( 1 );
		System.out.println( test.cards );
		System.out.println( test.cards.size() + " is the length of the deck" );
		
// 		Deck test2 = new Deck( 2 );
// 		System.out.println( test2.cards );
// 		System.out.println( test2.cards.size() + " is the length of two decks" );
		
		test.shuffle();
		System.out.println ( test.cards + "\nSize: " + test.cards.size());
		System.out.println ( "You have been dealt " + test.dealCard() );
		System.out.println ( "You have been dealt " + test.dealCard() );
		System.out.println ( "You have been dealt " + test.dealCard() );
		System.out.println ( "You have been dealt " + test.dealCard() );
		System.out.println ( "You have been dealt " + test.dealCard() );
		System.out.println ( "You have been dealt " + test.dealCard() );
		System.out.println ( "You have been dealt " + test.dealCard() );
		System.out.println ( test.cards + "\nSize: " + test.cards.size());
		test.shuffle();
		System.out.println ( test.cards + "\nSize: " + test.cards.size());

	}
	
	Deck( int num ) {
		String[] suits = { "\u2663", "\u2666", "\u2665", "\u2660" }; // clubs, diamonds, hearts, spades
		String[] names = { "ZERO", "A", "2", "3", "4", "5", "6", 
			"7", "8", "9", "10", "J", "Q", "K" };
			
		for ( int t = 0; t < num; t++ ){				
			for ( String s: suits ){
				for ( int v = 1; v <= 13; v++ ){
					Card c;
					if ( v > 10 ){
						c = new Card( names[v], s, 10 );
						this.cards.add(c);
					} else if ( v == 1 ) {
						c = new Card( names[v], s, 11 );
						this.cards.add(c);
					} else {
						c = new Card( names[v], s, v );
						this.cards.add( new Card(names[v], s, v) );
					}
				}
			}
		}
		
	}
	
	public void shuffle() {
		Card ph_card, ph_card2;
		int x, y;
		for ( int i = 1; i <= 1000; i++ )
		{
			x = (int)(Math.random() * cards.size() );
			y = (int)(Math.random() * cards.size() );
			if ( x == y ) {
				i--;
				continue;
			}
				
				// System.out.println( d.cards );
				ph_card = cards.get(x);
				cards.set(x, cards.get(y));
				// System.out.println( x + " became " + d.cards.get(y) );
				cards.set(y, ph_card);
				// System.out.println ( y + " became " + ph_card );
				
		}
	}
	
 	public Card dealCard() {
// 		int x = (int)(Math.random() * cards.size() );
 		return cards.remove(0);
 	}
			
}	