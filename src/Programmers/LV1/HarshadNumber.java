package Programmers.LV1;

class Ha{
    public boolean solution(int x){
       int sum=0;
       int num=x;
       while(num>0){
           sum += num%10;
           num/=10;
       }
       return x%sum ==0;


    }
}

public class HarshadNumber{
    public static void main(String[] args) {
        Ha sol = new Ha();

        System.out.println(sol.solution(11));
    }
}
