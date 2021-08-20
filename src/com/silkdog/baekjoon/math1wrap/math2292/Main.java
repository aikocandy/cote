package com.silkdog.baekjoon.math1wrap.math2292;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    // 13 -> 3
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long line = Long.parseLong(br.readLine());

        long sum = 1;
        int i = 0;

        if(line == 1){
            i = 1;
        }else{
            while(line > sum){
                sum += (6 * i);
                i++;
            }
        }



        System.out.println(i);
    }
}
