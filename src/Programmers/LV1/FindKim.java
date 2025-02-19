package Programmers.LV1;

import java.util.Arrays;

public class FindKim {
    public static String solution(String[] seoul){
        int index = Arrays.asList(seoul).indexOf("Kim");
        return "김서방은 " + index + "에 있다";

    }

    public static void main(String[] args) {
        String[] seoul = {"Jane","Kim"};
        System.out.println(solution(seoul));
    }
}
