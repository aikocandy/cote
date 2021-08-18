package com.silkdog.baekjoon.strwrap.str11720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Main {

    /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[] numbers = br.readLine().toCharArray();
        int total = 0;

        for (int i = 0; i < N; i++) {
            total += Integer.parseInt(String.valueOf(numbers[i]));
        }
        System.out.println(total);
	*/
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int tot =0;
        byte[] line = br.readLine().getBytes(StandardCharsets.UTF_8);
        for(int i = 0 ; i < size; i++){
            tot += Integer.parseInt(new String(new byte[]{line[i]}));
        }

        System.out.println(tot);
    }

}
