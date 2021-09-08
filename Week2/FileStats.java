package Week2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Nick Zimanski
 * @class CS 1122
 * @lab L01-J
 * @version 9/8/2021
 */
public class FileStats {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        char character;
        String line;
        String[] tokenWords, tokenChars;
        int characters = 0, lines = 0, words = 0;

        while(true) {
            System.out.print("Enter a filename: ");
            String filename = userInput.nextLine();
            File inFile = new File(filename);

            try(Scanner fileInput = new Scanner(inFile)) {
                fileInput.useDelimiter("");
                while (fileInput.hasNextLine()) {
                    line = fileInput.nextLine();
                    tokenWords = line.split(" ");

                    Scanner lineScanner = new Scanner(line);
                    lineScanner.useDelimiter("");
                    while (lineScanner.hasNext()) {
                        character = lineScanner.next().charAt(0);
                        characters++;
                        System.out.print(character);
                    }
                    lineScanner.close();

                    words += tokenWords.length;
                    lines++;
                    characters++;
                }
                if (characters > 0) characters--;

                System.out.println("characters = " + characters);
                System.out.println("words = " + words);
                System.out.println("lines = " + lines);
                System.out.println("file length = " + inFile.length());
                break;
            } catch (FileNotFoundException exc) {
                System.err.println("File not found. Try Again.");
            }
        }
    }
}
