import java.util.Scanner;
public class MyCalcIfElseV2 {
    public static void main(String[] args) {
        Scanner New = new Scanner(System.in);
        while (true) {
            System.out.println(" Choose an action:");
            System.out.println("1. - addition");
            System.out.println("2. + Subtraction");
            System.out.println("3. * Multiplication");
            System.out.println("4. / Division");
            System.out.println("5. % Modulus");
            System.out.println("6. Exit");
            int a = New.nextInt();
            int result;
            if (a==6) {
                break;
            }
            else if ( a ==1) {
                System.out.println(" Please enter your first number: ");
                int num1=New.nextInt();
                System.out.println(" Please enter your second number: ");
                int num2=New.nextInt();
                result= num1+num2;
                System.out.println("The result is:" +result);
            }
            else if (a == 2) {
                System.out.println(" Please enter your first number: ");
                int num1=New.nextInt();
                System.out.println(" Please enter your second number: ");
                int num2=New.nextInt();
                result= num1-num2;
                System.out.println("The result is:" +result);
            }
            else if (a == 3) {
                System.out.println(" Please enter your first number: ");
                int num1=New.nextInt();
                System.out.println(" Please enter your second number: ");
                int num2=New.nextInt();
                result= num1*num2;
                System.out.println("The result is:" +result);
            }
            else if (a==4) {
                System.out.println(" Please enter your first number: ");
                int num1=New.nextInt();
                System.out.println(" Please enter your second number: ");
                int num2=New.nextInt();
                if (num2==0) {
                    System.out.println("You can't devide into 0.");
                }
                result= num1/num2;
                System.out.println("The result is:" +result);
            }
            else if (a == 5) {
                System.out.println(" Please enter your first number: ");
                int num1=New.nextInt();
                System.out.println(" Please enter your second number: ");
                int num2=New.nextInt();
                result= num1%num2;
                System.out.println("The result is:" +result);
            }
            else {
                System.out.println( "You input the unsupported operations");
            }
        }System.out.println(" The End");

    }
}
