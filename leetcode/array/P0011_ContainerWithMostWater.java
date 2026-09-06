package leetcode.array;

public class P0011_ContainerWithMostWater {

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);
            int currentArea = width * minHeight;

            maxArea = Math.max(maxArea, currentArea);

            if (height[left] < height[right]) {
                left++; // left is shorter, so move it inward
            } else {
                right--; // right is shorter (or equal), so move it inward
            }
        }

        return maxArea;
    }

    // Simple manual test to confirm it works
    public static void main(String[] args) {
        P0011_ContainerWithMostWater solver = new P0011_ContainerWithMostWater();
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        System.out.println(solver.maxArea(height));
        // Expected output: 49
    }
}
