package leetcode.array;

public class P0042_TrappingRainWater {

    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int totalWater = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left]; // new tallest wall on the left, no water trapped here
                } else {
                    totalWater += leftMax - height[left]; // water trapped above this bar
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    totalWater += rightMax - height[right];
                }
                right--;
            }
        }

        return totalWater;
    }

    // Simple manual test to confirm it works
    public static void main(String[] args) {
        P0042_TrappingRainWater solver = new P0042_TrappingRainWater();
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};

        System.out.println(solver.trap(height));
        // Expected output: 6
    }
}
