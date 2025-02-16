package Programmers.LV2;

public class NumberExpression {
    public static int solution(int n){
        int result =0;

        for(int i=1;i<=n;i++){
            int sum=0;
            int j = i;
            while(sum<n){
                sum=sum+j;
                j++;
                if(sum==n){
                    result ++;
                }
            }
        }
        //System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        int n = 17;
        System.out.println(solution(n));
    }
}
