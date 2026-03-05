/**
 * UC9: Recursive Palindrome Checker
 * Goal: Demonstrate divide-and-conquer using method recursion.
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "madam";

        // Initial call to recursive method: start at index 0, end at last index
        boolean result = check(input, 0, input.length() - 1);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }

    /**
     * Recursively checks whether a string is a palindrome.
     * @param s Input string
     * @param start Starting index
     * @param end Ending index
     * @return true if palindrome, otherwise false
     */
    private static boolean check(String s, int start, int end) {
        // Base Case: If pointers cross, all characters matched
        if (start >= end) {
            return true;
        }

        // Base Case: Mismatch found
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive Call: Move pointers inward
        return check(s, start + 1, end - 1);
    }
}
