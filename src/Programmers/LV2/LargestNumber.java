package Programmers.LV2;

import java.util.*;

public class LargestNumber {
    public static String solution(int[] numbers) {
        String[] strNumbers = new String[numbers.length];
        for(int i =0;i<numbers.length;i++){
            strNumbers[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(strNumbers, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return (b+a).compareTo(a+b);
            }
        });

        StringBuilder sb = new StringBuilder();
        for(String str : strNumbers){
            sb.append(str);
        }

        if(sb.charAt(0)=='0'){
            return "0";
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        int[] numbers = {6,10,2};
        System.out.println(solution(numbers));
    }
}

