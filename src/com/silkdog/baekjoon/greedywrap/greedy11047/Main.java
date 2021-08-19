package com.silkdog.baekjoon.greedywrap.greedy11047;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int size = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());

        int best = 0, mul;
        int[] coin = new int[size];
        int curr_coin;

        for(int i = 0 ; i < size; i++){
            coin[i] = Integer.parseInt(br.readLine());
        }

        for (int i = size; 0 < i; i--) {
            curr_coin = coin[i - 1];
            if (target < 0) { // 남은 금액이 0보다 작을 경우
                break;
            } else if (target < curr_coin) { // 남은 금액이 현재 동전가치보다 작을 경우
                continue;
            } else {
                mul = (target / curr_coin);
                best += mul;
                target -= mul * curr_coin;
            }
        }
        System.out.println(best);
    }

}
