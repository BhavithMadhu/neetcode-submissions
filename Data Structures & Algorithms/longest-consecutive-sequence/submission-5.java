
class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        int maxCount = 0;

        for (int i = 0; i < nums.length; i++) {

            if (!set.contains(nums[i] - 1)) {

                int count = 1;
                int k = 1;

                while (set.contains(nums[i] + k)) {
                    k++;
                    count++;
                }

                if (count > maxCount) {
                    maxCount = count;
                }
            }
        }

        return maxCount;
    }
}