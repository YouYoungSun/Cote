package Programmers.LV1;

class Solution{
    public String solution(int num){
        String answer = "";
        if(num%2 ==0){
            answer = "Even";
        }else{
            answer = "Odd";
        }
        return answer;

    }
}


public class 짝수와_홀수 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(4));

    }
}
