import java.util.Scanner;

public class BlackjackPlayer extends CardPlayer {
	public int bet;
	private int wallet;	
	
	BlackjackPlayer(String n) {
		this.wallet = 150;
		this.name = n;
	}
	
	/**
	 * Returns players hand total as int.
	 * Aces scale from 11 to 1 if hand total is greater than 21
	 * 
	 */ 
	
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

		
	// Displays Player's hand and Total
	public void showHandAndTotal() {
		System.out.println( this.name + " has " + this.hand );
		System.out.println( this.name + "'s total is " + this.findTotal() );
	}
	
	public int wagerBet(String s) {
		boolean errorCheck = true;
		int bet = this.wallet + 1;

		
			while (errorCheck) {
				try {
					bet = Integer.parseInt(s);
					errorCheck = false;
				} catch (Exception e) {
					System.out.println( "Error...please try a number." );
					return 0;

				}
			}

			if (bet > this.wallet) {
				System.out.println ( "You cannot bet $" + bet + ". You only have $" + this.wallet + "." );
				return 0;
			} else
				return bet;
			
	}		
	
	public int hit( Card c ) {
		this.addCard(c);
		System.out.println( "\nYou drew a " + c + "." );
		return this.findTotal();
	}
	
	public void removeMoney( int amount ) {
		this.wallet -= amount;
	}
	
	public void addMoney( int amount ) {
		this.wallet += amount;
	}

	public boolean hasMoney() {
		return this.wallet > 0;
	}
	
	public int showBank() {
		return this.wallet;
	}
	
	// Should probably live in Blackjack class
	public void showOptions(int round) {
		this.standardOptions();
		
		if (round == 1) {	
			// add split if time permits
// 			if (this.hand.get(0).value == this.hand.get(1).value) {
// 				//can split
// 				System.out.print( " or \"split\"" );
// 			}
			// can double down
			System.out.print( " or \"double down\"" );
		}
		
		System.out.println( "?" );		
			
	}
	public void standardOptions() {
		System.out.print( "Would you like to \"hit\" or \"stay\"" );
	}

// Testing findTotal to make sure A scales between 1 and 11			
//  	public static void main( String[] args ) {
//  		BlackjackPlayer test1 = new BlackjackPlayer("nick");
//  		Scanner kb = new Scanner(System.in);
//  		String line;
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
// 		System.out.println( test1.showBank() );
// 		int wager = 0;
// 		// testing taking bets
// 		while ( wager < 5 || wager > 1000 || wager > test1.showBank() || wager % 5 != 0 ) {
// 			System.out.print ( "Place a bet...(min $5 max $100 increments of 5)\n> " );
// 			line = kb.nextLine();
// 			wager = test1.wagerBet(line);
// 			if ( wager < 5 || wager > 1000 || wager > test1.showBank() || wager % 5 != 0) 
//  				System.out.println( "Invalid bet...please try again." );
//  			
// 		}
// 		System.out.println( wager );
// 		test1.removeMoney( wager );
// 		System.out.println( test1.showBank() );
// 		test1.addMoney( wager );
// 		System.out.println( test1.showBank() );
// 		
//  	}
// 
// 	
// 		// Testing player options
// 		BlackjackPlayer u = new BlackjackPlayer("nick");
// 		Deck d = new Deck(1);
// 		for ( int i = 0; i < 2; i++ )
// 			u.addCard(d.dealCard());
// 
// 		int u_total = u.findTotal();
// 		String choice = "";
// 		Scanner kb = new Scanner(System.in);
// 		Card c;
// 		int phase = 1;
// 		
// 		while ( u_total <= 21 && ! choice.equalsIgnoreCase("stay") ) {
// 			u.showHandAndTotal();
// 			u.showOptions(phase);
// 			System.out.print( "> " );
// 			choice = kb.next();
// 		
// 			if ( choice.equalsIgnoreCase("hit") ) {
// 				c = d.dealCard();
// 				System.out.println( "\nYou drew a " + c + ".\n" );
// 				u.addCard(c);
// 				u_total = u.findTotal();					
// 			} else if ( choice.equalsIgnoreCase("double down") || choice.equalsIgnoreCase("dd") ) {
// 				String line;
// 				int bet;
// 				System.out.println( "Another bet..." );
// 				System.out.print( "> " );
// 				kb.nextLine();
// 				line = kb.nextLine();
// 				bet = u.wagerBet(line);
// 				u.bet += bet;
// 				c = d.dealCard();
// 				u.addCard(c);
// 				choice = "stay";
// 			
// 			} else if ( !choice.equalsIgnoreCase("stay") ) {
// 				System.out.println( "Error...please try again." );
// 			}	
// 			phase++;
// 		}
// 		System.out.println( u.bet );
// 		u.showHandAndTotal();
// 	}
// 
}
