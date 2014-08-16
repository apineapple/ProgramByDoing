import java.util.Scanner;

public class BlackjackPlayer extends CardPlayer {
	private int wallet = 500;	
	
	BlackjackPlayer(String n) {
		this.wallet = 500;
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

	// returns true if Player still has money to bet
	public boolean canPlay() {
		return this.wallet > 0;
	}
		
	// Displays Player's hand and Total
	public void showHandAndTotal() {
		System.out.println( this.name + " has " + this.hand );
		System.out.println( this.name + "'s total is " + this.findTotal() );
	}
	
// 	public int makeBet() {
// 		Scanner keyboard = new Scanner(System.in);
// 		int bet = -1;
// 		boolean bError = true;
// 		
// 		while (true) {
// 			while (bError) {
// 				 try {
// 					System.out.println( "You currently have $" + this.wallet );	
// 					System.out.print( "Bet: (min 5 max 100 increment of 5)\n> " );
// 					bet = Integer.parseInt(keyboard.nextLine());
// 					bError = false;
// 
// 				} catch (Exception e) {
// 					System.out.println( "Error...please try a number.\n" );
// 				}
// 			}
// 			
// 			if ( bet < 5 || bet > 100 || bet > this.wallet || bet % 5 != 0) {
// 				System.out.println( "You cannot bet $" + bet + "...please try again.\n" );
// 				bError = true;
// 			} else
// 				return bet;		
// 		}
// 	}

	public int wagerBet() {
		Scanner kb = new Scanner(System.in);
		boolean errorCheck = true;
		int bet = this.wallet + 1;

		
		while (true) {
			System.out.print( "\n> " );
			while (errorCheck) {
				try {
					bet = Integer.parseInt(kb.nextLine());
					errorCheck = false;
				} catch (Exception e) {
					System.out.print( "Error...please try a number.\n> " );

				}
			}

			if (bet > this.wallet) {
				errorCheck = true;
				System.out.print ( "You cannot bet $" + bet + ". You only have $" + this.wallet );
			} else
				return bet;
		}
			
	}		
	
	
	public void removeMoney( int amount ) {
		this.wallet -= amount;
	}
	
	public void addMoney( int amount ) {
		this.wallet += amount;
	}
	
	public int showBank() {
		return this.wallet;
	}

// Testing findTotal to make sure A scales between 1 and 11			
 	public static void main( String[] args ) {
 		BlackjackPlayer test1 = new BlackjackPlayer("nick");
		test1.hand.add(new Card("A", "S", 11));
		test1.hand.add(new Card("A", "C", 11));
		test1.hand.add(new Card("A", "H", 11));
		test1.hand.add(new Card("A", "D", 11));
		test1.hand.add(new Card("2", "S", 2));
		test1.hand.add(new Card("2", "C", 2));
		test1.hand.add(new Card("2", "H", 2));
		test1.hand.add(new Card("2", "D", 2));
		test1.hand.add(new Card("3", "S", 3));
		test1.hand.add(new Card("3", "C", 3));
		test1.hand.add(new Card("3", "H", 3));
		test1.hand.add(new Card("3", "D", 3));	
		for ( int i = 0; i < 11; i++ )
			test1.hand.add(new Card("A", "S", 11));
	
		test1.showHandAndTotal();
		System.out.println( test1.showBank() );
		int wager = 0;
		
		while ( wager < 5 || wager > 100 || wager > test1.showBank() || wager % 5 != 0 ) {
			System.out.print ( "Place a bet... " );
			wager = test1.wagerBet();
			if ( wager < 5 || wager > 100 || wager > test1.showBank() || wager % 5 != 0) 
 				System.out.println( "You cannot bet $" + wager + "...please try again." );
 			
		}
		System.out.println( wager );
		test1.removeMoney( wager );
		System.out.println( test1.showBank() );
		test1.addMoney( wager );
		System.out.println( test1.showBank() );
		
 	}

	
}
