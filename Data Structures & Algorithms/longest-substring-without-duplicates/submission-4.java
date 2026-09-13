class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        int count=0;
        int maxCount=0;
        int left=0;
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            while (set.contains(s.charAt(i))) {
                set.remove(s.charAt(left));
                left++;
                count--;
            }
            set.add(s.charAt(i));
            count++;
             if(count>maxCount){
                    maxCount=count;
            }
        }
        return maxCount;
    }
}
