package com.rosezahramohammadi.javahackathon;

import java.util.ArrayList;

public class Person {
	// defining the member variables
	protected ArrayList<Card> hand = new ArrayList<Card>();
	protected int chips;
	// constructor
	public Person() {
		this.chips = 100;
	}
	// making the draw method
	public void draw(Deck myDeck){
		Card mycard = myDeck.removeCards();
		this.hand.add(mycard);
		Card mycard2 = myDeck.removeCards();
		this.hand.add(mycard2);
		mycard.showCard();
		mycard2.showCard();
	};
	// making the hit method
	public void hit(Deck myDeck) {
		Card mycard = myDeck.removeCards();
		this.hand.add(mycard);
		mycard.showCard();
	}
	// making the total method
	public int totalCards(ArrayList<Card> hand, Deck myDeck) {
		int total = 0;
		for (Card card: hand) {
			int rank = card.getRank();
			if (rank == 11 || rank ==  12 || rank == 13) {
				total += 10;
			} else {
			total += card.getRank();
		}
		}
		System.out.println(total);
		return(total);
	}
}