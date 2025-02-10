package Programmers.LV1;

class Solution1{
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
        Solution1 s = new Solution1();
        System.out.println(s.solution(4));

    }
}
