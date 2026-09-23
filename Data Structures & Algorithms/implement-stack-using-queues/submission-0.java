class MyStack {
    Queue<Integer> q,s;

    public MyStack() {
        q = new LinkedList<>();
        s = new LinkedList<>();

    }
    
    public void push(int x) {
        q.offer(x);
    }
    
    public int pop() {
        int size=q.size();
        for(int i=0;i<size-1;i++){
            int k=q.poll();
            q.offer(k);
        }
        int del = q.poll();
        return del;
    }
    
    public int top() {
        int top=0;
        while(!q.isEmpty()){
            top=q.poll();
            s.offer(top);
        }
        while(!s.isEmpty()) {
        q.offer(s.poll());
    }
        return top;
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */