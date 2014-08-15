import java.util.ArrayList;
import java.util.Arrays;

public class CardPlayer {
	ArrayList<Card> hand = new ArrayList<Card>();
	String name;
	
	public static void main( String[] args ) {
		CardPlayer p1 = new CardPlayer();
		Deck d = new Deck(1);
		Card c;
		
		d.shuffle();
	
		for (int i = 0; i < 5; i++ ) {
			c = d.dealCard();		
			System.out.println(c);
			p1.hand.add(c);
			System.out.println( "Player hand: " + p1.hand );
		}
		
// Testing clearHand
// 		ArrayList<Card> return_to_deck = new ArrayList<Card>();
// 		return_to_deck = p1.clearHand();
// 		System.out.println ( "Calling .clearHand()" );
// 		System.out.println ( "Player hand: " + p1.hand );
// 		System.out.println ( "Cards to return: " + return_to_deck );
// 		
// Testing returning card to deck
// 		System.out.println( "Deck\n" + d.cards + "\nwith " + d.cards.size() );
// 		while ( return_to_deck.size() > 0 ) {
// 			c = return_to_deck.remove(0);
// 			d.cards.add(c);
// 		}		
// 		System.out.println( "Remaining cards from hand: " + return_to_deck );
// 		System.out.println( "Deck\n" + d.cards + "\nwith " + d.cards.size() );
				
		
			
	}

	public ArrayList<Card> clearHand() {
		ArrayList<Card> dump = new ArrayList<Card>();
		dump.addAll(this.hand);
		this.hand.clear();
				
		return dump;
	}
	
}