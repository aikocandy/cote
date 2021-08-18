package com.silkdog.baekjoon.funcwrap.func4673;

public class Main {

    // 모범답안
    // https://www.acmicpc.net/source/17533883

    public static void main(String[] args) {
        int[] arr = new int[10001];
        for (int i = 1; i <= 10000; i++) {
            if (!(d(i) > 10000)) {
                arr[d(i)] = d(i);
            }
        }

        for (int i = 1; i <= 10000; i++) {
            if (arr[i] == 0)
                System.out.println(i);
        }
    }

    protected static int d(int num) {
        String strNum = Integer.toString(num);
        int tot = 0;
        for (int i = 0; i < strNum.length(); i++) {
            tot += Integer.parseInt(String.valueOf(strNum.charAt(i)));
        }
        return num + tot;
    }
}
