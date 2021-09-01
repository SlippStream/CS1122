package Week1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/** 
 * @author Nick Zimanski
 * @Class CS 1122
 * @Lab L01-J
 * @version 9/1/2021
 */
public class Problem10 {
    public static void main(String[] args) {

        int lineNumber = 1;
        try {
            File inFile = new File(args[0]);
            Scanner scan = new Scanner(inFile);
            while(scan.hasNextLine()) {
                System.out.println(lineNumber + " " + scan.nextLine());
                lineNumber++;
            }
            scan.close();
        } catch(FileNotFoundException err) {
            System.err.println("INVALID FILE NAME");
        } catch(ArrayIndexOutOfBoundsException err) {
            System.err.println("NO ARGUMENT PROVIDED");
        }
    }
}
