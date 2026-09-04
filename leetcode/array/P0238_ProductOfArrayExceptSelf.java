package leetcode.array;

public class P0238_ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n]; // this will hold our final answers

        result[0] = 1; // nothing exists before the first number, so it's 1

        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        int rightProduct = 1; // running product of everything to the right, starts at 1

        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * rightProduct;
            rightProduct = rightProduct * nums[i];
        }

        return result;
    }

    // Simple manual test to confirm it works
    public static void main(String[] args) {
        P0238_ProductOfArrayExceptSelf solver = new P0238_ProductOfArrayExceptSelf();
        int[] nums = {1, 2, 3, 4};

        int[] result = solver.productExceptSelf(nums);

        for (int num : result) {
            System.out.print(num + " ");
        }
        // Expected output: 24 12 8 6
    }
}
