import java.util.Scanner;

public class BlackjackRunner{
	
	
	public static void main( String[] args ) {
		
		BlackjackPlayer dealer = new BlackjackPlayer("Dealer");
		Deck d = new Deck(1);
		Scanner kb = new Scanner(System.in);
		String user_name = "nick", choice = "";
		Boolean replay = true;
		Card c;
		int user_total, dealer_total;
		
		System.out.println( "Welcome to Blackjack\n" );
// 		System.out.print( "What is your name? \n> " );
// 		user_name = kb.nextLine();
		BlackjackPlayer user = new BlackjackPlayer(user_name);
		
		initializeGame(d, user, dealer);
		
		user_total = user.findTotal();
		dealer_total = dealer.findTotal();
		
		if ( checkForBJ(user_total) && ! checkForBJ(dealer_total) ) {
			System.out.println( "You got Blackjack!" );
			System.exit(0);
		} else if ( checkForBJ(user_total) && checkForBJ(dealer_total) ) {
			System.out.println( "You both got Blackjack." );
			System.exit(0);
		} else if ( checkForBJ(dealer_total) ) {
			System.out.println( "Dealer got Blackjack" );
			System.exit(0);
		}
	
		// player's turn
		System.out.println( "\n*****************\n** " + user.name + "'s turn **\n*****************\n" );
		while ( user_total <= 21 && ! choice.equals("stay") ) {
			System.out.println( "Would you like to \"hit\" or \"stay\"?" );
			user.showHandAndTotal();
			System.out.print( "> " );
			choice = kb.next();
		
			if ( choice.equals("hit") ) {
				c = d.dealCard();
				System.out.println( "You drew a " + c );
				user.hand.add(c);
				user_total = user.findTotal();					
			} 
			
		}
	
		
		System.out.println( "\n" + user.name + " ended the round with " + user_total + ".\n" );

		// dealer's turn
		// dealer will only play if user has not busted			
		if ( user_total <= 21 ) {
			choice = "";
			System.out.println( "*****************\n** " + dealer.name + "'s turn **\n*****************\n" );
			while ( dealer_total <= 21 && ! choice.equals("stay") ) {
				// Dealer will hit until it has 17 or greater
				dealer.showHandAndTotal();
				
				// if ( dealer_total < 17 || (dealer_total < user_total && user_total <= 21) ) { // aggressive dealer
				if ( dealer_total < 17 ) {
					choice = "hit";
					System.out.println( "Dealer chooses to hit." );
					c = d.dealCard();
					System.out.println( "He draws a " + c + "." );
					dealer.hand.add(c);
					dealer_total = dealer.findTotal();

				}
				else
				{
					choice = "stay";
					System.out.println( "Dealer stays." );
				}
			}
		}
					
		System.out.println( "\n" + dealer.name + " ended the round with " + dealer_total + ".\n" );

		if ( user_total <= 21 )
		{
			if ( dealer_total <= 21 )
			{
				if (user_total > dealer_total )
				{
					System.out.println( "You beat Dealer!" );
				}
				else if ( user_total == dealer_total )
				{
					System.out.println( "You Drew." );
				}
				else
				{
					System.out.println( "Dealer beat you" );
				}
			}
			else
			{
				System.out.println( "Dealer busted!" );
			}
		}
		else
		{
			System.out.println( "you busted" );
		}


		
		
	}
	/** 
	 * Shuffles the deck and deals two cards to each player
	 *
	 */
	public static void initializeGame( Deck d, BlackjackPlayer p, BlackjackPlayer dealer ) {
		int i;
		
		d.shuffle();
		
// Testing win logic
			dealer.hand.add(new Card("8", "S", 8));
			dealer.hand.add(new Card("J", "S", 10));
			p.hand.add(new Card("9", "S", 9));
			p.hand.add(new Card("J", "S", 10));

		// Deals 2 cards from top of deck to the players
// 		for (i = 0; i < 2; i++ )
// 			dealer.hand.add(d.dealCard());
// 	
// 		for (i = 0; i < 2; i++ )
// 			p.hand.add(d.dealCard());

		p.showHandAndTotal();
		System.out.println( dealer.name + " has [" + dealer.hand.get(0) + ", **]" );
		System.out.println( dealer.name + "'s total is hidden." );
		dealer.showHandAndTotal();
		System.out.println( "Did you get blackjack: " + checkForBJ(p.findTotal()) );
		System.out.println( "Did the dealer: " + checkForBJ(dealer.findTotal()) );

			
	}
	
	public static Boolean checkForBJ(int score) {	
		return (  score == 21 );
	}
	

}