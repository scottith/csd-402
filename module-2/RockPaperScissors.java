// Scott Macioce
// June 5, 2025
// CSD402 - Assignment: Rock-Paper-Scissors Game (Enhanced)
// This program simulates the Rock-Paper-Scissors game with added input validation

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        System.out.println("Welcome to Rock-Paper-Scissors!");

        while (playAgain) {
            int computerChoice = random.nextInt(3) + 1; // 1=Rock, 2=Paper, 3=Scissors
            int userChoice = 0;

            // Loop until a valid user input is entered
            while (true) {
                System.out.println("\nEnter your choice:");
                System.out.println("1 - Rock");
                System.out.println("2 - Paper");
                System.out.println("3 - Scissors");
                System.out.print("Your selection: ");

                if (input.hasNextInt()) {
                    userChoice = input.nextInt();
                    if (userChoice >= 1 && userChoice <= 3) {
                        break; // valid input
                    } else {
                        System.out.println("Invalid input. Please enter 1, 2, or 3.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a number.");
                    input.next(); // clear invalid input
                }
            }

            // Display both choices
            System.out.println("You chose: " + choiceToString(userChoice));
            System.out.println("Computer chose: " + choiceToString(computerChoice));

            // Game result logic
            if (userChoice == computerChoice) {
                System.out.println("It's a tie!");

                // Ask if the user wants to play again
                System.out.print("Do you want to play again? (yes/no): ");
                input.nextLine(); // clear newline character
                String response = input.nextLine().trim().toLowerCase();
                playAgain = response.equals("yes");
            } else if (
                (userChoice == 1 && computerChoice == 3) ||
                (userChoice == 2 && computerChoice == 1) ||
                (userChoice == 3 && computerChoice == 2)
            ) {
                System.out.println("You win!");
                playAgain = false;
            } else {
                System.out.println("Computer wins!");
                playAgain = false;
            }
        }

        System.out.println("Thanks for playing!");
        input.close();
    }

    // Converts numeric choice to a readable string
    public static String choiceToString(int choice) {
        switch (choice) {
            case 1: return "Rock";
            case 2: return "Paper";
            case 3: return "Scissors";
            default: return "Unknown";
        }
    }
}
