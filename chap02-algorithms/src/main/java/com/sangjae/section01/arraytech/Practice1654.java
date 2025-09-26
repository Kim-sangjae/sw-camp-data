package com.sangjae.section01.arraytech;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Practice1654 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        String current = br.readLine();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int current = Integer.parseInt(st.nextToken());
        int needLines = Integer.parseInt(st.nextToken());


        int[] currentLineLength = new int[current];

        long max = 0;

        for (int i = 0; i < currentLineLength.length; i++) {
           currentLineLength[i]  = Integer.parseInt(br.readLine());

           if(currentLineLength[i] > max){
               max = currentLineLength[i];
           }
        }

        long start = 1;
        long mid = 0;
        long result = 0;

        while(start < max){
            mid = (start+max)/2;

            long count = 0;
            for(int i =0; i < currentLineLength.length; i++){

                count += currentLineLength[i]/mid;

            }

            if(count < needLines){
                max = mid - 1;
            } else {

                result = mid;
                start = mid + 1;
            }


        }

        System.out.println(result);








    }
}
