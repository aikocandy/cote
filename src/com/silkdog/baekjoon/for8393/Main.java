package com.silkdog.baekjoon.for8393;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input =  Integer.parseInt(br.readLine());
        int res = 0;
        for(int i = input; i > 0; i--){
            res += i;
        }

        bw.write(Integer.toString(res));
        bw.flush();
        bw.close();
        br.close();
    }

}
