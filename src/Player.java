package cards;

import java.util.Arrays;

public class Player {
	String firstname;
	String lastName;
	int playerTurn;
	Card[] card;
	

	public Player(String firstname, String lastName) {
		this.firstname = firstname;
		this.lastName = lastName;
		this.playerTurn = 0;
	
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getPlayerTurn() {
		return playerTurn;
	}

	public void setPlayerTurn(int playerTurn) {
		this.playerTurn = playerTurn;
	}
	public Card[] getCard() {
		return card;
	}

	public void setCard(Card[] card) {
		this.card = card;
	}

	



	@Override
	public String toString() {
		return "Player [ first name= "+firstname + " Last Name = "+lastName+" Player Turn "+playerTurn+"card="	+ Arrays.toString(card) +" ]";
	}
}

