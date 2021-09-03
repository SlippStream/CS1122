package Week1;
import java.util.Scanner;

/** 
 * @author Nick Zimanski
 * @class CS 1122
 * @lab L01-J
 * @version 9/1/2021
 */
public class Problem05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName;

        System.out.print("What is your name? ");
        userName = scanner.nextLine();

        System.out.println("Greetings " + userName);

        scanner.close();
    }
}
