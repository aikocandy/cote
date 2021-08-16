package com.silkdog.baekjoon.forwrap.for2439;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        StringBuilder strA = new StringBuilder();
        StringBuilder strB = new StringBuilder();
        strB.append(" ".repeat(Math.max(0, size)));
        for(int i = 0; i < size; i++){
            strA.append("*");
            strB.deleteCharAt(0);
            bw.write(strB + "" + strA + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

}
