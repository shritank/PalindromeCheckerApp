/**
 * MAIN CLASS - UseCase10PalindromeCheckerApp
 * UC 10: Normalized Palindrome Validation
 *
 * Description:
 * This class validates a palindrome after preprocessing the input string.
 * Normalization includes:
 * - Removing spaces and symbols
 * - Converting to lowercase
 */
public class PalindromeCheckerApp {

    /**
     * Application entry point for UC10.
     * @param args Command-Line arguments
     */
    public static void main(String[] args) {
        String input = "A man a plan a canal Panama";

        // Normalization: Remove all non-alphanumeric characters and convert to lowercase
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        boolean isPalindrome = true;

        // Hint: Compare characters from both ends
        for (int i = 0; i < normalized.length() / 2; i++) {
            // Compare symmetric characters
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Display results as shown in the requirement
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
