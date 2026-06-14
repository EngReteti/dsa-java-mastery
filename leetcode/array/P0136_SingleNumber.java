package leetcode.array;

/**
 * 0010/1000 - Single Number
 * Difficulty: Easy
 * Pattern: Bit Manipulation (XOR)
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class P0136_SingleNumber {
    public int singleNumber(int[] nums) {
        int result = 0;
        
        // XOR every number in the array
        for (int num : nums) {
            result ^= num;
        }
        
        return result; // The remaining value is the unique number
    }

    public static void main(String[] args) {
        P0136_SingleNumber solver = new P0136_SingleNumber();
        
        int[] testCase1 = {2, 2, 1};
        int[] testCase2 = {4, 1, 2, 1, 2};
        
        System.out.println("10. Array - Single Number Test 1: " + solver.singleNumber(testCase1));
        System.out.println("10. Array - Single Number Test 2: " + solver.singleNumber(testCase2));
    }
}
