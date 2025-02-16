package Programmers.LV2;

import java.util.Stack;

public class ValidParentheses {
    public static boolean solution(String s){
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(stack.isEmpty()){
                stack.add(c);
            }else if(c == ')' && stack.peek() == '('){
                stack.pop();
            }else{
                stack.add(c);
            }

        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = ")()(";
        System.out.println(solution(s));
    }
}
