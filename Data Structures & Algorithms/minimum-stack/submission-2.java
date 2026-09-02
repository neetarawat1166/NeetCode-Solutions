class MinStack {
    Stack<Integer> s;
    Stack<Integer> t;
    public MinStack() {
       s = new Stack<>();
       t = new Stack<>();
    }
    
    public void push(int val) {
        s.push(val);
        int a= 0 ;
        if(t.isEmpty())
            t.push(val);
        else
            if(s.peek()<t.peek())
                t.push(val);
            else
            {
                a = t.peek();
                t.push(a);
            }
    }
    
    public void pop() {
        s.pop();
        t.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return t.peek();
    }
}
