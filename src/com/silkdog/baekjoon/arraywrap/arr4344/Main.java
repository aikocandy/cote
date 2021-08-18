package com.silkdog.baekjoon.arraywrap.arr4344;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int line = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int prsn, tot = 0;
        float avg, abv = 0.00f;
        int[] arr;
        for (int i = 0; i < line; i++) {
            st = new StringTokenizer(br.readLine());
            prsn = Integer.parseInt(st.nextToken());
            arr = new int[prsn];
            for (int j = 0; j < prsn; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
                tot += arr[j];
            }
            avg = (tot / prsn);
            for (int k = 0; k < prsn; k++) {
                if (arr[k] > avg) abv++;
            }
            System.out.printf("%.3f%%\n", abv / prsn * 100);
            tot = 0;
            abv = 0;
        }

    }

}
