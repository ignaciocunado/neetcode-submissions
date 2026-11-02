class MinStack {

    Stack<Integer> s;
    Stack<Integer> minStack;

    public MinStack() {
        this.s = new Stack<>();
        this.minStack = new Stack<>();
    }
    
    public void push(int val) {
        s.push(val);

        if(! minStack.isEmpty()) {
            int currentMin = minStack.peek();
            int min = Math.min(currentMin, val);
            minStack.push(min);
        } else {
            minStack.push(val);
        }
    }
    
    public void pop() {
        s.pop();
        minStack.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
