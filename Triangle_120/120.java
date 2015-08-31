public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle == null) return 0;
        int len = triangle.size();
        for(int i=len-2; i>=0; i--){
            int size = triangle.get(i).size();
            for(int j=0; j<size; j++)
                triangle.get(i).set(j,triangle.get(i).get(j)+Math.min(triangle.get(i+1).get(j),triangle.get(i+1).get(j+1))); 
        }
        return triangle.get(0).get(0);
    }
}