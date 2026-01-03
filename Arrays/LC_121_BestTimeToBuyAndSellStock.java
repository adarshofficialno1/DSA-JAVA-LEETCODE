// Leetcode 121 - Best Time To Buy and Sell Stock
// Approach: Track minimum price and maximum profit
// Time Complexity: O(n)
// Space complexity: O(1)

class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0; i<prices.length; i++){
            if(prices[i]<minPrice){
                minPrice = prices[i];
            }else{
                int profit = prices[i]-minPrice;
                maxProfit = Math.max(maxProfit,profit);
            }

        }
        return maxProfit;
    }
}
