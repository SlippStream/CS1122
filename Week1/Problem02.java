package Week1;

/** 
 * @author Nick Zimanski
 * @class CS 1122
 * @lab L01-J
 * @version 9/1/2021
 */
public class Problem02 {
    final static float billSubtotal = 18.45f;
    final static float tipPercent = 0.15f;
    final static int numberOfPeople = 3;
    public static void main(String[] args) {
        float billTotal = billSubtotal * (1 + tipPercent);
        System.out.println("Each person pays " + (billTotal / numberOfPeople));
    }
}
