//Write a Java program to check if a vowel is present in a string;
import java.util.Scanner;

public class VowelChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        boolean isVowelPresent = false;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                    || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                isVowelPresent = true;
                break;
            }
        }

        if (isVowelPresent) {
            System.out.println("Vowel is present in the string");
        } else {
            System.out.println("Vowel is not present in the string");
        }
    }
}
