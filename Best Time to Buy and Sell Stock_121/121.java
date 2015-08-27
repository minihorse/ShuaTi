public class Solution {
    public int maxProfit(int[] prices) {
       int temp, profit = 0;
       if(prices == null){
           return profit;
       }else{
           for(int i=0;i<prices.length;++i){
               for(int j=i+1;j<prices.length;++j){
                   if(prices[j]>prices[i]){
                       temp = prices[j] - prices[i];
                       if(temp>profit){
                           profit = temp;
                       }
                   }
               }
           }
           return profit;
       } 
    }
}