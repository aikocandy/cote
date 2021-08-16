package com.silkdog.baekjoon.if2884;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = br.readLine();
        int a = Integer.parseInt(line.split(" ")[0]);
        int b = Integer.parseInt(line.split(" ")[1]);

        if (b < 45) {
            --a;
            b = b - 45 + 60;
        }else{
            b = b - 45;
        }
        if (a < 0) {
            a += 24;
        }

        bw.write(a + " " + b);

        bw.flush();
        br.close();
        bw.close();
    }
}
