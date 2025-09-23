package com.sangjae.section08.heap;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Practice1 {
    public String solution(Integer[] array){
        PriorityQueue<Integer> heapArray = new PriorityQueue<>(
                (a, b) -> {
                   int absCompare = Integer.compare(Math.abs(a), Math.abs(b));
                    if(absCompare == 0){
                        return Integer.compare(a,b);
                    }
                    return absCompare;
                }
        );

        StringBuilder sb = new StringBuilder();

        for(int a : array){
            if(a == 0){
                if(heapArray.isEmpty()){
                  sb.append("0 ");
                }else{
                    sb.append(heapArray.poll()).append(" ");
                }
            }else {
                heapArray.offer(a);
            }
        }

        System.out.println(heapArray);
        heapArray.stream().forEach(System.out::println);



        return sb.toString().trim();
    }
}
