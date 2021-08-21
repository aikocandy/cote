package com.silkdog.baekjoon.sumwrap.sum10953;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        int a, b;
        String[] tmp;
        for (int i = 0; i < size; i++) {
            tmp = br.readLine().split(",");
            a = Integer.parseInt(tmp[0]);
            b = Integer.parseInt(tmp[1]);
            bw.write(String.valueOf(a+b) +"\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
