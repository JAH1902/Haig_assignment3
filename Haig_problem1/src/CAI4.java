// Jeffrey "Alex" Haig
// COP 3330
// Professor Hollander
// 2/25/2019

// Programming Project 3 which will guide the user through a math problem

import java.security.SecureRandom;
import java.util.Scanner;
import java.lang.Math;

public class CAI4 {
	
	static int rand_1;
	static int rand_2;
	static int answer;
	static int correct = 0;
	static int incorrect = 0;
	static int difficulty;

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.printf("Please select a difficulty level (1, 2, 3, or 4) : \n");
		difficulty = scn.nextInt();
		
		// Sends the program into the logic of the project
		quiz();
		
		scn.close();

	}
	
	public static void quiz() {
		
		// Sets up the object that gets the random int
		SecureRandom rand = new SecureRandom();	
		
		// Sets the random number instance variables
		setRand1(rand.nextInt((int)Math.pow(10, difficulty)));
		setRand2(rand.nextInt((int)Math.pow(10,  difficulty)));
		setAnswer();
		
		// Sends the program to ask the question
		askQuestion();
		
	}
	
	public static void askQuestion() {
		
		// Prints out the two random integers
		System.out.printf("Solve this multiplication problem: %d * %d \n", getRand1(), getRand2());
		System.out.printf(" = ? \n");
		
		// Sends the program to read in the user's response
		readResponse();
		
	}
	
	public static void readResponse() {
		
		// Sets up the object scanner
		Scanner scan = new Scanner(System.in);
		
		// Reads in the user's input
		int response = scan.nextInt();
		
		// Passes the program off to determine if it's correct
		isAnswerCorrect(response);
		
		scan.close();
		
		
	}
	
	public static void isAnswerCorrect(int r) {
		
		// If answer is correct it will display the correct reponse
		if (r == getAnswer()) {
			
			displayCorrectResponse();
			setCorrect();
			
		}
		
		// If the answer is wrong it will display the response and will loop to the
		// beginning
		else {
			
			displayIncorrectResponse();
			setIncorrect();
			
		}
		
		// Loops back to the beginning if there have been less than ten questions
		if (incorrect + correct < 10) {
			
			quiz();
			
		}
		
		// Displays the message at the end of the 10th question
		else {
			
			displayCompletionMessage();
			
		}
	}
	
	public static void displayCorrectResponse() {
		
		// Sets up the secure random object
		SecureRandom rand = new SecureRandom();
		
		// Generates the random integer
		int p = rand.nextInt(4);
		
		// Will run until it determines a case
		switch(p) {
		
			case 0: System.out.printf("Very good! \n");
			break;
			case 1: System.out.printf("Excellent! \n");
			break;
			case 2: System.out.printf("Nice work! \n");
			break;
			case 3: System.out.printf("Keep up the good work! \n");
			break;
		
		}
		
		
	}
	
	public static void displayIncorrectResponse() {
		
		// Sets up the random object
		SecureRandom rand = new SecureRandom();
		
		// Generates the random integer
		int p = rand.nextInt(4);
		
		// Will run through until a case is found
		switch(p) {
		
			case 0: System.out.printf("No.  Please try again. \n");
			break;
			case 1: System.out.printf("Wrong.  Try once more. \n");
			break;
			case 2: System.out.printf("Don't give up! \n");
			break;
			case 3: System.out.printf("No.  Keep trying. \n");
			break;
		
		}
		
	}
	
	public static void displayCompletionMessage() {
		
		Scanner scn = new Scanner(System.in);
		
		// Calculates the percent of correct answers
		double percent = ((double)correct / (10)) * 100;
		
		// Displays the correct answers percent
		System.out.printf("You got %.1f%% of the answers correct.", percent);
		
		// Displays if the student should move on to the next level
		if ((int)percent >= 75) {
			
			System.out.printf("Congratulations, you are ready to go to the next level! \n");
			
		}
		
		// Displays if the student should seek help
		else {
			
			System.out.printf("Please ask your teacher for extra help. \n");
			
		}
		
		// Asks if there are more students to quiz
		System.out.println("Press 1 if you would like to continue, press 0 to exit");
		
		// If the user wants to exit it will end the program
		if (scn.nextInt() == 0) {
			
			System.exit(0);
			
		}
		
		// If there are more students it will loop back to the beginning
		else {
			
			correct = 0;
			incorrect = 0;
			quiz();
			
			
		}
		
		scn.close();
		
	}
	
	
	// Sets the first random instance variable
	public static void setRand1(int r) {
		
		rand_1 = r;
		
	}
	
	// Returns the first random integer
	public static int getRand1() {
		
		return rand_1;
		
	}
	
	// Sets the second random instance variable
	public static void setRand2(int r) {
		
		rand_2 = r;
		
	}
	
	//  Returns the second random integer
	public static int getRand2() {
		
		return rand_2;
		
	}
	
	// Sets the answer instance variable
	public static void setAnswer() {
		
		answer = getRand1() * getRand2();
		
	}
	
	// Returns the answer calculated answer
	public static int getAnswer() {
		
		return answer;
		
	}
	
	public static void setCorrect() {
		
		correct++;
		
	}
	
	public static void setIncorrect() {
		
		incorrect++;
		
	}

}

