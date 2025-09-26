package com.sangjae.section03.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 회의실 배정 그리디
// 가장 빨리 끝나는 회의를 계속 선택 하면 회의수가 최대수가 된다
// 종료시간이 같다면 시작시간이 빠른회의를 정렬
public class C_MeetingRoomScheduler {

    public static int solution(String input) throws IOException {
        BufferedReader br = new BufferedReader(new StringReader(input));
        int N = Integer.parseInt(br.readLine()); // 회의 갯수

        int[][] time = new int[N][2]; // 회의 시간

        StringTokenizer st;
        for (int i = 0; i < N; i++) {

            st = new StringTokenizer(br.readLine());
            time[i][0] = Integer.parseInt(st.nextToken());
            time[i][1] = Integer.parseInt(st.nextToken());

        }


        Arrays.sort(time, (a, b) -> {
            if (a[1] == b[1]) {
                return a[0] - b[0]; // 두번째 열이 같다면 첫번째열 기준으로 오름차순
            }
            return a[1] - b[1];     // 기본은 두번째 열 기준으로 오름차순
        });


        int count = 0;
        int endTime = 0;

        for (int i = 0; i < N; i++) {


         if(time[i][0] >= endTime){
             count++;
             endTime = time[i][1];
         }

        }

        return count;
    }

}
