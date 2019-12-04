package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score=0;
		// 2.  Ask the user a question 
		JOptionPane.showMessageDialog(null, "Are you ready to take the Super Awesome Trivia Test?");
		String question1 = JOptionPane.showInputDialog("Okay, let's start with a tough one. How many hairs are on your head?");
		// 3.  Use an if statement to check if their answer is correct
		if (question1.equals("no idea")) {
			JOptionPane.showMessageDialog(null, "Correct! Now, on to the next one!");
		score++;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong!");
			score--;
		}
		// 4.  if the user's answer was correct, add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String question2 = JOptionPane.showInputDialog("Fine, that one was hard. Here's an easier one. Is the name of this class The league of amazing programmers, or the league of amazing coders? Don't look! 1 for programmers, 2 for coders.");
		// 3.  Use an if statement to check if their answer is correct
		if (question2.equals("1")) {
			JOptionPane.showMessageDialog(null, "Correct! Now, on to the next one!");
		score++;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong!");
			score--;
		}
		// 6.  After all the questions have been asked, print the user's score 
		JOptionPane.showMessageDialog(null, "Good try! Here's your score!" + score);
	}
}
