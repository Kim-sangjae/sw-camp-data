package com.sangjae.section04.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Practice1 {
    public String solution(int n, int k) {
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder("<");

        for (int i = 1; i <= n; i++) {
            queue.offer(i);

        }

        while(!queue.isEmpty()){

            for (int i = 1; i <= k-1; i++) {
                queue.offer(queue.poll());
            }

            sb.append(queue.poll());

            if(!queue.isEmpty()) sb.append(", ");
        }

        sb.append(">");

        return sb.toString();
    }
}
