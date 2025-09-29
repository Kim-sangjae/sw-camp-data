package com.sangjae.section04.dp;

import java.util.Arrays;

public class B_SugarDelivery {

    static final int INF = Integer.MAX_VALUE/2;

    public static int solution(int n){
        // dp 배열의 인덱스 값이 해당 키로수의 봉지 갯수가 될 수 있도록 저장
        int[] dp = new int[n+1];

        // 배열의 모든값 초기화
        Arrays.fill(dp , INF); // 그냥 의미없는 큰 값으로 초기화 한거

        // n 으로 전달 되는 숫자가 적으면 인덱스 범위를 벗어날 수 있음
        if(n >= 3) dp[3] = 1;
        if(n >= 5) dp[5] = 1;

        for (int i = 6; i <= n; i++) {
            // 3 또는 5개의 인덱스 전의 봉지 갯수 +1 이 현재 봉지갯수
            dp[i] = Math.min(dp[i-3], dp[i-5])+ 1;

        }

        return dp[n] >= INF ? -1 : dp[n];
    }
}
