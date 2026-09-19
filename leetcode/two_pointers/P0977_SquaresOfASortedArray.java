package leetcode.two_pointers;

public class P0977_SquaresOfASortedArray {

    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0;
        int right = n - 1;
        int resultIndex = n - 1;

        while (left <= right) {
            int leftSquared = nums[left] * nums[left];
            int rightSquared = nums[right] * nums[right];

            if (leftSquared > rightSquared) {
                result[resultIndex] = leftSquared;
                left++;
            } else {
                result[resultIndex] = rightSquared;
                right--;
            }

            resultIndex--;
        }

        return result;
    }

    public static void main(String[] args) {
        P0977_SquaresOfASortedArray solver = new P0977_SquaresOfASortedArray();
        int[] nums = {-4, -1, 0, 3, 10};

        int[] result = solver.sortedSquares(nums);

        for (int num : result) {
            System.out.print(num + " ");
        }
        // Expected output: 0 1 9 16 100
    }
}
