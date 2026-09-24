class MinStack {
    Stack<Integer> s,q,r;
    public MinStack() {
        s=new Stack<>();
        q=new Stack<>();

    }
    
    public void push(int val) {
        s.push(val);
        if (q.isEmpty() || val <= q.peek()) {
            q.push(val);
        }
    }
    
    public void pop() {
        if (s.peek().equals(q.peek())) {
            q.pop();
        }
        s.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return q.peek();
    }
}
