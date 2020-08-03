package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
	
	String age = JOptionPane.showInputDialog("How old are you?");
	int num = Integer.parseInt(age);
	if (num < 18) {
		JOptionPane.showMessageDialog(null, "No one cares what you think");
		
	}
	else {
		JOptionPane.showMessageDialog(null, "Who do you think should be the next president?");
	}
}
}
