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
    int d;
    public static void main(String[] args) {
        try {
            File inFile = new File(args[0]);
            Scanner scan = new Scanner(inFile);
            while(scan.hasNextLine()) {

            }
        } catch(FileNotFoundException err) {
            System.err.println("INVALID FILE NAME");
        }
    }
}
