package com.silkdog.baekjoon.print11718;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (String str = br.readLine(); str != null; str = br.readLine()) {
            bw.write(str + "\n");
//            System.out.print(str + "\n");
        }

        bw.flush();
        br.close();
        bw.close();

    }
}
