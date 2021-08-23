package com.silkdog.baekjoon.graphwrap.graph2667;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    static ArrayList<Integer>[] arrInput;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        String str;

        arrInput = new ArrayList[size+1];
        visited = new boolean[size+1];

        for(int i = 1; i < size+1; i++){
            arrInput[i] = new ArrayList<>();
        }

        for(int i = 1 ; i < size+1; i++){
            str = br.readLine();
            for(int j = 0 ; j < str.length(); j++){
                if(str.charAt(j) != '0'){
                    arrInput[i].add(j);
                }
            }
        }

        for(int i = 1; i < size+1; i++){
            System.out.println(arrInput[i].toString());
        }

        DFS(2);

    }

    public static void DFS(int nodeIdx) {
        visited[nodeIdx] = true;
        System.out.printf("%d ->", nodeIdx);
        for (int innerIdx : arrInput[nodeIdx]) {
            if (!visited[innerIdx]) {
                DFS(innerIdx);
            }
        }
    }
}
