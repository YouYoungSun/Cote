package Programmers.LV2;

import java.util.Stack;

public class MakeBigNumber {
    public static String solution(String number,int k){
        Stack<Character> stack = new Stack<>();
        for(char digit : number.toCharArray()){
            while(!stack.isEmpty() && k > 0 && stack.peek() < digit){
                stack.pop();
                k--;
            }
            stack.push(digit);
        }
        while(k>0){
            stack.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();
        for(char digit : stack){
            sb.append(digit);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String number = "4177252841";
        int k = 4;
        System.out.println(solution(number,k));
    }
}
