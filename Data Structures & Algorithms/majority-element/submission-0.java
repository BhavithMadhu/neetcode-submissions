class Solution {
    public int majorityElement(int[] nums) {
        int k= nums.length;
        int n=k/2;
        int finalCount=0;
        for(int j=0;j<nums.length;j++){
            int count=0;
            for(int i=0;i<nums.length;i++){
                if(nums[j]==nums[i]){
                    count++;
                }
            }
            if(count>n){
                finalCount=nums[j];
            }
        }
        return finalCount;
        
    }
}