package com.sangjae.section01.timecomplexity;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        // 시간 복잡도를 이해

        int[] arr = {3,1,2,15,4,9,10,7};
        System.out.println(getFirst(arr));
        System.out.println(Arrays.toString(reversed(arr)));
        System.out.println(binarySearch(arr,7));
        System.out.println(fibonacci(100));
    }

    // 상수시간 O(1) ...
    private static int getFirst(int[]arr){
        return arr[0];
    }

    // 로그시간 O(log n)
    private static int binarySearch(int[]arr , int target){
        // 초기세팅 (배열을 오름차순으로 정렬)
        // 내부적으로 n lon n 만큼의 시간이 걸리지만 지금은 제외
        Arrays.sort(arr);
        System.out.println("정렬된 Arrays : " + Arrays.toString(arr));
        // 배열의 처음과 끝을 지정하는 인덱스를 담는 변수(포인터)
        int left = 0, right = arr.length-1;

        while (left<=right){
            int mid = left + (right-left) /2; // 포인터
            if(target == arr[mid]){  // 포인터와 같을때
                return mid;
            } else if(arr[mid] < target){ // 포인터보다 클때 왼쪽을 올린다
                left = mid + 1;
            }  else { // 포인터보다 작을때 오른쪽을 줄임
                right = mid -1;
            }
        }
        return -1;
    }



    // 선형시간 O(n)
    private static int[] reversed( int[]arr){
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];

        }
        return reversed;
    }


    // 지수시간 O(2^n)
    private static int fibonacci(int n){
        // 기본 사례 : n 이 0 또는 1
        if (n <= 1){
            return 1;
        }

        // 재귀 사례 : 피보나치
        return fibonacci(n-1) + fibonacci(n-2);
    }

}
