package com.sangjae.section01.sorting;

import java.util.Arrays;

// 삽입 정렬
// 이미 정렬 된 부분에 새로운 요소를 적절한 위치에 삽입
// 왼쪽부터 정렬범위를 확장 , 비교하며 이동한다
// 시간복잡도는 O(n^2) 이지만 데이터가 거의 정렬된 경우 O(n)까지 최적화된다
// 적은 데이터나 , 정렬이 거의 끝난 데이터에 효율적
public class C_InsertSort {

    public static void solution(int[]arr){
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i]; // 중간에 삽입될 값
            int j;
            for(j=i-1; j>=0; j--){
                // i 보다 앞의 값들을 비교한다
                if(arr[j]>temp) arr[j+1] = arr[j];
                else break;
            }
            arr[j+1] = temp;
            System.out.println((i) + "번째" + Arrays.toString(arr));

        }

    }
}
