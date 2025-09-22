package com.sangjae.section05.deque;

import java.util.ArrayDeque;
import java.util.Deque;

// java Collection Framework 에서는 Deque 인터페이스와 구현체가 있다
public class Application {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();


        // 요소 추가
        deque.addLast(1);
        deque.addLast(2);
        deque.addLast(3);
        deque.addLast(4);
        deque.addFirst(5);
        System.out.println(deque);

        // 요소 확인
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());

        // 요소 제거
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
        System.out.println(deque);
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
        System.out.println(deque);


    }
}
