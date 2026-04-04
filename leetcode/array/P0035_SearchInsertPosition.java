package leetcode.array;

/**
 * 0005/1000 - Search Insert Position
 * Difficulty: Easy
 * Time Complexity: O(log n) - Binary Search
 * Space Complexity: O(1)
 */
public class P0035_SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // Prevents potential overflow

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        // If not found, 'low' is the insertion index
        return low;
    }

    public static void main(String[] args) {
        P0035_SearchInsertPosition solver = new P0035_SearchInsertPosition();
        int[] nums = {1, 3, 5, 6};
        
        System.out.println("5. Array - Search Insert (Target 5): " + solver.searchInsert(nums, 5));
        System.out.println("5. Array - Search Insert (Target 2): " + solver.searchInsert(nums, 2));
        System.out.println("5. Array - Search Insert (Target 7): " + solver.searchInsert(nums, 7));
    }
}
