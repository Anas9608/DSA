package Practice.DSA.stack;
import java.util.*;

public class minStackWithSpace {
    int minEle;
    Stack<Integer> s = new Stack<>();
    Stack<Integer> min = new Stack<>();

    /*returns min element from stack*/
    int getMin()
    {
	// Your code here
	if(min.isEmpty()) return -1;
	int x = min.peek();
	return x;
    }
    
    /*returns poped element from stack*/
    int pop()
    {
	// Your code here
	if(s.isEmpty()){
	    return -1;
	}
	if(!min.isEmpty() && s.peek() == min.peek()){
	    min.pop();
	}
	return s.pop();
	
	
    }

    /*push element x into the stack*/
    void push(int x)
    {
	// Your code here
	s.push(x);
	if(min.isEmpty()){
	    min.push(x);
	    
	}
	else if(min.peek() >= x){
	    min.push(x);
	}
	
	
	
    }	
    
}
