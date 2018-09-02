package week_7;

import java.util.ArrayList;

import week_6.Dalek2;

public class Dalek3 {
	
	private ArrayList<String> sayings = new ArrayList<String>();
	
	public void setSayings(String[] sayings) {
		for (int i = 0; i < sayings.length; i++) {
			this.sayings.add(sayings[i]);
		}
	}
	
	public void speak() {
		int N = this.sayings.size();
		int randomSayingIndex = (int) (Math.random() * N);
		
		if (N == 0) {
			System.out.println("No utterances installed!");
		} else {
			System.out.println(this.sayings.get(randomSayingIndex));
		}
	}
	
	public void addSaying(String s) {
		this.sayings.add(s);
	}
	
	public static void main(String[] args) {

	    Dalek3 d1 = new Dalek3();
	    String[] u1 = { "Exterminate, Exterminate!", "I obey!",
	            "Exterminate, annihilate, DESTROY!", "You cannot escape.",
	            "Daleks do not feel fear.", "The Daleks must survive!" };
	    d1.setSayings(u1);

	    System.out.println("\nDalek d1 says: ");
	    for (int i = 0; i < 10; i++) {
	        d1.speak();
	    }

	    System.out.println("\nDalek d2 says: ");
	    Dalek2 d2 = new Dalek2();
	    String[] u2 = { "I obey!" };
	    d2.setSayings(u2);

	    for (int i = 0; i < 10; i++) {
	        d2.speak();
	    }

	}
	
}
