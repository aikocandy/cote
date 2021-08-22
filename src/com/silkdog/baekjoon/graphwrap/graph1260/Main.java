package com.silkdog.baekjoon.graphwrap.graph1260;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {


    static int[][] graph;// = {{}, {1,2}, {1,3}, {1,4}, {2,4}, {3,4}};
    static boolean[] visited;// = new boolean[graph.length];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = Integer.parseInt(st.nextToken());  // 정점
        int adjCnt = Integer.parseInt(st.nextToken());  // 간선
        int V = Integer.parseInt(st.nextToken());  // 탐색시작 숫자

        graph = new int[cnt + 1][cnt + 1];
        visited = new boolean[cnt + 1];
        Arrays.fill(visited, false);

        for (int i = 0; i < adjCnt; i++) {
            String[] str = br.readLine().split(" ");
            int v1 = Integer.parseInt(str[0]);
            int v2 = Integer.parseInt(str[1]);
            graph[v1][v2] = 1;
            graph[v2][v1] = 1;
        }

        for (int i = 0; i < cnt + 1; i++) {
            for (int j = 0; j < cnt + 1; j++) {
                System.out.printf("%s", String.valueOf(graph[i][j]));
            }
            System.out.printf("\n");
        }


        // dfs(V);

    }

    static void dfs(int nodeIndex) {
        visited[nodeIndex] = true;
        System.out.print(nodeIndex + " -> ");
        for (int node : graph[nodeIndex]) {
            if (!visited[node]) {
                dfs(node);
            }
        }
    }

}
