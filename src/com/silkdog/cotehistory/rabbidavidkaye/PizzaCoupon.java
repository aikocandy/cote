package com.silkdog.cotehistory.rabbidavidkaye;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PizzaCoupon {

    static int cnt = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);

        n = n * m;
        recur(n, m);

        System.out.println(cnt);

    }

    public static void recur(int piz, int m) {
        int result = piz / m;
        int leftover = piz % m;
        cnt += result;
        if (result + leftover >= m) recur(result + leftover, m);
    }
}
