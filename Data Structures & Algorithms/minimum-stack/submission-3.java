class MinStack {

    Deque<Integer> stack;
    Deque<Integer> minStack;
    public MinStack() {
        this.stack = new ArrayDeque<>();
        this.minStack = new ArrayDeque<>();
    }
    
    public void push(int val) {
        this.stack.push(val);

        if (minStack.isEmpty() || minStack.peek() >= val) {
            minStack.push(val);
        }
    }
    
    public void pop() {
        int popped = this.stack.pop();

        if (!minStack.isEmpty() && minStack.peek() == popped) {
            minStack.pop();
        }
    }
    
    public int top() {
        return this.stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
