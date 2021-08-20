package com.silkdog.baekjoon.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj13297 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int[] arr = new int[size];
        String str;

        for(int i = 0 ; i < size; i++){
            str = br.readLine();
            arr[i] = str.length();
        }

        for(int i = 0 ; i < size; i++){
            System.out.println(arr[i]);
        }

        br.close();
    }

}
