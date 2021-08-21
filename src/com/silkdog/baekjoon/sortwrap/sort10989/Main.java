package com.silkdog.baekjoon.sortwrap.sort10989;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        int[] arr= new int[size];
        int[] arr_sorted= new int[size];
        int[] arr_count = new int[100000000];

        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int i = 0; i < arr.length; i++){
            arr_count[arr[i]]++;
        }

        for(int i = 1 ; i < arr.length; i++){
            arr_count[i] += arr_count[i -1];
        }

        for(int i = arr.length -1 ; i >= 0; i--){
            arr_sorted[arr_count[arr[i]]] = arr[i];
            arr_count[arr[i]]--;
        }

        for(int i = 0 ; i < arr_sorted.length; i++){
            sb.append(arr_sorted[i]).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }
}
