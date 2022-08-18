import java.util.Scanner;
public class MyScanner {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("What is your name?");
            String name = sc.nextLine();
            System.out.println("Where do you live, " + name + "?");
            String address = sc.nextLine();
            System.out.println("Total information about user:");
            System.out.println("Name of user - " + name);
            System.out.println("Address of user - " + address);
        }
    }

