package com.sangjae.section04.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Practice2 {
    public int solution(int w, int l, Integer[] truckWeight) {
        Queue<Integer> bridge = new LinkedList<>();
        Queue<Integer> truckNum = new LinkedList<>();

        for (int t : truckWeight) {
            truckNum.offer(t);
        }

        for (int i = 0; i < w; i++) {
            bridge.offer(0);  // 0,0
        }

        int time = 0;
        int currentWeight = 0; // 다리 위 ( 앞쪽 차량 무게 )

        while (!bridge.isEmpty()) {

            time++;
            currentWeight -= bridge.poll(); // 다리는 1초마다 앞으로 이동시킨다


            if (!truckNum.isEmpty()) {// 남아있는 트럭이 있다면

                if (currentWeight + truckNum.peek() <= l) { // 다음트럭과 무게를 재본다
                    int truckOnBridge = truckNum.poll(); // 더 작으면 올린다 다리에

                    bridge.offer(truckOnBridge);

                    currentWeight += truckOnBridge;

                } else {
                    bridge.offer(0); // 무게쟀을때 더 무거우면 다음트럭 넣지 않기
                }
            }
            System.out.println(time);
            System.out.println(currentWeight);
            System.out.println(bridge);
        }
        System.out.println();
        return time;
    }

}
