package com.silkdog.baekjoon.graphwrap.graph1260_2;

import java.io.*;
import java.util.*;

public class Main {

    /*
     그래프를 DFS로 탐색한 결과와 BFS로 탐색한 결과를 출력하는 프로그램을 작성하시오.
     단, "방문할 수 있는 정점이 여러 개인 경우에는 정점 번호가 작은 것을 먼저 방문"하고,
     더 이상 방문할 수 있는 점이 없는 경우 종료한다. 정점 번호는 1번부터 N번까지이다.
     */

    public static ArrayList<Integer>[] arr;
    public static boolean[] visited;
    public static Queue<Integer> q;
    public static StringBuilder sb;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());  // 정점
        int M = Integer.parseInt(st.nextToken());  // 간선
        int V = Integer.parseInt(st.nextToken()); // 시작 정점

        arr = new ArrayList[N+1];
        visited = new boolean[N+1];


        Arrays.fill(visited, false);
        for(int i =1; i < N+1; i++){
            arr[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            String[] arrStr = br.readLine().split(" ");
            int front = Integer.parseInt(arrStr[0]);
            int rear = Integer.parseInt(arrStr[1]);
            arr[front].add(rear);
            arr[rear].add(front);
        }

        // 배열 안의 정점을 오름차순 정렬
        for (int i = 1; i < N+1; i++) {
            ArrayList<Integer> tmpArr = arr[i];
            Collections.sort(tmpArr);
            arr[i] = tmpArr;
        }

        sb = new StringBuilder();
        DFS(V);
        bw.write(sb.toString().trim() +"\n");

        sb = new StringBuilder();
        BFS(V);
        bw.write(sb.toString().trim() +"\n");

        bw.flush();
        bw.close();
        br.close();

    }


    public static void DFS(int nodeIdx) {
        visited[nodeIdx] = true;
        sb.append(nodeIdx).append(" ");
        ArrayList<Integer> tmpArr = arr[nodeIdx];
        for(int innerIdx : arr[nodeIdx]){
            if(!visited[innerIdx]){
                DFS(innerIdx);
            }
        }
    }

    public static void BFS(int nodeIdx){
        q = new LinkedList<Integer>();
        q.offer(nodeIdx);
        Arrays.fill(visited, false); // 초기화
        visited[nodeIdx] = true;  // 정점 시작 방문처리

        while(!q.isEmpty()){
            int innerIdx = q.poll();
            sb.append(innerIdx).append(" ");
            for(int i = 0 ; i < arr[innerIdx].size(); i++){
                int tmp = arr[innerIdx].get(i);
                if(!visited[tmp]){
                    visited[tmp] = true;
                    q.offer(tmp);
                }
            }
        }
    }

}
