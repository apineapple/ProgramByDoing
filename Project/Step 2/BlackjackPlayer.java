public class BlackjackPlayer extends Player {
	int total;
	
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
			i = 0;
			while (current_total > 21) {
				if (hand.get(i).value == 11)
					current_total -= 10;
				i++;
			}
		}
		return current_total;
	}

}
