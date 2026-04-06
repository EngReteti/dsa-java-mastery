package leetcode.array;

import java.util.Arrays;

/**
 * 0006/1000 - Plus One
 * Difficulty: Easy
 * Pattern: Array Math / Carry Propagation
 */
public class P0066_PlusOne {
    public int[] plusOne(int[] digits) {
        // Iterate backwards from the last digit
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                // If we don't have a carry, we can return early
                return digits;
            }
            // If the digit is 9, it becomes 0 and the loop carries 1 to the next digit
            digits[i] = 0;
        }

        // If we reach here, it means all digits were 9 (e.g., 999 -> 1000)
        int[] newNumber = new int[digits.length + 1];
        newNumber[0] = 1;
        return newNumber;
    }

    public static void main(String[] args) {
        P0066_PlusOne solver = new P0066_PlusOne();
        
        System.out.println("Test 1 [1,2,3] -> " + Arrays.toString(solver.plusOne(new int[]{1, 2, 3})));
        System.out.println("Test 2 [4,3,2,9] -> " + Arrays.toString(solver.plusOne(new int[]{4, 3, 2, 9})));
        System.out.println("Test 3 [9,9,9] -> " + Arrays.toString(solver.plusOne(new int[]{9, 9, 9})));
    }
}
