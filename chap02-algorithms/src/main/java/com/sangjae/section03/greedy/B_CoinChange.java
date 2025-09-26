package com.sangjae.section03.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.StringTokenizer;

public class B_CoinChange {
    public static int solution(String input) throws IOException {
        BufferedReader br = new BufferedReader(new StringReader(input));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());   // 동전의 종류 개수
        int K = Integer.parseInt(st.nextToken());   // 계산할 금액
        int[] coins = new int[N];                   // 동전 종류 저장

        for(int i = 0; i < coins.length; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }


        int count = 0;  // 필요한 동전의 갯수


        for (int i = N-1; i >= 0; i--) {
            if(coins[i] <= K){
                // 현재 동전으로 최대 지불할 수 있는 금액(동전의 수)
                count += K/coins[i];
                // 남은 금액은 항상 확인해서 넣어줘야한다
                K %= coins[i];
            }

        }

        return count;
    }
}
