package com.sangjae.section03.greedy;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Practice1946 {

    static class People implements Comparator<People> {
        int paper;
        int interview;

        People(int paper , int interview){
            this.interview = interview;
            this.paper = paper;
        }

        @Override
        public int compare(People o1, People o2) {

            if (o1.paper == o2.paper) {
                return Integer.compare(o1.interview, o2.interview);
            }
            return Integer.compare(o1.paper, o2.paper);
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(br.readLine());
        while (testCase>0) {
            int people = Integer.parseInt(br.readLine());
            People[] arr = new People[people];

            for (int i = 0; i < people; i++) {
                st = new StringTokenizer(br.readLine());
                arr[i] = new People(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            }

            Arrays.sort(arr, new People(0, 0));


            int count = 1;
            int minValue = arr[0].interview;
            for (int i = 0; i < people; i++) {
                if (arr[i].interview < minValue) {
                    count++;
                    minValue = arr[i].interview;
                }
            }

            bw.write(count +"\n");
            bw.flush();


            testCase--;

        }

        bw.close();

    }
}
