package leetcode.array;

public class P0283_MoveZeroes {

    public void moveZeroes(int[] nums) {
        int insertPos = 0; // tracks the position for the next non-zero number

        // First pass: move all non-zero numbers to the front, in order
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[insertPos] = nums[i];
                insertPos++;
            }
        }

        // Second pass: fill the remaining positions with zeroes
        for (int i = insertPos; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    // Simple manual test to confirm it works
    public static void main(String[] args) {
        P0283_MoveZeroes solver = new P0283_MoveZeroes();
        int[] nums = {0, 1, 0, 3, 12};
        solver.moveZeroes(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
        // Expected output: 1 3 12 0 0
    }
}
