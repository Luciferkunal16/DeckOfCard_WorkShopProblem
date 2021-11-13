package cards;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;



public class RandomCards {
	static String[] suit = { "Spades", "Hearts", "Diamond", "Clubs" };
	static String[] rank = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
    static String[][] deckOfCards = { suit, rank };
	 static Card[] deck = new Card[52];

	static Scanner inp = new Scanner(System.in);
	static List<Player> playerList = new ArrayList<Player>();

	public static void assignCard() {
		int i = 0;
		for (String s : deckOfCards[0]) {
			for (String value : deckOfCards[1]) {
				deck[i] = new Card(s, value);
				i++;
			}
		}
	}

	public  void addPlayer(int numberOfPlayers) {

		if (numberOfPlayers <= 4 && numberOfPlayers > 2) {
			{
				System.out.println("Enter players details");
				for (int i = 0; i < numberOfPlayers; i++) {
					System.out.println("Enter first name");
					String fn = inp.next();
					System.out.println("Enter second name");
					String ln = inp.next();
					Player player = new Player(fn, ln);
					playerList.add(player);
					for (int j = 0; j < playerList.size(); j++) {
						System.out.println(playerList.get(j));
					}
				}
			}
		} else {
			System.out.println("More than 4 player not allowed");
		}
	}

	public void orderPlayerTurn(int numberOfPlayers) {
		System.out.println("Enter players order");
		for (int i = 0; i < numberOfPlayers; i++) {
			System.out.println("Order for Player "+(i+1));
			int turn = inp.nextInt();
			playerList.get(i).setPlayerTurn(turn);
		}
	}
	public void shuffleDeckOfCard() {
		Random rand = new Random();
		for (int i = 0; i < deckOfCards.length; i++) {
			String[] temporaryArray = deckOfCards[i];
			for (int j = 0; j < temporaryArray.length; j++) {
			
				int r = j + rand.nextInt(temporaryArray.length - j);
			
				String temp = temporaryArray[r];
				temporaryArray[r] = temporaryArray[j];
				temporaryArray[j] = temp;
			}
			deckOfCards[i] = temporaryArray;
		}
	}
	

	public static void main(String[] args) {
		RandomCards rv=new RandomCards()	;
		System.out.println("Enter number of players");
		int num = inp.nextInt();
		rv.shuffleDeckOfCard();
		assignCard();
		rv.addPlayer(num);
		rv.orderPlayerTurn(num);
		
	
		
	}
}