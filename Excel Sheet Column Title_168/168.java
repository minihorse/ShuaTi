public class Solution {
    public String convertToTitle(int n) {
        StringBuilder title = new StringBuilder();
        while(n>0){
            n -= 1;
            char ch = (char) (n%26 +'A');
            title.append(ch);
            n /= 26;
        }
        title.reverse();
        return title.toString();
    }
}