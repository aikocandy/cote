package com.silkdog.baekjoon.whilewrap.while1110;

import java.io.*;

public class Main {

    /**
     * @number: 1110
     * @description: N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성하시오.
     * @remind: 자릿수 나머지를 가지고 계산하면 되는데 괜히 이상한 부분(Conversion)에 꽂혀서 시간을 낭비했다...
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String newLine = line;
        int cnt = 0;

        do {
            if (Integer.parseInt(newLine) < 10) {
                newLine = "0" + newLine;
            }

            int a = Integer.parseInt(newLine.substring(0, 1));
            int b = Integer.parseInt(newLine.substring(1));
            newLine = String.format("%d%d", b, (a + b) % 10);
            cnt++;
        } while (Integer.parseInt(line) != Integer.parseInt(newLine));

        System.out.println(cnt);
    }
}
