package leetcode.array;

/**
 * 0013/1000 - Missing Number
 * Difficulty: Easy
 * Pattern: Gauss Sum Formula / Math
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class P0268_MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        P0268_MissingNumber solver = new P0268_MissingNumber();

        int[] test1 = {3, 0, 1};
        int[] test2 = {0, 1};
        int[] test3 = {9, 6, 4, 2, 3, 5, 7, 0, 1};

        System.out.println("13. Array - Missing Number Test 1: " + solver.missingNumber(test1));
        System.out.println("13. Array - Missing Number Test 2: " + solver.missingNumber(test2));
        System.out.println("13. Array - Missing Number Test 3: " + solver.missingNumber(test3));
    }
}
