import java.sql.SQLOutput;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String RESULT = "Word(s) found: ";
        final String WRONG = "There is no proper result for your request";
        boolean check = true;
        int totalResult;
        System.out.println("Please ,type in at least three words, separated by comas and space");
        String input = sc.nextLine();
        String[] words = input.split(", ");
        while (check) {
            totalResult = 0;
            System.out.println("Chose the filter for your words:");
            System.out.println("1. Please, show the words with maximum length of symbols");
            System.out.println("2. Please, show the words, which starts with the defined letter");
            System.out.println("3. Please, show the words, which ends with the defined letter");
            System.out.println("4. Please, show the words, which contains the defined letter");
            System.out.println("0. Exit the filter");
            int filter = sc.nextInt();
            System.out.println("Filter = " + filter);
            switch (filter) {
                case 0:
                    check = false;
                    break;
                case 1:
                    System.out.println(" Please, enter the maximum word length");
                    int length = sc.nextInt();
                    System.out.println(RESULT);
                    for (int i = 0; i < words.length; i++) {
                        if (words[i].length() <= length) {
                            System.out.println(words[i]);
                            totalResult++;
                        }
                    }
                    if (totalResult == 0) {
                        System.out.println(WRONG);
                    }
                    break;
                case 2:
                    System.out.println("Please, insert the first letter");
                    String firstLetter = sc.next();
                    System.out.println(RESULT);
                    for (String f : words) {
                        if (f.startsWith(firstLetter)) {
                            System.out.println("Word found: " + f);
                            totalResult++;
                        }
                    }
                    if (totalResult == 0) {
                        System.out.println(WRONG);
                    }
                    break;
                case 3:
                    System.out.println("Please, insert the last letter");
                    String lastLetter = sc.next();
                    System.out.println(RESULT);
                    for (String l : words) {
                        if (l.endsWith(lastLetter)) {
                            System.out.println("Word found: " + l);
                            totalResult++;
                        }
                    }
                    if (totalResult == 0) {
                        System.out.println(WRONG);
                    }
                    break;
                case 4:
                    System.out.println("Please, insert any letter");
                    String anyLetter = sc.next();
                    System.out.println(RESULT);
                    for (String a : words) {
                        if (a.contains(anyLetter)) {
                            System.out.println("Word found: " + a);
                            totalResult++;
                        }
                    }
                    if (totalResult == 0) {
                        System.out.println(WRONG);
                    }
                    break;
            }
        }
        System.out.println("Thank you for using this code! Goodbye!");
    }
}

