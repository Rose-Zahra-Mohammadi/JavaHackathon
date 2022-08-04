package com.rosezahramohammadi.javahackathon;

import java.util.ArrayList;

import java.util.Scanner;

public class Player extends Person {

	public Player() {
		// TODO Auto-generated constructor stub
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
		if (myTotal < 21) {
			Scanner reader = new Scanner(System.in);  // Reading from System.in
			System.out.println("press 0 to stay or 1 to hit");
			int n = reader.nextInt();
		if (n == 1) {
			this.hit(myDeck);
		}
		}
		return(myTotal);
	}
}
