package com.silkdog.baekjoon.funcwrap.func1065;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    // TODO: 못풀었음...
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 1; i < input; i++) {
            if (test(i)) cnt++;
        }

        System.out.println(cnt);

    }

    public static boolean test(int num) {
        if (num < 100) return true;
        int digit = Integer.toString(num).length();
        boolean flag = true;
        int a,b, c;
        a = num % 10;
        b = num/10 % 10;
        c = num/100 % 10;
        if(a-b != b-c) flag= false;
        num /= 10;
        return flag;
    }

}
