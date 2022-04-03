package Practice.DSA.stack;
import java.util.*;
public class stackWithLinkedList {
    StackNode top;
    public void push(int a){
        StackNode obj = new StackNode(a);
        obj.next = top;
        top = obj;
    }
    public int pop(){
        if(top == null) return -1;
        int ans = top.data;
        top = top.next;
        return ans;
    }
}
class StackNode{
    int data;
    StackNode next;
    StackNode(int data){
        this.data = data;
        next = null;
    }

}
