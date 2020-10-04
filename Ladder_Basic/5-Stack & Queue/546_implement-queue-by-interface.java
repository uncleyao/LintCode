interface InterfaceQueue {
    void push(int element);

    // define an interface for pop method
    /* write your code here */
    int pop();

    // define an interface for top method
    /* write your code here */
    int top();
}

class Node {
    public int val;
    // next 是下一个进的
    //prev是上一个进
    public Node next, prev;
    public Node(int _val) {
        val = _val;
        next = prev = null;
    }
    
}


public class MyQueue implements InterfaceQueue {
    /* you can declare your private attributes here */
    public Node first, last;
    
    public MyQueue() {
       // do initialization if necessary
    }

    // implement the push method
    /* write your code here */
    @Override
    public void push(int val) {
       if (last==null){
           last = new Node(val);;
           first = last;
       }
       else {

           Node node = new Node(val);
           last.next = node;
           node.prev = last;
              // last = last.next;
            last = node;
       }
    }
	
    // implement the pop method
    /* write your code here */
    @Override
    public int pop() {
        if (first!=null){
            int val = first.val;
            first = first.next;
            if (first!=null){
                first.prev = null;
            }
            else last = null;
            return val;
        }
        return -1;
        
    }
    
	// implement the top method
    /* write your code here */
    @Override
    public int top() {
        if (first!=null){
            return first.val;
        }
        return -1;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue queue = new MyQueue();
 * queue.push(123);
 * queue.top(); will return 123;
 * queue.pop(); will return 123 and pop the first element in the queue
 */