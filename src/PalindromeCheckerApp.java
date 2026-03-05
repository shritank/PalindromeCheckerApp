/**
 * UC3: Palindrome Check Using String Reverse
 * @author Developer
 * @version 3.0
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // Application entry point for VC3
        String input = "madam";
        String reversed = "";

        // Hint: Iterate from the last character to the first
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        // Compares original and reversed strings
        if (input.equals(reversed)) {
            System.out.println("Result: '" + input + "' is a Palindrome.");
        } else {
            System.out.println("Result: '" + input + "' is NOT a Palindrome.");
        }
    }
}
