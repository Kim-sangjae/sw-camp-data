package com.sangjae.section04.dp;

import java.io.*;
import java.util.StringTokenizer;

public class Practice1890 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int square = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[][] arr = new int[square][square];
        long[][] dp = new long[square][square];
        for(int i =0; i < square; i++){
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < square; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dp[0][0] = 1;

        for(int i = 0; i < square; i++){

            for (int j = 0; j < square; j++) {
                if(dp[i][j] == 0) continue; // 도달할 수 없는 칸
                if(i == square-1 && j == square-1) continue;

                int jump = arr[i][j];

                if (i + jump < square) dp[i + jump][j] += dp[i][j]; // 아래로
                if (j + jump < square) dp[i][j + jump] += dp[i][j]; // 오른쪽
            }
        }

        System.out.println(dp[square - 1][square - 1]);






    }
}
