package com.silkdog.baekjoon.forwrap.for10871;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    /**
     * @number: 10871
     * @description: 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
     * */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = br.readLine();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int limit = Integer.parseInt(line.split(" ")[1]), b;
        StringBuilder str = new StringBuilder();

        while (st.hasMoreTokens()) {
            b = Integer.parseInt(st.nextToken());
            if (b < limit) {
                str.append(b + " ");
            }
        }
        str.deleteCharAt(str.length() - 1);
        bw.write(str.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
