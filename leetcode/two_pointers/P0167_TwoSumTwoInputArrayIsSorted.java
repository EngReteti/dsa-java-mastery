package leetcode.two_pointers;

public class P0167_TwoSumTwoInputArrayIsSorted {

    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[] { left + 1, right + 1 };
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[] {};
    }

    public static void main(String[] args) {
        P0167_TwoSumTwoInputArrayIsSorted solver = new P0167_TwoSumTwoInputArrayIsSorted();
        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        int[] result = solver.twoSum(numbers, target);
        System.out.println(result[0] + " " + result[1]);
        // Expected output: 1 2
    }
}
