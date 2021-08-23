package com.silkdog.baekjoon.graphwrap.graph1260_4;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int[][] arr;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());  // 정점
        int M = Integer.parseInt(st.nextToken());  // 간선
        int V = Integer.parseInt(st.nextToken());   // 시작정점

        visited = new boolean[N + 1];
        arr = new int[N + 1][N + 1];

        Arrays.fill(visited, false);


    }
}
