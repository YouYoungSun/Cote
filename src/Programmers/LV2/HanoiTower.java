package Programmers.LV2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HanoiTower {
    public static int[][] solution(int n){
        List<int[]> lst = new ArrayList<>();
        hanoi(n,1,3,2,lst);

        return lst.toArray(new int[lst.size()][]);
    }
    public static void hanoi(int n, int from, int to, int via,List<int[]> result){
        if(n==1){
            result.add(new int[] {from,to});
            return ;
        }
        // 1단계: n-1개의 원판을 from에서 via로 옮김
        hanoi(n - 1, from, via, to, result);

        // 2단계: 가장 큰 원판을 from에서 to로 옮김
        result.add(new int[]{from, to});

        // 3단계: via에 있던 n-1개의 원판을 to로 옮김
        hanoi(n - 1, via, to, from, result);
    }
    public static void main(String[] args) {
        int n = 2;

        System.out.println(Arrays.deepToString(solution(n)));
    }


}
