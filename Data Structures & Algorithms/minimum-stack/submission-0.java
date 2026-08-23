class MinStack {

    Deque<Integer> stack;
    public MinStack() {
        this.stack = new ArrayDeque<>();
    }
    
    public void push(int val) {
        this.stack.push(val);
    }
    
    public void pop() {
        this.stack.pop();
    }
    
    public int top() {
        return this.stack.peek();
    }
    
    public int getMin() {
        int min = stack.peek();

        for (int num: this.stack) {
            min = Math.min(num, min);
        }

        return min;
    }
}
