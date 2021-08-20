package com.silkdog.baekjoon.math1wrap.math10250;

public class Main {

    public static void main(String[] args) {
        int h = 6;
        int w = 12;
        String latter;
        for(int i = h ; i > 0; i--){
            for(int j = 1; j <= w; j++){
                latter = (j < 10) ? String.format("0%d", j) : String.format("%d", j);
                System.out.printf("%d%s ",i, latter);
            }
            System.out.printf("\n");
        }
        System.out.printf("엘베");
    }

}
