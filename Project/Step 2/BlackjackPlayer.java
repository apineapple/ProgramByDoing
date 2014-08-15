public class BlackjackPlayer extends CardPlayer {
	private int wallet;
	String name;
	
	
	BlackjackPlayer(String n) {
		this.wallet = 500;
		this.name = n;
	}

// Testing			
// 	public static void main( String[] args ) {
// 		BlackjackPlayer test1 = new BlackjackPlayer("nick");
// 		test1.hand.add(new Card("A", "S", 11));
// 		test1.hand.add(new Card("A", "C", 11));
// 		test1.hand.add(new Card("A", "H", 11));
// 		test1.hand.add(new Card("A", "D", 11));
// 		test1.hand.add(new Card("2", "S", 2));
// 		test1.hand.add(new Card("2", "C", 2));
// 		test1.hand.add(new Card("2", "H", 2));
// 		test1.hand.add(new Card("2", "D", 2));
// 		test1.hand.add(new Card("3", "S", 3));
// 		test1.hand.add(new Card("3", "C", 3));
// 		test1.hand.add(new Card("3", "H", 3));
// 		test1.hand.add(new Card("3", "D", 3));	
// 		for ( int i = 0; i < 11; i++ )
// 			test1.hand.add(new Card("A", "S", 11));
// 	
// 		test1.showHandAndTotal();
// 	}
	
	public int findTotal() {
		int i;
		int current_total = 0;
		boolean has_ace = false;
		
		for ( i = 0; i < hand.size(); i++ ) {
			if (hand.get(i).value == 11)
				has_ace = true;
				
			current_total += hand.get(i).value;
		}
		
		if (current_total > 21 && has_ace){
			for (i = 0; i < hand.size(); i++ ) {
				if (hand.get(i).value == 11)
					current_total -= 10;
				if ( current_total > 21 )
					continue;
				else
					break;
			}
		}
		return current_total;
	}

	// returns true if Player still has money to bet
	public boolean canPlay() {
		return this.wallet > 0;
	}
	
	// Displays Player's hand and Total
	public void showHandAndTotal() {
		System.out.println( this.name + " has " + this.hand );
		System.out.println( this.name + "'s total is " + this.findTotal() );
	}
	
// 	public int placeBet() {
// 		int bet;
// 		
// 		System.out.println( "\n***********************************************" );
// 		System.out.println( "Now taking bets for the next hand of blackjack." );
// 		System.out.println( "You currently have $" + this.wallet + "." );
// 		System.out.println( "***********************************************" );
// 
// 		while ( bet < 0 ) {
// 			System.out.println( "How much do you put down (Min: $5 Max: $100, increments of 5)? " );
// 			System.out.print( "> $" );
// 			bet = keyboard.nextInt();
// 			if ( bet < 5 || bet > 100 || bet > this.wallet || bet % 5 != 0) {
// 				bet = -1;
// 				System.out.println( "You cannot bet $" + bet + ". Please try again." );
// 			} else
// 				return bet;		
// 		}
// 	}
}
