package leetcode.two_pointers;

public class P0080_RemoveDuplicatesFromSortedArrayTwo {

    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }

        int write = 2;

        for (int read = 2; read < nums.length; read++) {
            if (nums[read] != nums[write - 2]) {
                nums[write] = nums[read];
                write++;
            }
        }

        return write;
    }

    public static void main(String[] args) {
        P0080_RemoveDuplicatesFromSortedArrayTwo solver = new P0080_RemoveDuplicatesFromSortedArrayTwo();
        int[] nums = {1, 1, 1, 2, 2, 3};

        int newLength = solver.removeDuplicates(nums);
        System.out.println(newLength);

        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
        // Expected output: 5, then 1 1 2 2 3
    }
}
