package com.sangjae.section04.queue;

import java.util.*;
public class Main{
    public static void main(String[]args){


        Scanner sc  = new Scanner(System.in);
        int num = sc.nextInt();
        int[] numarray = new int[num];
        int count = 0;

        while(count == num){
            int x = sc.nextInt();
            for(int i : numarray){
                numarray[i] = x;
                count++;
            }
        };

        PriorityQueue<Integer> heapArray = new PriorityQueue<>(
                (a,b)->{
                    int compare = Integer.compare(Math.abs(a),Math.abs(b));
                    if(compare == 0){
                        return a-b;
                    };
                    return compare;
                });




        StringBuilder sb = new StringBuilder();

        for(int a : numarray){
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



    }
}
