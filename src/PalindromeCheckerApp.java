/**
 * MAIN CLASS - PalindromeCheckerApp
 * UC 11: Object-Oriented Palindrome Service
 */
public class PalindromeCheckerApp {

    /**
     * Application entry point for UC11.
     * @param args Command-Line arguments
     */
    public static void main(String[] args) {
        String input = "racecar";

        // Create an instance of the service class (Encapsulation)
        PalindromeService service = new PalindromeService();

        // Invoke the encapsulated method
        boolean result = service.checkPalindrome(input);

        // Display results
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}

/**
 * Service class that contains palindrome logic.
 */
class PalindromeService {

    /**
     * Checks whether the input string is a palindrome.
     * @param input Input string
     * @return true if palindrome, false otherwise
     */
    public boolean checkPalindrome(String input) {
        // Initialize pointers
        int start = 0;
        int end = input.length() - 1;

        // Compare characters moving inward (Hint provided)
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
