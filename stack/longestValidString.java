package Practice.DSA.stack;
import java.util.*;

public class longestValidString {
    static int findMaxLen(String S) {
        // code here
        
           Stack<Integer> stk = new Stack<>();
           stk.push(-1);
           
           int count  = 0;
           for(int i = 0 ; i < S.length() ; i++){
               if(S.charAt(i) == '('){
                   stk.push(i);
               }
               else{
                   stk.pop();
                   if(!stk.isEmpty()){
                   count =Math.max(count, i - stk.peek());
                   }else{
                       stk.push(i);
                   }
               }
           }
           return count;
        }
        
}
