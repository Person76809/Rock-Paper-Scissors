import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int computerScore = 0;
        int playerScore = 0;

        System.out.println("Welcome to Rock, Paper, Scissors!");

        while (true) {
            System.out.println("Enter your choice (1 for Rock, 2 for Paper, 3 for Scissors):");
            int playerChoice = scanner.nextInt();

            if (playerChoice < 1 || playerChoice > 3) {
                System.out.println("Invalid choice! Try again.");
                continue;
            }

            int computerChoice = random.nextInt(3) + 1;
            System.out.println("The computer chooses " + getChoiceString(computerChoice));

            if (playerChoice == computerChoice) {
                System.out.println("It's a tie!");
            } else if (playerChoice == 1 && computerChoice == 3 ||
                       playerChoice == 2 && computerChoice == 1 ||
                       playerChoice == 3 && computerChoice == 2) {
                System.out.println("You win!");
                playerScore++;
            } else {
                System.out.println("You lose!");
                computerScore++;
            }

            System.out.println("Player score: " + playerScore);
            System.out.println("Computer score: " + computerScore);

            System.out.println("Do you want to play again? (Y/N)");
            String playAgain = scanner.next();

            if (playAgain.equalsIgnoreCase("N")) {
                break;
            }
        }

        System.out.println("Thanks for playing Rock, Paper, Scissors!");
    }

    public static String getChoiceString(int choice) {
        switch (choice) {
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            case 3:
                return "Scissors";
            default:
                return "Invalid choice";
        }
    }
}
