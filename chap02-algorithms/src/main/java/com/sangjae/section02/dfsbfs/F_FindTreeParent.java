package com.sangjae.section02.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.*;

public class F_FindTreeParent {
    static int N;                       // 노드의 개수
    static List<Integer>[] adj;         // 연결 노드 저장 배열
    static int[] parent;                // 최종 결과 저장 배열
    static boolean[] visited;           // 방문 결과 저장 배열

    public static String solution(String input) throws IOException {
        BufferedReader br = new BufferedReader(new StringReader(input));
        N = Integer.parseInt(br.readLine());

        parent = new int[N + 1];
        visited = new boolean[N + 1];
        adj = new ArrayList[N + 1];
        for(int i = 1; i < N + 1; i++) adj[i] = new ArrayList<>();

        /* N - 1 개 줄의 입력 처리 */
        StringTokenizer st;
        for(int i = 1; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            adj[a].add(b);
            adj[b].add(a);
        }

        /* bfs로 트리 구조를 탐색하면서 parent 배열에 값을 입력 한다. */
        bfs(1);

        /* 트리 탐색이 완료 된 이후에는 parent 배열에 부모 노드 값이 담겨 있으므로
         * 합쳐서 문자열로 만들고 반환한다. */
        StringBuilder sb = new StringBuilder();
        for(int i = 2; i < parent.length; i++) {
            sb.append(parent[i]).append(" ");
        }

        return sb.toString();
    }

    static void bfs(int root) {
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(root);
        visited[root] = true;

        while (!q.isEmpty()) {
            int parentNode = q.poll();

            /* 연결 된 노드를 반복 */
            for (int childNode : adj[parentNode]) {
                if (!visited[childNode]) {
                    visited[childNode] = true;
                    // 부모를 관리하는 배열에 해당 자식 노드의 부모 노드를 담는다.
                    parent[childNode] = parentNode;
                    q.offer(childNode);
                }
            }
        }
    }

}