package leetcode.array;

/**
 * 0004/1000 - Remove Element
 * Difficulty: Easy
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class P0027_RemoveElement {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Pointer for the next non-val element
        
        for (int i = 0; i < nums.length; i++) {
            // If current element is NOT the value to remove
            if (nums[i] != val) {
                nums[k] = nums[i]; // Move it to the 'k' position
                k++; // Move the 'k' pointer forward
            }
        }
        
        return k; // k is the count of elements not equal to val
    }

    public static void main(String[] args) {
        P0027_RemoveElement solver = new P0027_RemoveElement();
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        
        int k = solver.removeElement(nums, val);
        System.out.print("4. Array - Remove Element Result: " + k + ", Array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
