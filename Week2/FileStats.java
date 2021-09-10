package Week2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Nick Zimanski
 * @class CS 1122
 * @lab L01-J
 * @version 9/10/2021
 */
public class FileStats {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String line;
        String[] tokenWords, tokenChars;
        int characters = 0, lines = 0, words = 0;
        File inFile = null;

        do {
            System.out.print("Enter a filename: ");
            String filename = userInput.nextLine();
            inFile = new File(filename);
            try(Scanner fileInput = new Scanner(inFile)) {
                fileInput.useDelimiter("");
                while (fileInput.hasNextLine()) {
                    line = fileInput.nextLine();
                    tokenWords = line.split(" ");
                    tokenChars = line.split("");

                    characters += tokenChars.length;
                    words += tokenWords.length;
                    lines++;
                }
                characters += lines - 1;

                System.out.println("characters = " + characters);
                System.out.println("words = " + words);
                System.out.println("lines = " + lines);
                System.out.println("file length = " + inFile.length());
            } catch (FileNotFoundException exc) {
                System.err.println("File not found. Try Again.");
            }
        } while( !inFile.exists() );
    }
}
