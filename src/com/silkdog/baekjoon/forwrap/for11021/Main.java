package com.silkdog.baekjoon.forwrap.for11021;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        String line; int a,b;
        for(int i = 1; i <= size; i++){
            line = br.readLine();
            a = Integer.parseInt(line.split(" ")[0]);
            b = Integer.parseInt(line.split(" ")[1]);

            bw.write("Case #"+i+": " + (a + b) +"\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
