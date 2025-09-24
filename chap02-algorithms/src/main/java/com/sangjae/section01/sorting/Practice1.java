package com.sangjae.section01.sorting;

import java.awt.*;
import java.util.Arrays;

// 최적화 된 버블 정렬
// 버블 정렬은 O(n^2) 로 배열이 길어질수록 복잡해진다
// 정렬이 어느정도 되어있으면 불필요한 동작을 줄여 O(n) 까지 줄일 수 있다
public class Practice1 {

    public static void solution(int[]arr){
        boolean swapped;

        for(int i = 0; i <arr.length-1; i++){
            swapped = false;
            for(int j =0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped =true;
                }
            }

            if(!swapped)break;
            System.out.println((i+1)+"번째"+ Arrays.toString(arr));
        }
    }
}
