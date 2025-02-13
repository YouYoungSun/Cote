package Programmers.LV2;

public class MinMaxFinder {
    public static String solution(String s){
        String[] numbers = s.split(" ");
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(String num : numbers){
            int number = Integer.parseInt(num);
            if(number<min) min = number;
            if(number>max) max = number;
        }
        return min + " " + max;
    }

    public static void main(String[] args) {
        String s = "1 2 3 4";
    }
}
