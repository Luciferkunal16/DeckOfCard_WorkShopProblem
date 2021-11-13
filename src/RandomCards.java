package cards;
public class RandomCards {
	String[] suits = { "Diamond", "Heart", "Spades", "Club" };
	String[] rank1 = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
	String[][] cardCombo = new String[4][13];

	void assignCard() {
	    for (int i = 0; i < 4; i++) {
	        for (int j = 0; j < 13; j++) {
	            cardCombo[i][j] = suits[i] + rank1[j];
	        }
	    }
}
}