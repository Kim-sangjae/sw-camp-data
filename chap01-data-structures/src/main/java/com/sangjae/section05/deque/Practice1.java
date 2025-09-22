package com.sangjae.section05.deque;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

class Practice1 {

    static class Ballon {
        int order;
        int noteValue;

        Ballon(int order, int noteValue) {
            this.order = order;
            this.noteValue = noteValue;
        }
    }

    public String solution(Integer[] notes) {
        StringBuilder sb = new StringBuilder();

        // 풍선을 deque에 삽입
        Deque<Ballon> ballons = new ArrayDeque<>();
        for (int i = 0; i < notes.length; i++) {
            ballons.addLast(new Ballon(i + 1, notes[i]));
        }

        // 무조건  첫번째 풍선 제거
        Ballon current = ballons.removeFirst();
        sb.append(current.order);

        // 덱에서 모든 풍선이 제거
        while (!ballons.isEmpty()) {
            // 터진 풍선의 이동값
            int moveValue = current.noteValue;

            if (moveValue > 0) {
                // 양수면 오른쪽
                for (int i = 1; i < moveValue; i++) {
                    ballons.addLast(ballons.removeFirst());

                }
                current = ballons.removeFirst();

            } else {
                // 음수
                for (int i = 1; i < -moveValue; i++) {
                    ballons.addFirst(ballons.removeLast());


                }
                current = ballons.removeLast();
            }


            sb.append(" ").append(current.order);
        }
        return sb.toString();
    }
}