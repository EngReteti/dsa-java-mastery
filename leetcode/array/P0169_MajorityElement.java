package leetcode.array;

/**
 * 0011/1000 - Majority Element
 * Difficulty: Easy
 * Pattern: Boyer-Moore Voting Algorithm
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class P0169_MajorityElement {
    public int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }

    public static void main(String[] args) {
        P0169_MajorityElement solver = new P0169_MajorityElement();

        int[] test1 = {3, 2, 3};
        int[] test2 = {2, 2, 1, 1, 1, 2, 2};

        System.out.println("11. Array - Majority Element Test 1: " + solver.majorityElement(test1));
        System.out.println("11. Array - Majority Element Test 2: " + solver.majorityElement(test2));
    }
}
