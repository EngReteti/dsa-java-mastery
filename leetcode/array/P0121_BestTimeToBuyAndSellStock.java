package leetcode.array;

/**
 * 0009/1000 - Best Time to Buy and Sell Stock
 * Difficulty: Easy
 * Pattern: Single Pass / Dynamic Tracking
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class P0121_BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int minPrice = Integer.MAX_VALUE; // Track the absolute lowest price seen so far
        int maxProfit = 0;               // Track the overall maximum profit possible

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i]; // Update our baseline buy price
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice; // Record a new high profit margin
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        P0121_BestTimeToBuyAndSellStock solver = new P0121_BestTimeToBuyAndSellStock();
        
        int[] testPrices = {7, 1, 5, 3, 6, 4};
        System.out.println("9. Array - Max Stock Profit Result: " + solver.maxProfit(testPrices));
    }
}
