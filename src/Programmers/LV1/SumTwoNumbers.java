package Programmers.LV1;


import java.util.*;

//두개 뽑아서 더하기
public class SumTwoNumbers {
    public static int[] solution(int[] numbers){
        HashSet<Integer> sumSet = new HashSet<>();
        for(int i =0; i<numbers.length;i++){
            for (int j = i+1; j < numbers.length; j++) {
                sumSet.add(numbers[i]+numbers[j]);
            }
        }

        List<Integer> resultList = new ArrayList<>(sumSet);
        Collections.sort(resultList);

        return resultList.stream().mapToInt(Integer::intValue).toArray();

    }
    public static void main(String[] args) {
        int[] numbers = {2,1,3,4,1};
        System.out.println(Arrays.toString(solution(numbers)));
    }
}
