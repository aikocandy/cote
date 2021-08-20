package com.silkdog.dp;

public class DpTest1 {
    public static int[] d = new int[100];

    public static void main(String[] args) {
        System.out.printf("%d", fibonacci(30));
    }

    public static int fibonacci(int x){
        if(x == 1) return 1;
        if(x==2) return 1;
        if(d[x] != 0) return d[x];
        return d[x] = fibonacci(x-1) + fibonacci(x-2);
    }
}
