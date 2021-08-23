package com.silkdog.baekjoon.graphwrap.graph1260_3;

import java.io.*;
import java.util.*;

public class Main {

    // 안보고 반복숙달 중..

    static boolean[] visited;
    static ArrayList<Integer>[] arr;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());  // 정점
        int M = Integer.parseInt(st.nextToken());  // 간선
        int V = Integer.parseInt(st.nextToken());   // 시작정점

        visited = new boolean[N + 1];
        arr = new ArrayList[N + 1];

        for (int i = 1; i < N + 1; i++) {
            arr[i] = new ArrayList<>();
        }

        String[] str;
        int front, rear;
        for (int i = 0; i < M; i++) {
            str = br.readLine().split(" ");
            front = Integer.parseInt(str[0]);
            rear = Integer.parseInt(str[1]);
            arr[front].add(rear);
            arr[rear].add(front);
        }

        Arrays.fill(visited, false);
        DFS(V);
    }

    public static void DFS(int nodeIdx) {
        visited[nodeIdx] = true;
        System.out.printf("%d ->", nodeIdx);
        ArrayList<Integer> tmpArr = arr[nodeIdx];
        Collections.sort(tmpArr);
        for (int node : tmpArr) {
            if (!visited[node]) {
                DFS(node);
            }
        }
    }

}
