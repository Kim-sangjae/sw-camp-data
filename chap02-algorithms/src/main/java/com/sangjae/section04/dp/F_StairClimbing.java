package com.sangjae.section04.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class F_StairClimbing {

    public static Integer solution(String input) throws IOException {

        BufferedReader br = new BufferedReader(new StringReader(input));
        int n = Integer.parseInt(br.readLine()); // 계단 갯수
        int[] stair = new int[n+1];
        int[] result = new int[n+1];
        for (int i = 1; i <= n; i++) {
            stair[i] = Integer.parseInt(br.readLine());
        }


        result[1] = stair[1];


        if (n >= 2) result[2] = result[1] + stair[2];

        // DP 점화식
        // 2칸 전 ( 전에 한칸 넘어서 왔을때랑 , 2칸씩 넘어서 왔을때 값 비교해서 큰값을 더해준다 )
        for (int i = 3; i <= n; i++) {
            //1. 직전계단에서 올라오는경우 -> 연달아 3개 안되므로 i-3 -> i-1 -> i 가 되야만한다
            result[i] = Math.max(result[i - 2], result[i - 3] + stair[i - 1]) + stair[i];
        }

        return result[n];


    }
}
