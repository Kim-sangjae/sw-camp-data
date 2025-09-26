package com.sangjae.section02.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;



public class C_DFSBFSPr {

    static int node, edge, start;
    static int[][] map;
    static boolean[] visit;
    static StringBuilder sb;

    public static String solution(String input) throws IOException {

        BufferedReader br = new BufferedReader(new StringReader(input));

        StringTokenizer st = new StringTokenizer(br.readLine());

        node = Integer.parseInt(st.nextToken()); // 노드
        edge = Integer.parseInt(st.nextToken()); // 간선
        start = Integer.parseInt(st.nextToken()); // 시작위치

        map = new int[node + 1][node + 1];
        visit = new boolean[node + 1];

        for (int i = 1; i <= edge; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            map[a][b] = map[b][a] = 1;
        }

        sb = new StringBuilder();

        dfs(start);

        sb.append("\n"); // 개행

        visit = new boolean[node + 1]; // 두개 확인해야되기 때문에 방문초기화

        bfs(start);

        System.out.println(sb.toString());
        return sb.toString();
    }

    static void dfs(int start) {
        visit[start] = true;
        sb.append(start).append(" ");

        for (int i = 1; i <= node; i++) {

            if (map[start][i] == 1 && !visit[i]) {
                dfs(i);
            }

        }
    }


    static void bfs(int start){
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(start);

        visit[start] = true;

        while (!queue.isEmpty()){
            start = queue.poll();
            sb.append(start).append(" ");

            for (int i = 1; i <= node; i++) {
                if(map[start][i] == 1 && !visit[i]){
                    queue.offer(i);
                    visit[i] = true;
                }
            }
        }

    }


}// class

