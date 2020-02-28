// Jeffrey "Alex" Haig
// COP 3330
// Professor Hollander
// 2/25/2019

// Programming Project 3 which will guide the user through a math problem

import java.security.SecureRandom;
import java.util.Scanner;

public class CAI2 {
	
	static int rand_1;
	static int rand_2;
	static int answer;

	public static void main(String[] args) {
		
		// Sends the program into the logic of the project
		quiz();

	}
	
	public static void quiz() {
		
		// Sets up the object that gets the random int
		SecureRandom rand = new SecureRandom();
		
		// Sets the random number instance variables
		setRand1(rand.nextInt(10));
		setRand2(rand.nextInt(10));
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
			
		}
		
		// If the answer is wrong it will display the response and will loop to the
		// beginning
		else {
			
			displayIncorrectResponse();
			
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
		
		// Loops back to reading the user response
		readResponse();
		
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

}
