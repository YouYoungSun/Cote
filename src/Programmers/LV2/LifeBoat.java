package Programmers.LV2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LifeBoat {
    public static int solution(int[] people,int limit){
        int boat =0;
        int left=0;
        int right = people.length-1;
        Arrays.sort(people);
        while(left<=right){
            if(people[left] + people[right] <= limit){
                left++;
            }
            right --;
            boat++;

        }
        return boat;
    }

    public static void main(String[] args) {
        int[] people = {70,50,80,50};
        int limit = 100;
        System.out.println(solution(people,limit));
    }
}
