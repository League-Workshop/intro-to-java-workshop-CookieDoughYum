package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		
		int score=0;
		String Answer=JOptionPane.showInputDialog("What is the best movie?");
		if(Answer.equals("Star Wars 3")) {
			score++;
		}else {
			score--;
		}
		String Answer1=JOptionPane.showInputDialog("What is the tastiest food");
		if(Answer1.equals("Funnel Cake")) {
			score++;
		}else {
			score--;
		}
		String Answer2=JOptionPane.showInputDialog("What is the best color?");
		if(Answer2.equals("Blue")) {
			score++;
		}else {
			score--;
		}
		System.out.println(score);
		JOptionPane.showMessageDialog(null, "Your score is " + score );
		}
		}
		// 4.  if the user's answer is correct
		
		// -- add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
		// 6.  After all the questions have been asked, print the user's score 
		
	

