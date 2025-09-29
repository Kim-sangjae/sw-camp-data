package com.sangjae.section04.dp;

import java.util.Arrays;

// 점화식 : f(x) = f(x-1) + f(x-2)
public class C_Tiling {

    public static Integer solution(Integer n){
        Integer[] arr = new Integer[n+1];
        arr[0] = arr[1] = 1;

        for(int i = 2; i <= n; i ++){
            arr[i] = arr[i-1]+ arr[i-2];
        }

        return arr[n];
    }

}
