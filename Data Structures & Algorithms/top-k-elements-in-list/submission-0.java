class Solution {

    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i])) {
                int count = map.get(nums[i]);
                map.put(nums[i], count + 1);
            } 
            else {
                map.put(nums[i], 1);
            }
        }

        // Create buckets
        List<Integer>[] bucket = new List[nums.length + 1];

        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = new ArrayList<>();
        }

        // Put numbers into their frequency bucket
        for (int num : map.keySet()) {

            int frequency = map.get(num);

            bucket[frequency].add(num);
        }

        // Get the k most frequent elements
        int[] answer = new int[k];

        int index = 0;

        for (int i = bucket.length - 1; i >= 0; i--) {

            for (int num : bucket[i]) {

                answer[index] = num;
                index++;

                if (index == k) {
                    return answer;
                }
            }
        }

        return answer;
    }
}