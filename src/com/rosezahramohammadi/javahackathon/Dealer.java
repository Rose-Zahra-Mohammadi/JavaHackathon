package com.rosezahramohammadi.javahackathon;

import java.util.ArrayList;

public class Dealer extends Person {

	public Dealer() {
		super();
	}

	public void draw(Deck myDeck) {
		super.draw(myDeck);
		decide(hand, myDeck);
	}

	public void hit(Deck myDeck) {
		super.hit(myDeck);
		decide(hand, myDeck);
	}
	public int decide(ArrayList<Card> hand, Deck myDeck) {
		int myTotal = totalCards(hand, myDeck);
		if (myTotal < 17) {
			this.hit(myDeck);
		}
		return(myTotal);
	}
	}