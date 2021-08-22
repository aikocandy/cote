package com.silkdog.baekjoon.graphwrap.graph1260;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    static ArrayList<Integer>[] arr;
    static Queue<Integer> q;
    static boolean[] visited;// = new boolean[graph.length];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());  // 정점 수
        int m = Integer.parseInt(st.nextToken());  // 간선 수
        int V = Integer.parseInt(st.nextToken());  // 탐색시작 정점

        arr = new ArrayList[n+1];
        visited = new boolean[n + 1];
        Arrays.fill(visited, false);

        for (int i=1; i<=n; i++) {
            arr[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < m; i++) {
            String[] tmp = br.readLine().split(" ");
            int a = Integer.parseInt(tmp[0]);
            int b = Integer.parseInt(tmp[1]);
            arr[a].add(b);
            arr[b].add(a); // 서로 이어주는 부분
        }

        dfs(V);
        bfs(V);

        System.out.println("");
        System.out.println("arr : "+Arrays.toString(arr));
        System.out.println("visited : "+Arrays.toString(visited));
    }

    protected static void dfs(int idx) {
        visited[idx] = true;  // memoization
        System.out.print(idx + " -> ");
        for (int node : arr[idx]) {
            if (!visited[node]) {
                dfs(node);  // 가본적 없으면 dfs 탐색
            }
        }
    }

    protected static void bfs(int idx){
        q = new LinkedList<>();
        q.offer(idx);

        visited[idx] = true;

//        while(!q.isEmpty()){
//            int intTmp = q.poll();
//            for(int i =0 ; i < )
//        }


    }

}
