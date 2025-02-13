package Programmers.LV1;

import java.util.Collections;

public class CountPAndY {
    public static boolean solution(String s){
        char c = ' ';
        int f=0;
        for(int i=0;i<s.length();i++){
            c=Character.toUpperCase(s.charAt(i));
            if(c=='P'){
                f +=1;
            }else if(c=='Y'){
                f-=1;
            }
        }

        return f == 0;
    }
    public static void main(String[] args) {
        String s = "pPoooyYy";
        System.out.println(solution(s));
    }
}
