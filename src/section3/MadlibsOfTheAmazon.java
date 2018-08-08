package section3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		// Put this sentence in a pop up:
		 JOptionPane.showMessageDialog(null, "If you find yourself having to cross a piranha-infested river, here's how to do it...");
		
		// Get the user to enter an adjective
		 String Adj=JOptionPane.showInputDialog("Adj");
		// Get the user to enter a type of liquid
		 String Liq=JOptionPane.showInputDialog("Liq");
		// Get the user to enter a body part
		 String body=JOptionPane.showInputDialog("body");
		// Get the user to enter a verb
		 String Verb=JOptionPane.showInputDialog("Verb");
		// Get the user to enter a place
		 String PLace=JOptionPane.showInputDialog("Place");
		// Fit the user's words into this sentence, and save it in a String:
		 JOptionPane.showMessageDialog(null , " Piranhas are more " + Adj
				+ " during the day, so cross the river at night. "
				+ " Piranhas are attracted to fresh " + Liq + " and will most likely "
						+ " take a bite out of your " + body + " if you " + Verb + 
			" Whatever you do, if you have an open wound, try to find another way to get back to the "
		  + PLace + ". Good luck! ");
		
		// Make a pop-up for the final story. You can use \n to go to the next line
		

	}
}

