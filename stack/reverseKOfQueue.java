package Practice.DSA.stack;
import java.util.*;
public class reverseKOfQueue {
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        // add code here.
        Stack<Integer> stk = new Stack<>();
        for(int i = 0 ; i < k ; i++){
            stk.push(q.remove());
            
        }
        while(!stk.isEmpty()){
            q.add(stk.pop());
        }
        for(int i = 0 ; i < q.size() - k ; i++){
            q.add(q.remove());
           
        }
        return q;
        
    }
}
