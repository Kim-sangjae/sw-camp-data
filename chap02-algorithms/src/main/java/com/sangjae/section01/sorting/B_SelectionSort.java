package com.sangjae.section01.sorting;

import java.util.Arrays;

// 선택정렬
// 배열에서 최소값을 찾아 맨앞과 교환하는 방식
// 배열을 여러번 반복 , 선택한 요소와 나머지 요소 비교정렬
// 시간 복잡도는 O(n^2) 이지만 교환횟수가 적은편이다
// 정렬이 어느정도 되어있어도 복잡도는 변하지않아 비효율적
public class B_SelectionSort {
    //n개의 정수 , 선택정렬하기

    public static void solution(int[]arr){
        for (int i = 0; i < arr.length-1; i++) {
            // 루프 한번 돌때 제일 작은 값 찾기
            int minIndex = i;

            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }

            }
            // minIndex 에는 가장 작은 값의 인덱스가 담긴다
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
            System.out.println((i+1) + "번째" + Arrays.toString(arr));
        }
    }// solution
}
