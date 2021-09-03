package Week1;

/** 
 * @author Nick Zimanski
 * @class CS 1122
 * @lab L01-J
 * @version 9/1/2021
 */
public class Problem01 {
    final static float num1 = 4;
    final static float num2 = 3;
    public static void main(String[] args) {
        System.out.println(add(num1,num2));
        System.out.println(subtract(num1,num2));
        System.out.println(multiply(num1,num2));
        System.out.println(divide(num1,num2));
    } 

    private static float add(float a, float b) {
        return a + b;
    }

    private static float subtract(float a, float b) {
        return a - b;
    }

    private static float multiply(float a, float b) {
        return a * b;
    }

    private static float divide (float a, float b) {
        if (b == 0) throw new Error();
        return a / b;
    }
}
