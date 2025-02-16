package Programmers.LV2;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class DefenseGame {
    public static int solution(int n, int k, int[] enemy){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int round = 0;

        for(int e : enemy){
            maxHeap.add(e);
            n -= e;

            if(n<0){
                if(k>0){
                    n+= maxHeap.poll();
                    k--;
                }else{
                    break;
                }
            }
            round ++;
        }

        return round;
    }

    public static void main(String[] args) {
        int n = 7;
        int k =3;
        int[] enemy = {4,2,4,5,3,3,1};
        System.out.println(solution(n,k,enemy));
    }
}
