package com.silkdog.baekjoon.forwrap.for15552;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        String line;
        int a, b;
        for(int i = 0 ; i < size; i++){
            line = br.readLine();
            a = Integer.parseInt(line.split(" ")[0]);
            b = Integer.parseInt(line.split(" ")[1]);
            bw.write(a + b + "\n");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
