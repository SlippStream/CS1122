package Week4;

import java.util.Locale;
import java.util.Scanner;

public class RockPaperScissorsGame {
    final static String[] validOptions = {"Rock", "Paper", "Scissors"};
    public static void main(String[] args) {
        String userInput;
        int userInputNumber = -1, previousUserInput = -1;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Would you like to play against opponent [1] or opponent [2]: ");
        int opponentChoice = keyboard.nextInt();
        do {
            System.out.print("Enter [r]ock, [p]aper, or [s]cissors (or [q]uit): ");
            userInput = keyboard.next().toLowerCase();
            switch (userInput) {
                case "r": case "rock": userInputNumber = 0 ; break;
                case "p": case "paper": userInputNumber = 1; break;
                case "s": case "scissors": userInputNumber = 2; break;
                case "q": case "quit": return;
                default: userInput = null;
            }

            if (userInput == null) {
                System.err.println("Invalid input!");
                continue;
            }

            if (opponentChoice == 1) evaluateOpponent(userInputNumber, makeComputerChoice());
            else evaluateOpponent(userInputNumber, previousUserInput != -1 ? (previousUserInput + 2) % validOptions.length : makeComputerChoice());
            previousUserInput = userInputNumber;
        } while (userInput != "q" && userInput != "quit");
    }

    private static int makeComputerChoice() {
        return (int) Math.floor(Math.random() * validOptions.length);
    }

    private static void evaluateOpponent(int u, int c) {
        System.out.println("You chose " + validOptions[u]);
        System.out.println("The computer chose " + validOptions[c]);
        if (u == c) {
            System.out.println("It's a tie!");
            return;
        }

        if (u == (c + 1) % validOptions.length) {
            System.out.println("You win!");
            return;
        }

        System.out.println("You lose!");
    }
}
