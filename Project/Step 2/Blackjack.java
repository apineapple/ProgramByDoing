import java.util.Scanner;
import java.util.ArrayList;

public class Blackjack{
	
	
	public static void main( String[] args ) {
		
		BlackjackPlayer dealer = new BlackjackPlayer("Dealer");
		Deck d = new Deck(1);
		Scanner kb = new Scanner(System.in);
		String user_name = "nick", choice = "";
		Boolean replay = true;
		Card c;
		int user_total, dealer_total;
		int pay_out_multiplier;
		
		
		System.out.println( "Welcome to Blackjack\n" );
 		System.out.print( "What is your name? \n> " );
 		user_name = kb.nextLine();
		BlackjackPlayer user = new BlackjackPlayer(user_name);
		
		while ( replay && user.hasMoney() ) {
		
			System.out.println( "\n********************\n*** Betting Time ***\n********************\n" );
			takeBet(user);
								
			System.out.println( "\n******************\n*** New Round ***\n******************\n" );
			initializeRound(d, user, dealer);
		
			user_total = user.findTotal();
			dealer_total = dealer.findTotal();
		
			// Check to see if either player received Blackjack
			if ( checkForBJ(user_total, dealer_total) ) {		
				pay_out_multiplier = resolveBJ(user_total, dealer_total);
				if ( pay_out_multiplier != 0 ) {
					System.out.println ( "Dealer had " + dealer.hand + "\n");	
					d = finishRound( d, user, dealer, pay_out_multiplier );
					replay = playAgain(user);
					continue;
				} else {
					pay_out_multiplier = 0;
				}
			}
			
			// To slow the text bombardment
			System.out.print( "Press enter to start your turn..." );
			kb.nextLine();
			
			// player's turn
			System.out.println( "\n*****************\n** " + user.name + "'s turn **\n*****************\n" );
			user_total = userTurn(d, user);		
		
			System.out.println( "\n" + user.name + " ends the round with " + user_total + ".\n" );


			// dealer's turn
			// dealer will only play if user has not busted			
			if ( user_total <= 21 ) { 
				// To slow the text bombardment
				System.out.print( "On to the dealer's turn..." );
				kb.nextLine();

				System.out.println( "*******************\n** " + dealer.name + "'s turn **\n*******************\n" );
				dealer_total = dealerTurn( d, dealer, user_total );
			}

			System.out.println( dealer.name + " ends the round with " + dealer_total + ".\n" );
			System.out.println( "******************\n** End of Round **\n******************\n" );

			// Determine the winner and reload the deck
			pay_out_multiplier = checkForWin( user_total, dealer_total );
			d = finishRound( d, user, dealer, pay_out_multiplier );
			
			// prompt to replay
			replay = playAgain(user);

		}
		
		if ( user.hasMoney() )
			System.out.println( "Quitting while you've still got some money, huh? Come back soon!" );
			
	}
	
	
	
	// Take a bet
	public static void takeBet(BlackjackPlayer u) { 
		int bet = 0;
		Scanner kb = new Scanner(System.in);
		String line;
		
		while ( allowedBet(bet) ) {
			System.out.println( "You currently have $" + u.showBank() );
			System.out.print ( "Place a bet...(min $5 max $100 increments of 5)\n> " );
			line = kb.nextLine();
			bet = u.wagerBet(line);
			if ( allowedBet(bet) ) 
 				System.out.println( "Invalid bet...please try again." );
 			
		}
		
		u.removeMoney(bet);
		u.bet += bet;

	}
	
	private static boolean allowedBet( int bet ) {
		return ( bet < 5 || bet > 100 || bet % 5 != 0 );
	}
	
	/** 
	 * Shuffles the deck and deals two cards to each player
	 *
	 */
	public static void initializeRound( Deck d, BlackjackPlayer u, BlackjackPlayer dealer ) {
		int i;
		
		d.shuffle();
		
// Testing win logic
// 			dealer.hand.add(new Card("A", "S", 10));
// 			dealer.hand.add(new Card("J", "S", 10));
// 			u.hand.add(new Card("A", "S", 1));
//  			u.hand.add(new Card("J", "S", 10));

		// Deals 2 cards from top of deck to the players
		for (i = 0; i < 2; i++ )
			dealer.addCard(d.dealCard()); 	
		for (i = 0; i < 2; i++ )
			u.addCard(d.dealCard());

		u.showHandAndTotal();
		System.out.println( "\n=-=-=-=-=-=-=-=-=-=-=--=-=\n\n" + dealer.name + " has [" + dealer.hand.get(0) + ", **]" );
		System.out.println( dealer.name + "'s total is hidden.\n" );
			
	}
	
	/**
	 * Used after initial deal to see if a Blackjack was dealt	
	 * This will return a payout rate of 1, 0, -1 if one was dealt 
	 * otherwise it will return 2
	 */
	public static boolean checkForBJ( int u_total, int d_total ) {
		return ( u_total == 21 || d_total == 21 );
	} 
	 
