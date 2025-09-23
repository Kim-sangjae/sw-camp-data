package com.sangjae.section08.heap;

import java.util.PriorityQueue;

// JavaCollection 에는 heap을 직접 지원하는 클래스는 없다
// PriorityQueue 를 이용
public class Application {

    public static void main(String[] args) {
        // 최소힙
        PriorityQueue<Integer> minheap = new PriorityQueue<>();

        // 요소 추가
        minheap.offer(10);
        minheap.offer(5);
        minheap.offer(8);

        // 원래 queue 는 먼저 들어간 값이 먼저나오지만
        // priorityQueue 는 힙정렬로 인해 최소값이 제일앞에 정렬되서 나온다
        System.out.println(minheap.peek()); // 5


        // 최소값 제거
        System.out.println(minheap.poll());

        // 제거하고 난후 비교
        System.out.println("앞에값 제거 후 : "+minheap.peek()+ "\n"); // 8



        // /////
        // 최대힙
        // 람다식으로 comparator 정렬기준을 바꿔준다
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)-> b-a);

        // 요소추가
        maxHeap.offer(10);
        maxHeap.offer(5);
        maxHeap.offer(8);

        System.out.println(maxHeap.peek());
        System.out.println(maxHeap.poll());
        System.out.println(maxHeap.peek());



    }
}
