package com.sangjae.section04.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class E_TriangleMaxSum {

    public static Integer  solution (String input) throws IOException {
        BufferedReader br = new BufferedReader( new StringReader(input));
        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n+1][n+1]; // 삼각형 데이터 저장
        int[][] dp = new int[n+1][n+1]; // 내려오면서 가지는 최대값 기억할 배열

        for(int i = 1; i<=n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= i; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                // 최대값 저장할 dp에 값 누적연산해서 넣기
                dp[i][j] = arr[i][j] + Math.max(dp[i-1][j-1] , dp[i-1][j]);
            }
            System.out.println(Arrays.toString(arr[i]));
            System.out.println(Arrays.toString(dp[i]));
        }

        // 누적연산 한것중에 최대값착기
        int result = 0;
       for(int i = 1; i <= n; i++){
           int re = Math.max(dp[n][i], result);
           result = re;
       }

        return result;
    }
}
