import java.util.Stack;

/**
 * UC5: Stack-Based Palindrome Checker
 * Goal: Use Stack (LIFO) to reverse characters and validate.
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // Declare and initialize the input string
        String input = "noon";

        // Create a Stack to store characters
        Stack<Character> stack = new Stack<>();

        // Push each character of the string into the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Iterate again through original string and compare with popped characters
        for (char c : input.toCharArray()) {
            // Pop returns the last inserted character
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Display result as shown in requirements
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
