package com.silkdog.baekjoon.arraywrap.array2562;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int cnt = 0, big = Integer.MIN_VALUE, idx = cnt;
        while ((str = br.readLine()) != null && str.length() != 0) {
            cnt++;
            if (big < Integer.parseInt(str)){
                big = Integer.parseInt(str);
                idx = cnt;
            }

        }

        System.out.println(big);
        System.out.println(idx);
    }
}
