import java.util.Scanner;
public class MyCalcIfElseV1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int num1;
        int num2;
        int answer;
        System.out.println("1: Addition");
        System.out.println("2: Subtraction");
        System.out.println("3: Multiplication");
        System.out.println("4: Division");
        System.out.println("5: Modulus");
        a = scanner.nextInt();
        if (a == 1) {
            System.out.println("Please enter your first number");
            num1 = scanner.nextInt();
            System.out.println("Please enter your second number");
            num2 = scanner.nextInt();
            answer = num1 + num2;
            System.out.println(answer);
        }
        if (a == 1) {
            System.out.println("Please enter your first number");
            num1 = scanner.nextInt();
            System.out.println("Please enter your second number");
            num2 = scanner.nextInt();
            answer = num1 + num2;
            System.out.println(answer);
        }
        if (a == 2) {
            System.out.println("Please enter your first number");
            num1 = scanner.nextInt();
            System.out.println("Please enter your second number");
            num2 = scanner.nextInt();
            answer = num1 - num2;
            System.out.println(answer);
        }
        if (a == 3) {
            System.out.println("Please enter your first number");
            num1 = scanner.nextInt();
            System.out.println("Please enter your second number");
            num2 = scanner.nextInt();
            answer = num1 * num2;
            System.out.println(answer);
        }
        if (a == 4) {
            System.out.println("Please enter your first number");
            num1 = scanner.nextInt();
            System.out.println("Please enter your second number");
            num2 = scanner.nextInt();
            answer = num1 / num2;
            System.out.println(answer);
        }
        if (a == 5) {
            System.out.println("Please enter your first number");
            num1 = scanner.nextInt();
            System.out.println("Please enter your second number");
            num2 = scanner.nextInt();
            answer = num1 % num2;
            System.out.println(answer);
        }
        else
            System.out.println("You input unsupported operations, please try again");
    }
}

