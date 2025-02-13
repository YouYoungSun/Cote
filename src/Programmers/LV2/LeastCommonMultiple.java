package Programmers.LV2;

public class LeastCommonMultiple {
    public static int solution(int[] arr){
        int result = arr[0];
        for(int i=0;i<arr.length;i++){
            result = lcm(result,arr[i]);
        }
        return result;
    }
    public static int gcb(int num1, int num2){
        int m = Math.max(num1,num2);
        int s = Math.min(num1,num2);
        if (m % s == 0) {
            return s;
        }else{
            return gcb(s,m%s);
        }

    }

    public static int lcm(int a,int b){
        return (a * b) / gcb(a,b);
    }
    public static void main(String[] args) {
        int[] arr = {2,6,8,14};
        System.out.println(solution(arr));

    }
}
