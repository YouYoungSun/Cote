package Programmers.LV3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntegerTriangle {
    public static int solution(int[][] triangle){
        int max = 0;
        int n = triangle.length;
        int[][] dp = new int[n][n];
        dp[0][0] = triangle[0][0];


        for(int i=1;i<n;i++){
            for(int j=0;j<triangle[i].length;j++){
                if(j == 0){
                    dp[i][j] = triangle[i][j] + dp[i-1][j];
                }else if(j == triangle[i].length-1){
                    dp[i][j] = triangle[i][j] + dp[i-1][j-1];
                }else{
                    dp[i][j] = triangle[i][j] + Math.max(dp[i-1][j-1],dp[i-1][j]);
                }

            }
        }

        return Arrays.stream(dp[n-1]).max().getAsInt();
    }

    public static void main(String[] args) {
        int[][] triangle = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
        System.out.println(solution(triangle));
    }
}
