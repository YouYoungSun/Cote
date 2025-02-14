package Programmers.LV2;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class TruckPassingBridge {
    public static int solution(int bridge_length,int weight,int[] truck_weights){
        Queue<Integer> bridge = new LinkedList<>();
        int time =0;
        int totalWeight=0;

        for(int truck : truck_weights) {
            while (true) {
                if (bridge.size() == bridge_length) {
                    totalWeight -= bridge.poll();//다리를 지난 트럭 제거
                }
                if (totalWeight + truck <= weight) {
                    bridge.add(truck);
                    totalWeight += truck;
                    time++;
                    break;
                } else {
                    bridge.add(0);
                    time++;
                }
            }
        }

        return time+bridge_length;
    }
    public static void main(String[] args) {
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7,4,5,6};
        System.out.println(solution(bridge_length,weight,truck_weights));
    }
}
