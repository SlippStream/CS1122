package Week4;

import java.util.Scanner;

/**
 * @author Nick Zimanski
 * @version 24 September 2021
 * @class CS1122
 * @lab L01-J
 */
public class RockPaperScissorsGame {
    private final static String[] validThrows = {"Rock", "Paper", "Scissors"};

    public static void main(String[] args) {
        String userInput
                , previousUserInput = null;
        int playerScore = 0
                , computerScore = 0
                , throwResult;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Would you like to play against opponent [1] or opponent [2]: ");
        boolean isComputerDifficultyHard = keyboard.nextInt() == 1;

        do {
            System.out.print("Enter [r]ock, [p]aper, or [s]cissors (or [q]uit): ");
            userInput = keyboard.next().toLowerCase();

            //Standardizes user input
            switch (userInput) {
                case "r":
                case "rock":
                    userInput = validThrows[0];
                    break;
                case "p":
                case "paper":
                    userInput = validThrows[1];
                    break;
                case "s":
                case "scissors":
                    userInput = validThrows[2];
                    break;
                case "q":
                case "quit":
                    return;
                default:
                    userInput = null;
            }

            if (userInput == null) {
                System.err.println("Invalid input!");
                continue;
            }

            //Either throws randomly or throws what would have lost to opponent's last throw
            throwResult = isComputerDifficultyHard
                    ? determineWinner(userInput, determineComputerInput())
                    : determineWinner(userInput, previousUserInput != null
                        ? validThrows[(indexOf(previousUserInput, validThrows) + 2) % validThrows.length]
                        : determineComputerInput());
            previousUserInput = userInput;

            switch (throwResult) {
                case 1:
                    playerScore++;
                    break;
                case 2:
                    computerScore++;
                default:
                    break;
            }
        } while (playerScore < 2 && computerScore < 2);

        if (playerScore >= 2) {
            System.out.println("You win the match! " + playerScore + " to " + computerScore);
        } else {
            System.out.println("You lose the match " + playerScore + " to " + computerScore);
        }
    }

    /**
     * Generates a random throw for the computer to make
     * @return A string of either rock, paper, or scissors
     */
    private static String determineComputerInput() {
        return validThrows[(int) Math.floor(Math.random() * validThrows.length)];
    }

    /**
     * Evaluates a game state and finds a winner for the game
     * @param u A string representing the user's input
     * @param c A string representing the computer's input
     * @return An int of 0 for a tie, 1 for a player win, 2 for a computer win
     */
    private static int determineWinner(String u, String c) {
        System.out.println("You chose " + u);
        System.out.println("The computer chose " + c);
        if (u.equals(c)) {
            System.out.println("It's a tie!");
            return 0;
        }

        if (indexOf(u, validThrows) == (indexOf(c, validThrows) + 1) % validThrows.length) {
            System.out.println("You win!");
            return 1;
        }

        System.out.println("You lose!");
        return 2;
    }

    /**
     * Finds the index of a string element in a given array
     * @param element An element to find the index of
     * @param array The array to search
     * @return The index of the element in the array, or -1 if not found
     */
    private static int indexOf(String element, String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(element)) return i;
        }
        return -1;
    }

}
