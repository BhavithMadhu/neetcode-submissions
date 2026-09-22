
class Solution {
    public boolean isValid(String st) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < st.length(); i++) {

            if (st.charAt(i) == '(' || st.charAt(i) == '[' || st.charAt(i) == '{') {
                s.push(st.charAt(i));
            }

            else if (st.charAt(i) == ')') {
                if (s.isEmpty() || s.peek() != '(') {
                    return false;
                }
                s.pop();
            }

            else if (st.charAt(i) == ']') {
                if (s.isEmpty() || s.peek() != '[') {
                    return false;
                }
                s.pop();
            }

            else if (st.charAt(i) == '}') {
                if (s.isEmpty() || s.peek() != '{') {
                    return false;
                }
                s.pop();
            }
        }

        return s.isEmpty();
    }
}