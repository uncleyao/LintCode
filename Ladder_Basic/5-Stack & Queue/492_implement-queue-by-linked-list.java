/*
* 实现一个队列的操作
* 
* enqueue(item).将新元素放入队列中。
* dequeue(). 将第一个元素移出队列，返回它。
*/

class Node {
    public int val;
    public Node prev, next;
    public Node(int _val) {
        val = _val;
        prev = next = null;
    }
}


public class MyQueue {
    /*
     * @param item: An integer
     * @return: nothing
     */
    
    public Node first, last;
    public MyQueue() {
        first = last = null;
    }
    public void enqueue(int item) {
        // write your code here
        if (last==null) {
            last = new Node(item);
            first = last;
        }
        else {
            Node cur = new Node(item);
            last.next = cur;
            cur.prev = last;
            last = last.next;
        }
        
    }

    /*
     * @return: An integer
     */
    public int dequeue() {
        // write your code here
        if (first!=null) {
            int item = first.val;
            first = first.next;
            if (first!=null) {
                first.prev =null;
            }
            else last =null;
            return item;
        }
        return -1;
    }
}