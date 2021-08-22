package com.silkdog.baekjoon.backtrack.backtrack15649;

public class Main {
    /*
    4 2
     */
    public static void main(String[] args) {
        //int num = 4;
        int digit = 2;
        int[] num = new int[]{1,2,3,4};


        for (int j = 1; j < num.length+1; j++) {
            for (int i = 0; i < num.length; i++) {
                System.out.printf("%d %d\n",j,num[i]);
            }
        }
    }
}
