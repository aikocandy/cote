package com.silkdog.baekjoon.graphwrap.graph2606;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static ArrayList<Integer>[] arr;
    static boolean[] visited;
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine()); // 정점
        int M = Integer.parseInt(br.readLine()); // 간선
        int V = 1;

        arr = new ArrayList[N + 1];
        visited = new boolean[N + 1];

        for (int i = 1; i < N + 1; i++) {  // 0은 무시
            arr[i] = new ArrayList<>();
        }
        Arrays.fill(visited, false);

        int front, rear;
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            front = Integer.parseInt(st.nextToken());
            rear = Integer.parseInt(st.nextToken());

            arr[front].add(rear);  // 행렬
            arr[rear].add(front);
        }

        for(int i = 1 ; i < arr.length; i++){
            System.out.println(arr[i].toString());
        }

        DFS(V);
        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
        br.close();

    }

    public static void DFS(int nodeIdx) {
        visited[nodeIdx] = true;
        System.out.printf("%d ->", nodeIdx);
        if (nodeIdx != 1) cnt++;
        for (int innerIdx : arr[nodeIdx]) {
            if (!visited[innerIdx]) {
                DFS(innerIdx);
            }
        }
    }

}
