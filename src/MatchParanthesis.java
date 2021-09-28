import java.util.*;

public class MatchParanthesis {


    public static boolean Check(String expression) {
        //stack class
        Stack<Character> stack = new Stack<Character>();

        char s;
        //traverses through each character in string
        for(int i = 0; i < expression.length(); i++){
            s = expression.charAt(i);
            //if character is ( add to stack
            if (s == '(') {
                stack.push(s);
            }
            //if character is ), then if the stack is empty returns false
            //otherwise tries to find a opening bracket to match and removes ( from stack
            //else returns false
            else if (s== ')') {
                if (stack.empty()) {
                    return false; }
                
                else if (stack.peek() == '(') {
                    stack.pop(); }

                else { return false; }
                
            }
        }
        //if stack is empty after traversing through the whole expression it means all brackets
        //were balanced therefore returning true
        return stack.empty();
    }

    //One for-loop with time complexity of O(n)
    //if/else statements are constant time O(1) -- no effect to the time complexity of algorithm
    //Time complexity of algorthm O(n)

  
}
