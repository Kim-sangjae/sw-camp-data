package com.sangjae.section03.greedy;

import java.io.*;
import java.util.StringTokenizer;

public class Practice13305 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int node = Integer.parseInt(br.readLine()); // 주유소 갯수


        long[] edge = new long[node-1]; // 도로 길이

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < edge.length; i++){
            edge[i] = Long.parseLong(st.nextToken());
        }

        long[] price = new long[node]; // 주유소 가격
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < price.length; i++) {
            price[i] = Long.parseLong(st.nextToken());
        }


        long totalCost = 0;
        long minPrice = price[0]; // 첫 번째 주유소 가격

        // 도로를 차례대로 이동
        for (int i = 0; i < edge.length; i++) {
            // 지금까지 나온 최소 가격 유지
            if (price[i] < minPrice) {
                minPrice = price[i];
            }

            // 최소 가격 × 도로 길이
            totalCost += minPrice * edge[i];
        }

       bw.write(String.valueOf(totalCost));
        bw.flush();
        bw.close();




    }
}
