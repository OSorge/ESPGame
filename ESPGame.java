/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: ESP Test; User guesses colors 11 times and receives a score at the end
 * Due: 09/17/2024
 * Platform/compiler: Java, Eclipse
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Owen P. Sorge__________
*/

import java.util.Scanner; // for user input
import java.util.Random; // for the random integer created during each iteration of the loop
//ESP Test; User guesses colors 11 times and receives a score at the end
public class ESPGame{
	public static void main(String[] args) {
		int score = 0;
		//Constant String literals for the colors
		final String COLOR_RED = "Red";
		final String COLOR_GREEN = "Green";
		final String COLOR_BLUE = "Blue";
		final String COLOR_ORANGE = "Orange";
		final String COLOR_YELLOW = "Yellow";
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		//user information
		System.out.print("Enter your name: ");
		String name = scan.nextLine();
		System.out.print("Describe yourself: ");
		String desc = scan.nextLine();
		System.out.print("Due Date: ");
		String due = scan.nextLine();
		System.out.println("CMSC203 Assignment1: Test your ESP skills!");
		//loop, main game
		for(int i = 0; i < 11; i++) {
			int randomInt = random.nextInt(5);
			System.out.println("Round " + (i + 1) + "\n");
			System.out.println("I am thinking of a color.");
			System.out.println("Is it Red, Green, Blue, Orange, or Yellow?");
			System.out.println("Enter your guess: ");
			String guess = scan.next();
			if(randomInt == 0) {
				System.out.println("I was thinking of red!");
				if(guess.equalsIgnoreCase(COLOR_RED)) {
					score++;
				}
			}
			if(randomInt == 1) {
				System.out.println("I was thinking of green!");
				if(guess.equalsIgnoreCase(COLOR_GREEN)) {
					score++;
				}
			}
			if(randomInt == 2) {
				System.out.println("I was thinking of blue!");
				if(guess.equalsIgnoreCase(COLOR_BLUE)) {
					score++;
				}
			}
			if(randomInt == 3) {
				System.out.println("I was thinking of orange!");
				if(guess.equalsIgnoreCase(COLOR_ORANGE)) {
					score++;
				}
			}
			if(randomInt == 4) {
				System.out.println("I was thinking of yellow!");
				if(guess.equalsIgnoreCase(COLOR_YELLOW)) {
					score++;
				}
			}
		}
		//results
		System.out.println("Game Over\n\n");
		System.out.println("You guessed " + score + " out of 11 colors correctly.");
		System.out.println("Programmer: Owen Sorge"); // programmer name
		//printed user info
		System.out.println("Student Name: " + name);
		System.out.println("User Description: " + desc);
		System.out.println("Due Date: " + due);
		System.exit(0);
	}
}