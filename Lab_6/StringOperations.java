package Lab_6;
import java.util.Scanner;

public class StringOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input string and character
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0);

        changeCase(inputString);
        reverseString(inputString);
        compareStrings(inputString);
        insertString(inputString);
        convertCase(inputString);
        checkCharacter(inputString, inputChar);
        checkPalindrome(inputString);
        countWordsVowelsConsonants(inputString);
    }

    // Change the case of the string
    private static void changeCase(String str) {
        System.out.println("Case Change: " + str.toUpperCase() + " / " + str.toLowerCase());
    }

    // Reverse the string
    private static void reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str).reverse();
        System.out.println("Reversed String: " + reversed);
    }

    // Compare two strings
    private static void compareStrings(String str) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter another string for comparison: ");
        String compareString = scanner.nextLine();

        if (str.equals(compareString)) {
            System.out.println("Strings are equal.");
        } else {
            System.out.println("Strings are not equal.");
        }
    }

    // Insert one string into another string
    private static void insertString(String str) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to insert: ");
        String insertString = scanner.nextLine();

        System.out.print("Enter the position to insert: ");
        int position = scanner.nextInt();

        StringBuilder result = new StringBuilder(str);
        result.insert(position, insertString);
        System.out.println("String after insertion: " + result);
    }

    // Convert the string to upper case and lower case
    private static void convertCase(String str) {
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
    }

    // Check whether the character is present in the string and at which position
    private static void checkCharacter(String str, char ch) {
        int position = str.indexOf(ch);
        if (position != -1) {
            System.out.println("Character '" + ch + "' found at position: " + (position + 1));
        } else {
            System.out.println("Character '" + ch + "' not found in the string.");
        }
    }

    // Check whether the string is Lab_1.palindrome or not
    private static void checkPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        if (str.equals(reversed)) {
            System.out.println("String is a palindrome.");
        } else {
            System.out.println("String is not a palindrome.");
        }
    }

    // Check the number of words, vowels, and consonants in the string
    private static void countWordsVowelsConsonants(String str) {
        String[] words = str.split("\\s+");
        int wordCount = words.length;

        int vowelCount = 0;
        int consonantCount = 0;
        for (char ch : str.toLowerCase().toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
    }
}