package Programmers.LV1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MockExam {
    public static int[] solution(int[] answers){

        int[] person1 = {1, 2, 3, 4, 5};
        int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] score = {0,0,0};

        for(int i=0;i<answers.length;i++){
            if (answers[i] == person1[i % person1.length]) score[0]++;
            if (answers[i] == person2[i % person2.length]) score[1]++;
            if (answers[i] == person3[i % person3.length]) score[2]++;

        }
        int maxScore = Math.max(Math.max(score[0], score[1]), score[2]);
        List<Integer> result = new ArrayList<>();

        if (score[0] == maxScore) result.add(1);
        if (score[1] == maxScore) result.add(2);
        if (score[2] == maxScore) result.add(3);

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};
        System.out.println(Arrays.toString(solution(num)));
    }
}
