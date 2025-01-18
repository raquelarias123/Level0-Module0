package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int userScore = 0;
		
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
			String userInput = JOptionPane.showInputDialog(null, "What is my favorite color?");
				
				// 3.  Use an if statement to check if their answer is correct
				if (userInput.equals("red")){
					userScore++;
				}
				else {
					userScore--;
				}
			
			String userInput2 = JOptionPane.showInputDialog(null, "How many days are there in a year?");
				if (userInput2.equals("365")){
					userScore++;
				}
				else {
					userScore --;
				}

			JOptionPane.showMessageDialog(null, "Your final score is " + userScore);
				
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		
		// After all the questions have been asked, tell the user their final score 
		
	}
}
