//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
		
		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
if (randomNumber == 0) {
	
	JOptionPane.showMessageDialog(null, "You look good today.");
}
else if (randomNumber == 1) {
	
	JOptionPane.showMessageDialog(null, "You did well on something that I dont know about");
}
else if (randomNumber == 2) {
	
	JOptionPane.showMessageDialog(null, "You are smart");
}
else if (randomNumber == 3) {
	
	JOptionPane.showMessageDialog(null, "Good job");
}

else if (randomNumber == 4) {
	
	JOptionPane.showMessageDialog(null, "I am running out of ideas");
}

else {
	JOptionPane.showMessageDialog(null,"I am out of ideas");
}
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
