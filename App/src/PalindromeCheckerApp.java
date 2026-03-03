/**
 * =========================================================
 * MAIN CLASS - UseCase13PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 13: Performance Comparison
 *
 * Description:
 * This class measures and compares the execution
 * performance of palindrome validation algorithms.
 *
 * At this stage, the application:
 * - Uses a palindrome strategy implementation
 * - Captures execution start and end time
 * - Calculates total execution duration
 * - Displays benchmarking results
 *
 * This use case focuses purely on performance
 * measurement and algorithm comparison.
 *
 * @author Developer
 * @version 13.0
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "level";

        // Choose strategy (Two-pointer simple method here)
        PalindromeStrategy strategy = new TwoPointerStrategy();

        // Capture start time
        long startTime = System.nanoTime();

        boolean isPalindrome = strategy.check(input);

        // Capture end time
        long endTime = System.nanoTime();

        long executionTime = endTime - startTime;

        // Display results
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("Execution Time : " + executionTime + " ns");
    }
}

/**
 * Strategy Interface
 */
interface PalindromeStrategy {
    boolean check(String input);
}

/**
 * Two-Pointer Strategy Implementation
 */
class TwoPointerStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        int start = 0;
        int end = input.length() - 1;

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