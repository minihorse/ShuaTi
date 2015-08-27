public class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0, temp = 0;
        int len = prices.length;
        if(prices == null || len<=1){
            return 0;
        }
        int[] arrayA = new int[len];
        int minElement = prices[0];
        for(int i=1; i<len; ++i){
            arrayA[i] = Math.max(arrayA[i-1], prices[i]-minElement);
            minElement = Math.min(prices[i], minElement);
        }
        int maxElement = prices[len-1];
        for(int i=len-2; i>=0; --i){
            maxElement = Math.max(maxElement,prices[i]);
            temp = Math.max(temp, maxElement-prices[i]);
            profit = Math.max(profit,arrayA[i]+temp);
            }
        return profit;
        
    }
}