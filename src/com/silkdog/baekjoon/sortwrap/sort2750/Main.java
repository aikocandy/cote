package com.silkdog.baekjoon.sortwrap.sort2750;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (Integer.parseInt(br.readLine()));
        }
        Arrays.sort(arr);

        for(Integer i : arr){
            System.out.println(i);
        }
    }
}