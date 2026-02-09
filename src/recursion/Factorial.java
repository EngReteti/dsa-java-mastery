package recursion;

/**
 * Introduction to Recursion
 * Logic: A method that calls itself with a simpler version of the problem.
 */
public class Factorial {
    public static int calculate(int n) {
        // 1. BASE CASE: The exit strategy to prevent StackOverflow
        if (n <= 1) {
            return 1;
        }
        
        // 2. RECURSIVE STEP: The function calls itself
        // This builds up the Call Stack until the base case is hit.
        return n * calculate(n - 1);
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println("Factorial of " + number + " is: " + calculate(number));
    }
}

