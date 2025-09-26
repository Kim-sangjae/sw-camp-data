package com.sangjae.section01.arraytech;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Practice1940 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int require = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] numArray = new int[num];

        for(int i = 0; i < numArray.length; i++){
            numArray[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(numArray);

        int left = 0;
        int right = num-1;
        int count = 0;

        while (left<right){

               int sum = numArray[left] + numArray[right];

               if(sum == require){
                   count++;
                   left++;
                   right--;
               } else if (sum < require) {
                   left++;
               } else {
                   right--;
               }

        }// while

        wr.write(String.valueOf(count));
        wr.flush();
        wr.close();


    }
}
