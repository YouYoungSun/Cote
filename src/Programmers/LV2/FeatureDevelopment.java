package Programmers.LV2;

import java.util.*;

public class FeatureDevelopment {
    public static int[] solution(int[] progresses, int[] speeds){
        Queue<Integer> q = new LinkedList<>();
        List<Integer> lst = new ArrayList<>();
        int start = 0;
        int count = 0;
        while(start<progresses.length){
            for(int i=start;i<progresses.length;i++){
                progresses[i] = progresses[i] + speeds[i];
                System.out.println("배열" + Arrays.toString(progresses));
                if(progresses[start]>=100){
                    q.add(progresses[start]);
                    start++;
                }
            }

            while(!q.isEmpty() && q.peek()>=100){
                q.poll();
                count++;
            }
            if(count!=0){
                lst.add(count);
            }

            count=0;


        }

        return lst.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1,1,1,1,1,1};
        System.out.println(Arrays.toString(solution(progresses,speeds)));
    }
}
