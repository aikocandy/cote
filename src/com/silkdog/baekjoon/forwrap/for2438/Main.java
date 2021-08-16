package com.silkdog.baekjoon.forwrap.for2438;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        String str = "";
        for(int i = 1 ; i <= size; i++){
            for(int j = 1; j <= i; j++){
                str += "*";
            }
            bw.write(str + "\n");
            str = "";
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
