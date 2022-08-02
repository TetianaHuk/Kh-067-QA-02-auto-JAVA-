
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class MySwitchCalcTest3 {
    public static void main(String[] args) {
        while (true) {
            Scanner calcscanner = new Scanner(System.in);
            System.out.println("Please enter your first number: ");
            int num1 = calcscanner.nextInt();
            System.out.println("Please enter your second number: ");
            int num2=calcscanner.nextInt();
            System.out.println("Please enter the action: +, -, *, /, %");
            char action =calcscanner.next().charAt(0);
            int result;
            switch (action) {
                case '+' -> result = num1 + num2;
                case '-' -> result = num1 - num2;
                case '*' -> result = num1 * num2;
                case '/' -> {
                    if (num2 == 0) {
                        System.out.println("Sorry! You can't divide by 0!");
                    }
                    result = num1 / num2;
                }
                case '%' -> result = num1 % num2;
                default -> {
                    System.out.println("Sorry! Incorrect action!");
                    return;
                }
            }
            System.out.println("The result is: " + result);
        }
    }

}

