package com.silkdog.baekjoon.graphwrap.graph1260_4;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
//
//    static int[][] arr;
//    static boolean[] visited;
//
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        int N = Integer.parseInt(st.nextToken());  // 정점
//        int M = Integer.parseInt(st.nextToken());  // 간선
//        int V = Integer.parseInt(st.nextToken());   // 시작정점
//
//        visited = new boolean[N + 1];
//        arr = new int[N + 1][N + 1];
//
//        Arrays.fill(visited, false);
//        for (int i = 1; i < N + 1; i++) {
//            arr[i] = new int[N + 1];
//        }
//
//        String[] str;
//        int front, rear;
//        for (int i = 0; i < M; i++) {
//            str = br.readLine().split(" ");
//            front = Integer.parseInt(str[0]);
//            rear = Integer.parseInt(str[1]);
//            arr[i][front] = rear;
//            arr[i][rear] = front;
//        }
//
//        // 배열 안의 정점을 오름차순 정렬
//        for (int i = 0; i < N+1; i++) {
//            int[] tmpArr = arr[i];
//            Arrays.sort(tmpArr);
//            arr[i] = tmpArr;
//        }
//
//        DFS(V);
//    }
//
//
//    public static void DFS(int nodeIdx){
//        visited[nodeIdx] = true;
//        System.out.printf("%d ->", nodeIdx);
//        for(int innerIdx : arr[nodeIdx]){
//            if(!visited[innerIdx] && innerIdx != 0){
//                DFS(innerIdx);
//            }
//        }
//    }
}
