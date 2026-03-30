package leetcode.array;

/**
 * 0003/1000 - Remove Duplicates from Sorted Array
 * Difficulty: Easy
 * Time Complexity: O(n)
 * Space Complexity: O(1) - We modify the array in-place.
 */
public class P0026_RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        
        int slow = 0; // Tracks the position of unique elements
        
        for (int fast = 1; fast < nums.length; fast++) {
            // If we find a new unique element
            if (nums[fast] != nums[slow]) {
                slow++;
                nums[slow] = nums[fast]; // Move unique element to the front
            }
        }
        
        // The number of unique elements is slow + 1
        return slow + 1;
    }

    public static void main(String[] args) {
        P0026_RemoveDuplicates solver = new P0026_RemoveDuplicates();
        int[] nums = {1, 1, 2, 2, 3};
        
        int k = solver.removeDuplicates(nums);
        System.out.print("3. Array - Remove Duplicates Result: " + k + ", Array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
