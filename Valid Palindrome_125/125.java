public class Solution {
    public boolean isPalindrome(String s) {
        if(s==null) return true;
        String newStr = s.replaceAll("[^A-Za-z0-9]+", "").toLowerCase();
        int len = newStr.length();
        for(int i=0;i<len/2;++i)
          if(newStr.charAt(i)!=newStr.charAt(len-1-i)) return false;
        
        return true;
    }
}