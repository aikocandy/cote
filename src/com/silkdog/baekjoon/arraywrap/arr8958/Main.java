package com.silkdog.baekjoon.arraywrap.arr8958;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/*

    // 모범답안

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine().trim());

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < T; i++) {
			String input = br.readLine().trim();

			int total = 0;
			int cumulative = 1;
			for (int k = 0; k < input.length(); k++) {
				if (input.charAt(k) == 'O') {
					total += (cumulative++);
				} else {
					cumulative = 1;
				}
			}
			sb.append(total + "\n");
		}
		System.out.println(sb);
	}
* */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        byte[] str;
        int cnt = 0;
        int total = 0;
        for(int i = 0 ; i < size; i++){
            str = br.readLine().getBytes(StandardCharsets.UTF_8);
            for (byte b : str) {
                if (b == 79) {
                    cnt++;
                    total += cnt;
                }
                if (b == 88) {
                    cnt = 0;
                }
            }
            System.out.println(total);
            cnt =0; total=0;
        }
    }
}
