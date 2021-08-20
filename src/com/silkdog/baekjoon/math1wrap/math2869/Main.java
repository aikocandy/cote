package com.silkdog.baekjoon.math1wrap.math2869;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        long V = Integer.parseInt(st.nextToken());
        long sum;

        if(V % (A-B) == 0){
            sum = V - B;
        }else {
            sum = V / (A-B) + 1;
        }

        System.out.println(sum);
    }
}
