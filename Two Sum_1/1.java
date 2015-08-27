public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] index = new int[2];
        if(nums.length < 2) return index;
        for(int i=0; i<nums.length; ++i){
            int temp = target - nums[i];
            for (int j=i+1; j<nums.length; ++j){
                if(nums[j]==temp){
                    index[0] = i+1;
                    index[1] = j+1;
                    return index;
                }
            }
        }
        return index; 
    }
}