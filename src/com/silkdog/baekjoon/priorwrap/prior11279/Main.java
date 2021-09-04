package com.silkdog.baekjoon.priorwrap.prior11279;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);

        int coup = n / m;
        int tmp = coup;

        while(tmp / m > 0){
            tmp = coup / m;
            coup += tmp;
        }

        coup += n;

        System.out.println(coup);
    }
}