public class Solution {
    public int maxProfit(int k, int[] prices) {
        int len = prices.length, temp = 0, profit = 0;
        if(k == 0 || prices == null || len<=1){
            return 0;
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=1; i<len; ++i){
            if(prices[i]>prices[i-1]){
                temp += prices[i]-prices[i-1];
            }else{
                list.add(temp);
                temp = 0;
            }
        }
        list.add(temp);
        Collections.sort(list);
        Collections.reverse(list);
        k = Math.min(k,list.size());
        for(int i=0; i<k; ++i){
            profit += list.get(i);
            
        } 
        return profit;
    }
}