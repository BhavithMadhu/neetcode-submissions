class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> s = new Stack<>();
        Stack<String> r = new Stack<>();
        Stack<Integer> q = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            s.push(tokens[i]);
        }

        while (!s.isEmpty()) {
            r.push(s.pop());
        }

        while (!r.isEmpty()) {
            String x = r.pop();

            if (x.equals("+")) {
                int a = q.pop();
                int b = q.pop();
                q.push(b + a);
            }

            else if (x.equals("-")) {
                int a = q.pop();
                int b = q.pop();
                q.push(b - a);
            }

            else if (x.equals("*")) {
                int a = q.pop();
                int b = q.pop();
                q.push(b * a);
            }

            else if (x.equals("/")) {
                int a = q.pop();
                int b = q.pop();
                q.push(b / a);
            }

            else {
                int num = Integer.parseInt(x);
                q.push(num);
            }
        }

        return q.pop();
    }
}