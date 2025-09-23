package com.sangjae.section08.heap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.*;

class Jewelry {
    int weight;
    int price;

    public Jewelry(int weight, int price) {
        this.weight = weight;
        this.price = price;
    }

}

public class Practice2 {
    public long solution(String input) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new StringReader(input));



        StringTokenizer st = new StringTokenizer(br.readLine());
//        StringTokenizer st = new StringTokenizer(sb.nextLine(), " ,");
        int n = Integer.parseInt(st.nextToken()); // 보석갯수
        int k = Integer.parseInt(st.nextToken()); // 가방갯수


        PriorityQueue<Jewelry> jewelries = new PriorityQueue<>(
                (a, b) ->{
                 if(b.weight == a.weight){
                     return b.price - a.price;
                 }else return a.weight -b.weight;
                }
        );


        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            jewelries.add(new Jewelry(m, v));
        }

        int[] bags = new int[k]; // 가방 갯수 , 가방 무게

        for (int i = 0; i < k; i++) {
            bags[i] = Integer.parseInt(br.readLine()); // 가방무게 읽어서 저장
        }


        Arrays.sort(bags);

        // 가방에 보석가격정렬을 위한 프리큐
        PriorityQueue<Integer> priceSort = new PriorityQueue<>(
                (a, b) -> b-a
        );

        long sum = 0;
        int count = 0;

        // 가방 갯수만큼 반복
        for (int bag : bags) {

            // 쥬얼리 전체 무게가 낮은걸 역배열에 넣는다
            while (!jewelries.isEmpty() && jewelries.peek().weight <= bag) {
                priceSort.add(jewelries.poll().price);
            }

            // 그중 가장 비싼 보석 하나 선택
            if (!priceSort.isEmpty()) {
                sum += priceSort.poll();
            }

            }

//        jewelries.stream().forEach(a -> System.out.println(a.price));

        System.out.println(sum);
        return sum;
    }
}
