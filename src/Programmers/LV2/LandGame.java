package Programmers.LV2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LandGame {
    public static int solution(int[][] land){
        int[][] dp = new int[land.length][4];
        dp[0][0] = land[0][0];
        dp[0][1] = land[0][1];
        dp[0][2] = land[0][2];
        dp[0][3] = land[0][3];

        for(int i =1; i<land.length;i++){
            for(int j = 0; j<4; j++){
                int max = 0;
                for(int k=0; k<4;k++){
                    if(k!=j){
                        max = Math.max(max,dp[i-1][k]);
                    }
                }
                dp[i][j] = land[i][j]+max;
            }
        }
        int sumMax=0;
        for(int i=0;i<4;i++){
            sumMax = Math.max(dp[dp.length-1][i],sumMax);
        }


        return sumMax;
    }

    public static void main(String[] args) {
        int[][] land = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
        System.out.println(solution(land));
    }
}
