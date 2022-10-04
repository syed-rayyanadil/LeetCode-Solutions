import java.util.*;
class Solution {
    public boolean isValid(String s) {
    
    Stack<Character> STACK = new Stack<Character>();
        
        if (s.length()==0)
            return true;
        
    for (int i =0; i<s.length(); i++){
        System.out.println("Initial Stack: " + s.charAt(i));
        
        if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{' ){
            STACK.push(s.charAt(i));
        }
        
        else if( !STACK.empty() && s.charAt(i) == ')' && STACK.peek() == '('){
            STACK.pop();
        } 
        
        else if( !STACK.empty() && s.charAt(i) == ']' && STACK.peek() == '['){
            STACK.pop();
        } 
        
        else if( !STACK.empty() && s.charAt(i) == '}' && STACK.peek() == '{'){
            STACK.pop();
        } 
        
        else {
            return false;
        }
        
    }
        return STACK.empty();
} 
}