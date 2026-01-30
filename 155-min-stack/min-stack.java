class MinStack {
    Stack<Integer> st=new Stack<>();
    Stack<Integer> s=new  Stack<>();
   
    
    public void push(int val) {
        s.push(val);

        if(st.isEmpty() || val<=st.peek())
        {
            st.push(val);
       
        } 
    }
    
    public void pop() {
        if(st.peek().equals(s.peek()))
        {
        st.pop();
        }
        s.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return st.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */