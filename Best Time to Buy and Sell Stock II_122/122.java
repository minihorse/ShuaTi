public class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for(int i=0; i<prices.length; ++i){
          if(i+1<prices.length){
              if(prices[i+1]>prices[i]){
                  profit += prices[i+1]-prices[i];
              }
          }  
        }
        return profit;
    }
}