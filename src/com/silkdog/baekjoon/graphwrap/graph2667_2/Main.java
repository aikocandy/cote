package com.silkdog.baekjoon.graphwrap.graph2667_2;

import java.util.ArrayList;

public class Main {

    static ArrayList<Integer>[] arr; // 2차원 배열
    static boolean[][] visited; // 방문여부

    public static void main(String[] args) {
        int size = 7;
        visited = new boolean[size+1][size+1];
        arr = new ArrayList[size+1];

        for(int i =0; i < size; i++){
            arr[i] = new ArrayList<>();
        }

        //Arrays.fill(visited, false);

        for(int i = 0 ; i < size; i++){
            for(int j = 0; j < size; j++){
                arr[i].add(j);
            }
        }

        for(int i = 0 ; i < size; i++){
            System.out.println(arr[i].toString());
        }
    }

    public static void DFS(int x, int y){
        visited[x][y] = true;
        for(int innerNode : arr[x]){
            if(!visited[x][innerNode]){
                DFS(x, innerNode);
            }
        }
    }

}
