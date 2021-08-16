package com.silkdog.baekjoon.for10950;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());
        int a, b;
        String str;
        for(int i = 0; i < cnt; i++){
            str = br.readLine();
            a = Integer.parseInt(str.split(" ")[0]);
            b = Integer.parseInt(str.split(" ")[1]);
            bw.write(Integer.toString(a + b) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
