class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int[] arr = new int[temperatures.length];
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < temperatures.length; i++) {

            while (!s.isEmpty() &&
                   temperatures[i] > temperatures[s.peek()]) {

                int prev = s.pop();

                arr[prev] = i - prev;
            }

            s.push(i);
        }

        return arr;
    }
}