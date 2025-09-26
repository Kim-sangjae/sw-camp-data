package com.sangjae.section01.arraytech;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.util.StringTokenizer;

public class Practice12891 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        // 임의 문자열 길이 , 비밀번호 길이
        StringTokenizer st = new StringTokenizer(br.readLine());
        int wordLength = Integer.parseInt(st.nextToken());
        int pwLength = Integer.parseInt(st.nextToken());

        // 임의의 문자열
        String randomWord = br.readLine();
        char[] charArray = randomWord.toCharArray();


        // 최소 문자갯수 배열  {‘A’, ‘C’, ‘G’, ‘T’}
        int[] arr = new int[4];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 최소 문자열 배열 {'A','C','G','T'}
        char[] bases = {'A', 'C', 'G', 'T'};
        int total = 0;
        for(int n : arr) total += n;

        char[] acgt = new char[total];


        int index = 0;

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i]; j++){
                acgt[index++] = bases[i];
            }
        }





        int count = 0;

        for(int right = pwLength; right < charArray.length; right++){
            int left = right-pwLength;

            String s = "";
            for(int i = left; i < right; i++){
                s+=charArray[i];
            }

            boolean allIncluded = true;
            for(char a : acgt){
                if(s.indexOf(a) != -1){
                    // 포함 된거
                } else {
                    // 포함 안된거
                    allIncluded = false;
                    right++;
                }
            }
            if (allIncluded){count++;}

        }// 바깥 for문

        System.out.println(count);

        }


}
