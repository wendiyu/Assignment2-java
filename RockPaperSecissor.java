/****************************************************************************
 * Created by: Wendi Yu
 * Created on: Feb 20 2019
 * Created for: ICS4U
 * This program for Rock, Paper, Scissor game
 ****************************************************************************/

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		Random range = new Random();
		
		// randomly generate computerChoice number between 1 and 3
		int computerChoice = range.nextInt(3) + 1;
		
		//properties
		
		int rock = 1;
		int paper = 2;
		int scissor = 3;
		
		// intro text
		System.out.println("Rock, paper, scissors!Enter these following number for specific; 1 (Rock)  2 (Paper) 3 (Scissors):");
		
		// user input number
		int userChoice = userInput.nextInt();
		
		if(userChoice == 1 && computerChoice == 2) {
			System.out.println("You chose rock. The computer chose paper. You lose!");
		}
		else if(userChoice == 1 && computerChoice == 3) {
			System.out.println("You chose rock. The computer chose scissors. You win!");
		}
		
		else if(userChoice == 2 && computerChoice == 3) {
			System.out.println("You chose paper. The computer chose scissors. You lose!");
		}
		else if(userChoice == 2 && computerChoice == 1) {
			System.out.println("You chose paper. The computer chose rock. You win!");
		}

		else if(userChoice == 3 && computerChoice == 1) {
			System.out.println("You chose scissors. The computer chose rock. You lose!");
		}
		else if(userChoice == 3 && computerChoice == 2) {
			System.out.println("You chose scissors. The computer chose paper. You win!");			
		}
		
		else if(userChoice == computerChoice) {
			System.out.println("You both chose the same move. It's a tie!");
		}
		// user cannot input number bigger than 3 or smaller than 1
		else {
			System.out.println("Invalid input! You only can put 1, 2, 3 to represent Rock, Paper or Scissors.");
		}
	}
}
