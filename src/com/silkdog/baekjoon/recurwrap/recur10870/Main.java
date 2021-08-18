package com.silkdog.baekjoon.recurwrap.recur10870;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        fibo(0, 1, size);
        br.close();
    }

    public static void fibo(int start, int end, int cnt) {
        if (cnt <= 0) {
            System.out.println(start);
        } else {
            int result = start + end;
            start = end;
            end = result;
            cnt--;
            fibo(start, end, cnt);
        }
    }

}
