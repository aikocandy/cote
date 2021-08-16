package com.silkdog.baekjoon.forwrap.for8393;

import java.io.*;

public class Main {

    /**
     * @number: 8393
     * @description: n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
     * */
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
