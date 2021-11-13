package cards;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class RandomCards {
	static String[] suit = { "Spades", "Hearts", "Diamond", "Clubs" };
	static String[] rank = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
	static String[][] cardCombo = new String[4][13];

	static Scanner inp = new Scanner(System.in);
	static List<Player> playerList = new ArrayList<Player>();

	public static void assignCard() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				cardCombo[i][j] = suit[i] + rank[j];
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

	public static void main(String[] args) {
		RandomCards rv=new RandomCards()	;
		System.out.println("Enter number of players");
		int num = inp.nextInt();
		assignCard();
		rv.addPlayer(num);
		rv.orderPlayerTurn(num);
		
	
		
	}
}