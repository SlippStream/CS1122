package Week1;

/** 
 * @author Nick Zimanski
 * @class CS 1122
 * @lab L01-J
 * @version 9/1/2021
 */
public class Problem07 {
    public static void main(String[] args) {
        System.out.println("Pizza Area");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        for (int i = 6; i <= 16; i++) {
            System.out.println("Diameter: " + i + " inches, Area: " + (Math.PI * Math.pow((double) i /2, 2)) + " square inches");
        }
    }
}