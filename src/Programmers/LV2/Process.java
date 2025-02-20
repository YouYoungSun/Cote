package Programmers.LV2;

import java.util.*;

public class Process {
    public static int solution(int[] priorities, int location){
        Queue<Integer> q = new LinkedList<>();
        q.add(4);
        Scanner sc = new Scanner(System.in);
        while(true) {
            int n = sc.nextInt();
            q.add(n);
            System.out.println(q.toString());

            if(n == 101){
                break;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] priorities = {1, 1, 9, 1, 1, 1};
        int location = 0;
        System.out.println(solution(priorities,location));
    }
}
