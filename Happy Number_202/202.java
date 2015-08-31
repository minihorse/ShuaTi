public class Solution {
    HashSet<Integer> set = new HashSet<Integer>();
    public boolean isHappy(int n) {
        if(n<=0) return false;
        if(n==1) return true;
        if(set.contains(n)) return false;
        else{
            set.add(n);
            int temp,res = 0;
            while(n!=0){
            temp = n%10;
            res += Math.pow(temp,2);
            n /= 10;
            }
        return isHappy(res);
        }
    }
}