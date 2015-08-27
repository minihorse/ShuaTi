public class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums==null || nums.length <= 1)
            return false;
            
        HashSet<Integer> set = new HashSet<Integer>();
        
    	for (int elem: nums){
    	    if(!set.contains(elem))
    	        set.add(elem);
    	    else
    	        return true;
    	}
    	return false;
    }
}