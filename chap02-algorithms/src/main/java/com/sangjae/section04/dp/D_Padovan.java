package com.sangjae.section04.dp;

// 파도반 수열
// 점화식 : f(n) = f(n-2) + f(n-3)
public class D_Padovan {
    static Integer[] dp = new Integer[101];

//    public static int solution(int n){
//        int[] arr = new int[n];
//        arr[0] = arr[1] = arr[2] = 1;
//        arr[3] = 2;
//
//        for (int i = 4; i < n; i++) {
//            arr[i] = arr[i-2] + arr[i-3];
//        }
//
//        return arr[n-1];
//    }
//

//    public static int solution(int n){
//
//        dp[1] = dp[2] = dp[3] = 1;
//
//        for (int i = 4; i <= n; i++) {
//            dp[i] = dp[i-2] + dp[i-3];
//        }
//
//        return dp[n];
//    }


    public static int solution(int n){
        dp[1] = dp[2] = dp[3] = 1;

        return padovan(n);
    }



    static int padovan(int n){
        if(dp[n] == null) {
            dp[n] = padovan(n-2) + padovan(n-3);
        }

        return dp[n];
    }

}
