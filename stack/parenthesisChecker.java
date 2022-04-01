package Practice.DSA.stack;
import java.util.*;

public class parenthesisChecker {
    static boolean ispar(String x)
    {
        // add your code here
        Stack<Character> stk = new Stack<>();
        for(int i = 0 ; i < x.length() ; i++){
            if(x.charAt(i) == '(' || x.charAt(i) == '{' || x.charAt(i) == '[' ){
                stk.push(x.charAt(i));
                
            }
            else{
                if(stk.isEmpty()) return false;
                if(x.charAt(i) == ')'){
                     if(stk.peek() == '(') stk.pop();
                    else return false;
                }
                else if(x.charAt(i) == ']'){
                     if(stk.peek() == '[') stk.pop();
                    else return false;
                }
                else{
                    if(stk.peek() == '{') stk.pop();
                    else return false;
                    
                }
            }
        }
        if(stk.isEmpty()) return true;
        return false;
    }
}

