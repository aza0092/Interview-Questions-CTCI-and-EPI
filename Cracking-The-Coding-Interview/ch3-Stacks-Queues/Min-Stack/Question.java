// https://www.youtube.com/watch?v=77TNkAvT9jk

class MinStack {
    Stack<Integer> originalStack = new Stack<>();
    Stack<Integer> helperStack = new Stack<>();

    /** initialize your data structure here. */
    public MinStack() {
        
    }
    
    public void push(int x) {
        originalStack.push(x);
        if (helperStack.isEmpty() || x < helperStack.peek()) {
            helperStack.push(x);
        }
        
    }
    
    public void pop() {
        int x = originalStack.peek();
        originalStack.pop();
        if (x == helperStack.peek()) {
            helperStack.pop();
        }
        
    }
    
    public int top() {
        return originalStack.peek();
        
    }
    
    public int getMin() {
        return helperStack.peek();
        
    }
}