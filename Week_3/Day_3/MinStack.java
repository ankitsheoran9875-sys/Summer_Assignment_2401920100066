class MinStack {
    int val;
    int min, time=0;
    MinStack next;
    MinStack head = null;
    
    public MinStack(){}
    public MinStack(int val){
     this.val = val;
     }
    
    public void push(int value) {
      MinStack m1 = new MinStack(value);

        //for minimum
        if(time == 0){
           m1.min = value;
           time = 1;
        }
        else if(head != null){
           if(value < head.min)  m1.min = value;
           else  m1.min = head.min;
        }

      m1.next = head;
      head = m1;
    }
    
    public void pop() {
      if(head != null) head = head.next;
      if(head == null) time = 0;
    }
    
    public int top() {
        if(head == null) return -1;
        return head.val;
    }
    
    public int getMin() {
       if(head == null) return -1;
       return head.min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