	public static int resolveBJ(int u_total, int d_total) {	
		if ( u_total == 21 && d_total != 21 ) {
			System.out.println( "*******************\n** End of Round **\n*******************\n" );
			System.out.println( "You got Blackjack! You win this round.\n" );
			return 2;
		} else if ( u_total == 21 && d_total == 21 ) {
			System.out.println( "*******************\n** End of Round **\n*******************\n" );
			System.out.println( "You both got Blackjack. The round is a draw.\n" );		
			return 1;
		} else if ( d_total == 21 ) {
			System.out.println( "*******************\n** End of Round **\n*******************\n" );
			System.out.println( "Dealer got Blackjack. You lose this round.\n" );		
			return -1;
		} else {
			return 0;
		}
	}
	
	/**
	 * Prompts user their options. Will run until user stays or busts.
	 * Returns user's final total
	 */
	public static int userTurn( Deck d, BlackjackPlayer u ) {
		int u_total = u.findTotal();
		String choice = "";
		Scanner kb = new Scanner(System.in);
		Card c;
		int phase = 1;
		
		while ( u_total <= 21 && ! choice.equalsIgnoreCase("stay") ) {
			u.showHandAndTotal();
			u.showOptions(phase);
			System.out.print( "> " );
			choice = kb.next();
		
			if ( choice.equalsIgnoreCase("hit") ) {
				c = d.dealCard();
				u_total = u.hit(c);					
			} else if ( choice.equalsIgnoreCase("double down") || choice.equalsIgnoreCase("dd") ) {
				takeBet(u);
				c = d.dealCard();
				u_total = u.hit(c);
				u.showHandAndTotal();
				choice = "stay";			
			} else if ( !choice.equalsIgnoreCase("stay") ) {
				System.out.println( "Error...please try again." );
			}	
			
			phase++;
		}
		return u_total;
	}
	
	public static int dealerTurn( Deck d, BlackjackPlayer dealer, int u_total ) {
		int d_total = dealer.findTotal();
		String choice = "";
		Card c;
			
		while ( d_total <= 21 && ! choice.equals("stay") ) {
			// Dealer will hit until it has 17 or greater
			dealer.showHandAndTotal();
			if ( d_total < 17 ) {
				if ( d_total <= u_total && u_total <= 21 ) { 
					choice = "hit";
					c = d.dealCard();
					System.out.println( "\nDealer chooses to hit.\nHe draws a " + c + ".\n" );
					dealer.addCard(c);
					d_total = dealer.findTotal();
				} else {
					choice = "stay";
					System.out.println( "Dealer stays.\n" );
				}
			} else {
				choice = "stay";
				System.out.println( "Dealer stays.\n" );
			}
		}
		
		return d_total;
	}

	/**
	 * Used at the end of the round to determine the payout rate
	 * Will return a payout rate of 1, 0, or -1
	 */ 
	public static int checkForWin(int u_total, int d_total) {
		if ( u_total <= 21 ) {
			if ( d_total <= 21 ) {
				if ( u_total > d_total ) {
					System.out.println( "You beat Dealer!\n" );
					return 2;
				} else if ( u_total == d_total ) {
					System.out.println( "You Drew.\n" );
					return 1;
				} else {
					System.out.println( "Dealer beat you\n" );
					return -1;
				}
			} else {
				System.out.println( "Dealer busted! You win!!\n" );
				return 2;
			}
		} else {
			System.out.println( "you busted\n" );
			return -1;
		}
	}
	
	/**
	 * Removes any cards from the two players hands and inserts them back into the deck
	 *
	 */
	public static Deck finishRound( Deck d, BlackjackPlayer u, BlackjackPlayer dealer,
									int multiplier ) { 
		ArrayList<Card> clean_up = new ArrayList<Card>();
		Card c;
		int winnings = u.bet * multiplier;
		
		clean_up.addAll(u.clearHand());
		clean_up.addAll(dealer.clearHand());
		while ( clean_up.size() > 0 ) {
			c = clean_up.remove(0);
			d.returnCard(c);
		}
		
		if ( winnings == u.bet ) {
			System.out.println( "Your $" + winnings + " has been returned" );
			u.addMoney( winnings );	
		} else if ( winnings > 0 ) {
			System.out.println( "You won $" + winnings );
			u.addMoney( winnings );
		} else {
			System.out.println( "You lost $" + winnings * -1 );
		}
		u.bet = 0;
		System.out.println( "You now have $" + u.showBank() + "\n" );	
		
		
		return d;
	}
	
	
	public static boolean playAgain( BlackjackPlayer u ) {
		Scanner kb = new Scanner(System.in);
		String choice;
		
		if ( u.hasMoney() ) {
			while ( true ) {
				System.out.print ( "Would you like to play again? (y/n)\n> " );
				choice = kb.next();
				if ( choice.equalsIgnoreCase("n") || choice.equalsIgnoreCase("no") )
					return false;
				else if ( choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes") )
					return true;
				else
					System.out.println( "Error...please try again." );
			}
		} else {
			System.out.println( "You're all out of money. We're cutting you off." );
			return false;
		}
	}
	
}