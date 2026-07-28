package leetcode.array;

import java.util.HashSet;
import java.util.Set;

/**
 * 0012/1000 - Contains Duplicate
 * Difficulty: Easy
 * Pattern: Hash Set Lookup
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class P0217_ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        
        return false;
    }

    public static void main(String[] args) {
        P0217_ContainsDuplicate solver = new P0217_ContainsDuplicate();

        int[] test1 = {1, 2, 3, 1};
        int[] test2 = {1, 2, 3, 4};

        System.out.println("12. Array - Contains Duplicate Test 1: " + solver.containsDuplicate(test1));
        System.out.println("12. Array - Contains Duplicate Test 2: " + solver.containsDuplicate(test2));
    }
}
