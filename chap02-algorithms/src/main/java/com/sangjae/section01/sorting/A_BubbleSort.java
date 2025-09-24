package com.sangjae.section01.sorting;

import java.util.Arrays;

// 버블 정렬
// 인접 두요소를 비교 , 크기가 순서대로 정렬
// 배열 전체를 여러번 반복해야해서 각 반복마다 가장 큰요소가 맨끝으로
// 시간 복잡도는 O(n^2)
// 교환 연산이 많아서 다른 정렬보다 느릴 수 있다
public class A_BubbleSort {

    // n개의 정수 를 버블정렬해서 오름차순으로 만드는 프로그램
    public static void solution(int[]arr){
        // 외부 for문 : 한번의루프를 통해 맨 끝에 들어갈 값 결정
        // 배열길이 -1 만큼 반복
        for(int i = 0; i <arr.length-1; i++){
            // 내부for문 : 인접한 값을 비교해서 swap(교체) 한다
            // j의 반복횟수는 i 반복이 지날수록 줄어든단
            for(int j =0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;

                }
            }
            System.out.println((i+1)+"번째"+ Arrays.toString(arr));
        }
    }

}
