class RecentCounter {
      class Node{
       int val; 
       Node next;
       public Node(){ }
       public Node(int val){
           this.val = val;
       }
   }
   Node head;
   Node tail;
   int headVal, tailVal;
    
    public RecentCounter() {
        
    }
    
    public int ping(int t) {
      Node add = new Node(t);
      if(tail == null){
          head = tail = add;
          tailVal++;
          return 1;
      }
      tail.next = add;
      tailVal++;
      tail = add;

    if(tail.val - head.val > 3000){
      while(tail.val - head.val>3000){
          head = head.next;
          headVal++;
      }
    }
    if(head == tail){
          headVal = 0;
          tailVal = 1;
          return 1;
    }
     return tailVal-headVal;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
