package Programmers.LV2;

import java.util.Arrays;
import java.util.List;

public class JadenCaseConverter {
    public static String solution(String s){
        String[] S = s.split(" ", -1); // 공백도 유지하도록 -1 옵션 추가

        for (int i = 0; i < S.length; i++) {
            if (S[i].length() == 0) continue; // 공백만 있는 경우 처리

            S[i] = S[i].toLowerCase(); // 모든 문자를 소문자로 변환
            StringBuilder sb = new StringBuilder(S[i]); // 문자열을 변경할 수 있도록 변환

            char firstChar = sb.charAt(0);
            if (Character.isLetter(firstChar)) { // 첫 문자가 알파벳인 경우
                sb.setCharAt(0, Character.toUpperCase(firstChar)); // 첫 문자 대문자로 변경
            }

            S[i] = sb.toString(); // 변환된 문자열 저장
        }

        return String.join(" ", S); // 공백 포함하여 문자열 합치기
    }

    public static void main(String[] args) {
        String s = "3people Unfollowed Me";
        System.out.println(solution(s));
    }
}
