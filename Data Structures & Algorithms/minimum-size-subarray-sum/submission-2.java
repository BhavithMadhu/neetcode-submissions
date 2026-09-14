class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int sum = 0;
        int left = 0;
        int minCount = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            while (sum >= target) {

                int count = i - left + 1;

                if (count < minCount) {
                    minCount = count;
                }

                sum -= nums[left];
                left++;
            }
        }

        if (minCount == Integer.MAX_VALUE) {
            return 0;
        }

        return minCount;
    }
}