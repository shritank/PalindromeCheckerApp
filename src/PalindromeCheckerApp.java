import java.util.Stack;

/**
 * UC 12: Strategy Pattern for Palindrome Algorithms
 */
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "level";

        // Inject the Stack-based strategy at runtime
        PalindromeStrategy strategy = new StackStrategy();

        // Execute the strategy
        boolean result = strategy.check(input);

        // Display results as shown in the image
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}

/**
 * Interface defining the PalindromeStrategy
 */
interface PalindromeStrategy {
    boolean check(String input);
}

/**
 * This class provides a Stack-based implementation
 * of the PalindromeStrategy interface.
 */
class StackStrategy implements PalindromeStrategy {

    /**
     * Implements palindrome validation using Stack.
     * @param input string to validate
     * @return true if palindrome, false otherwise
     */
    @Override
    public boolean check(String input) {
        // Create a stack to store characters
        Stack<Character> stack = new Stack<>();

        // Push each character of the input string onto the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare characters by popping from the stack (LIFO)
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}
