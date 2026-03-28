package leetcode.array;

import java.util.HashSet;

/**
 * 0002/1000 - Contains Duplicate
 * Difficulty: Easy
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class P0217_ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        // A HashSet only stores unique elements
        HashSet<Integer> seen = new HashSet<>();
        
        for (int num : nums) {
            // If the set already contains the number, it's a duplicate
            if (seen.contains(num)) {
                return true;
            }
            // Otherwise, add it to the set
            seen.add(num);
        }
        
        return false;
    }

    public static void main(String[] args) {
        P0217_ContainsDuplicate solver = new P0217_ContainsDuplicate();
        
        int[] test1 = {1, 2, 3, 1};
        int[] test2 = {1, 2, 3, 4};
        
        System.out.println("2. Array - Contains Duplicate (Test 1): " + solver.containsDuplicate(test1));
        System.out.println("2. Array - Contains Duplicate (Test 2): " + solver.containsDuplicate(test2));
    }
}
