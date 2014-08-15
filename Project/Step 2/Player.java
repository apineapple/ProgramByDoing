import java.util.ArrayList;
public class Player {
	ArrayList<Card> hand = new ArrayList<Card>();
	String name;
	
	public static void main( String[] args ) {
		Player p1 = new Player();
		Deck d = new Deck(1);
		Card c;
		d.shuffle();
		c = d.dealCard();
		
		System.out.println(c);
		p1.hand.add(c);
		System.out.println(p1.hand);
	}

	
}