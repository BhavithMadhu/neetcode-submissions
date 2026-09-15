class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        List<Integer> list = new ArrayList<>();

        int left = 0;
        int right = arr.length - 1;

        // Find the starting position of the k closest elements
        while (right - left + 1 > k) {

            if (Math.abs(arr[left] - x) > Math.abs(arr[right] - x)) {
                left++;
            } 
            else {
                right--;
            }
        }

        // Add the remaining elements
        for (int i = left; i <= right; i++) {
            list.add(arr[i]);
        }

        return list;
    }
}