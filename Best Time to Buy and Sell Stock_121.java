public class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int size = prices.length;
        for (int i = size - 1; i >=0; i--) {
            for (int j = i-1; j>=0 && prices[i] > prices[j]; j--) {
                int result = prices[i] - prices[j];
                if (result > max) {
                    max = result;
                }
            }
        }
        
        return max;
    }
}