class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s = new Stack<>();
        int ttlSum=0;
        for(int i=0;i<operations.length;i++){
            if (operations[i].equals("+")) {
                int a = s.pop();
                int b = s.peek();
                 s.push(a);
                 s.push(a+b);
            }
            else if(operations[i].equals("C")){
                s.pop();
            }
            else if(operations[i].equals("D")){
                int n= s.pop();
                s.push(n);
                s.push(n*2);
            }
            else{
                int num=Integer.parseInt(operations[i]);
                s.push(num);
            }

        }
        while (!s.isEmpty()) {
            ttlSum += s.pop();
        }

        return ttlSum;

    }
}