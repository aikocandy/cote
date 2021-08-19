package com.silkdog.baekjoon.greedywrap.greedy1931;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int sum = 0;
        int[] time = new int[size];

        for (int i = 0; i < size; i++) {
            time[i] = Integer.parseInt(st.nextToken());
        }

        int tot = 0;
        for (int i = 0; i < size; i++) {
            System.out.printf("before: %d\n", tot);
            System.out.printf("summary:%d\n", summary(i+1, time));
            tot += summary(i, time);

            System.out.printf("after: %d\n", tot);
        }

        //System.out.println(tot);

    }

    public static int summary(int cnt, int[] time) {
        int tot = 0;
        for (int i = 0; i < cnt; i++) {
            tot = tot + time[i];
        }
        return tot;
    }

}
