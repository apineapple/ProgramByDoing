public class BlackjackRunner{
	
	
	public static void main( String[] args ) {
		BlackjackPlayer dealer = new BlackjackPlayer();
		BlackjackPlayer human = new BlackjackPlayer();
		Deck d = new Deck(1);
		initializeGame(d, human, dealer);

		System.out.println( "You have " + human.hand );
		System.out.println( "Your total is " + human.findTotal() );
		System.out.println( "Dealer has " + dealer.hand.get(0) + " **" );
		
	}
	
	public static void initializeGame( Deck d, Player a, Player dealer ){
		int i;
		
		d.shuffle();
		for (i = 0; i < 2; i++ )
			dealer.hand.add(d.dealCard());
		for (i = 0; i < 2; i++ )
			a.hand.add(d.dealCard());
	}
	
	

}