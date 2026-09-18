package leetcode.two_pointers;

public class P0075_SortColors {

    public void sortColors(int[] nums) {
        int low = 0;
        int current = 0;
        int high = nums.length - 1;

        while (current <= high) {
            if (nums[current] == 0) {
                swap(nums, current, low);
                low++;
                current++;
            } else if (nums[current] == 2) {
                swap(nums, current, high);
                high--;
            } else {
                current++;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        P0075_SortColors solver = new P0075_SortColors();
        int[] nums = {2, 0, 2, 1, 1, 0};

        solver.sortColors(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
        // Expected output: 0 0 1 1 2 2
    }
}
