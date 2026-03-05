import java.util.ArrayDeque;
import java.util.Deque;

/**
 * UC7: Deque-Based Optimized Palindrome Checker
 * Goal: Use Deque to compare front and rear elements.
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // Define the input string
        String input = "refer";

        // Create a Deque to store characters
        Deque<Character> deque = new ArrayDeque<>();

        // Add each character to the deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        // Flag to track palindrome result
        boolean isPalindrome = true;

        // Continue comparison while more than one element exists
        while (deque.size() > 1) {
            // Remove and compare first and last characters
            if (!deque.removeFirst().equals(deque.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        // Display result as shown in the requirement
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
