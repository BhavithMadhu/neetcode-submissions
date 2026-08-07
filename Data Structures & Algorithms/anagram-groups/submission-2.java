class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String key= new String(arr);
            if(map.containsKey(key)){
                List<String> list= map.get(key);
                list.add(strs[i]);
            }
            else{
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(key,list);
            }
        }
        List<List<String>> answer = new ArrayList<>();

        for (List<String> list : map.values()) {
            answer.add(list);
        }

        return answer;
    }
}
