package leetcode.array;

import java.util.HashMap;
import java.util.Arrays;

/**
 * 0001/1000 - Two Sum
 * Difficulty: Easy
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class P0001_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // Map to store: Key = Value in array, Value = Index of that value
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // If the complement exists in our map, we found the pair
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            
            // Otherwise, put the current number in the map
            map.put(nums[i], i);
        }
        
        // Per constraints, a solution always exists, but we return empty as a fallback
        return new int[] {};
    }

    public static void main(String[] args) {
        P0001_TwoSum solver = new P0001_TwoSum();
        int[] result = solver.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println("1. Array - Two Sum Result: " + Arrays.toString(result));
    }
}
