package com.sangjae.section04.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Application {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // 요소 추가
        queue.offer(1);
        System.out.println(queue.size());
        queue.offer(2);
        System.out.println(queue.size());
        queue.offer(3);
        System.out.println(queue.size());


//        queue.poll();
//        System.out.println(queue.size());
//        queue.poll();
//        System.out.println(queue.size());
//        queue.poll();
//        System.out.println(queue.size());


        // 요소 조회
        System.out.println(queue.peek());

        // 요소 제거
        System.out.println(queue.poll());

        // 큐 비어있는지 확인
        System.out.println(queue.isEmpty());
    }
}
