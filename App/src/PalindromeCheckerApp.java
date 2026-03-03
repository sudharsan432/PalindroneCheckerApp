/**
 * =========================================================
 * MAIN CLASS - UseCase12PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 12: Strategy Pattern for Palindrome Algorithms
 *
 * Description:
 * This class demonstrates how different palindrome
 * validation algorithms can be selected dynamically
 * at runtime using the Strategy Design Pattern.
 *
 * At this stage, the application:
 * - Defines a common PalindromeStrategy interface
 * - Implements a concrete Stack based strategy
 * - Injects the strategy at runtime
 * - Executes the selected algorithm
 *
 * The focus is on algorithm interchangeability.
 *
 * @author Developer
 * @version 12.0
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "level";

        // Inject Stack-based strategy
        PalindromeStrategy strategy = new StackStrategy();

        // Execute selected strategy
        boolean isPalindrome = strategy.check(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}

/**
 * =========================================================
 * INTERFACE - PalindromeStrategy
 * =========================================================
 *
 * This interface defines a contract for all
 * palindrome checking algorithms.
 */
interface PalindromeStrategy {

    boolean check(String input);
}

/**
 * =========================================================
 * CLASS - StackStrategy
 * =========================================================
 *
 * Stack based implementation of PalindromeStrategy.
 */
class StackStrategy implements PalindromeStrategy {

    /**
     * Implements palindrome validation using Stack.
     *
     * @param input String to validate
     * @return true if palindrome, false otherwise
     */
    public boolean check(String input) {

        // Create a stack to store characters
        java.util.Stack<Character> stack = new java.util.Stack<>();

        // Push each character of the input string onto the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare characters by popping from the stack
        for (char c : input.toCharArray()) {

            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}