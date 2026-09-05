class Solution {
    public int firstMissingPositive(int[] nums) {
    HashSet<Integer> set = new HashSet<>();
    int ans=0;
    for (int i = 0; i < nums.length; i++) {
        set.add(nums[i]);
    }
    int max=nums[0];
    int min= nums[0];
    for (int i=0; i<nums.length;i++){
        if(nums[i]>max){
            max=nums[i];
        }
        if(nums[i]<min){
            min=nums[i];
        }
    }
    boolean allNegative = true;
    for (int num : set) {
        if (num > 0) {
            allNegative = false;
            break;
        }
    }  
    Arrays.sort(nums);

    if(allNegative){
        return 1;
    }

    else{
        ans = 1;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == ans) {
                    ans++;
                }
            }
    }
    return ans;
    }
}