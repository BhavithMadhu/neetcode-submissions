class Solution {
    public boolean checkInclusion(String s1, String s2) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);
        }

        for (int i = 0; i <= s2.length() - s1.length(); i++) {

            HashMap<Character, Integer> temp = new HashMap<>();

            for (int j = i; j < i + s1.length(); j++) {
                char ch = s2.charAt(j);
                temp.put(ch, temp.getOrDefault(ch, 0) + 1);
            }

            if (map.equals(temp)) {
                return true;
            }
        }

        return false;
    }
}