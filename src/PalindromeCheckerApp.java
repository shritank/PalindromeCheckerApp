/**
 * MAIN CLASS - PalindromeCheckerApp
 * Use Case 13: Performance Comparison
 *
 * Description:
 * This class measures and compares the execution
 * performance of palindrome validation algorithms.
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "level";

        // Uses a palindrome strategy implementation
        PalindromeStrategy strategy = new StackStrategy();

        // Capture execution start time
        long startTime = System.nanoTime();

        // Perform the validation
        boolean result = strategy.check(input);

        // Capture execution end time
        long endTime = System.nanoTime();

        // Calculate total execution duration
        long duration = endTime - startTime;

        // Displaying results as shown in the requirement
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
        System.out.println("Execution Time : " + duration + " ns");
    }
}

/**
 * Strategy interface and implementation from previous Use Case
 */
interface PalindromeStrategy {
    boolean check(String input);
}

class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        java.util.Stack<Character> stack = new java.util.Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}
