package com.rosezahramohammadi.javahackathon;


public class TestDeck {

	public static void main(String[] args) {
		
		Deck myDeck = new Deck();
		
//		Card mycard = myDeck.removeCards();
//		
//		Person person1 = new Person();
	Player player1 = new Player();
;//		mycard.showCard();
//		int count = 0;
//		for (Card card: myDeck.getCards()) {
//			count++;
//		}
//		
//		System.out.println(count);
		player1.draw(myDeck);
		player1.totalCards(player1.hand, myDeck);
		Dealer dealer1 = new Dealer();
		dealer1.draw(myDeck);
	}
	
	}
	