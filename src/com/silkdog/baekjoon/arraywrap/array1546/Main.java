package com.silkdog.baekjoon.arraywrap.array1546;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    /*
        // 모범답안
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		final int total = Integer.parseInt(br.readLine());
		final String[] input = br.readLine().split(" ");
		int score = 0;
		int sum = 0;
		int max = 0;
		int i = 0;
		for ( i = 0; i < input.length; i++ ) {
			score = Integer.parseInt(input[i]);
			sum += score;
			max = score > max ? score : max;
		}
		System.out.println(Math.round(sum * 10000.0 / max / total) / 100.0);
    */
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[size];
        int max = Integer.MIN_VALUE, tmp, cnt = 0;
        float tot = 0.00f;
        while (st.hasMoreTokens()) {
            tmp = Integer.parseInt(st.nextToken());
            if (max < tmp) max = tmp;
            arr[cnt] = tmp;
            cnt++;
        }

        for (int i = 0; i < size; i++) {
            tot = tot + ((float) arr[i] / max) * 100;
        }
        System.out.println(tot / size);
    }

}
