package leetcode.array;

public class P0189_RotateArray {

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // in case k is bigger than the array length

        reverse(nums, 0, n - 1);      // Step A: reverse the whole array
        reverse(nums, 0, k - 1);      // Step B: reverse the first k elements
        reverse(nums, k, n - 1);      // Step C: reverse the rest
    }

    // Reverses the elements of nums between index 'start' and 'end', inclusive
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    // Simple manual test to confirm it works
    public static void main(String[] args) {
        P0189_RotateArray solver = new P0189_RotateArray();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        solver.rotate(nums, k);

        for (int num : nums) {
            System.out.print(num + " ");
        }
        // Expected output: 5 6 7 1 2 3 4
    }
}
