package com.silkdog.baekjoon.arraywrap.array2577;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        byte[] bytes = Integer.toString(a * b * c).getBytes(StandardCharsets.UTF_8);
        int[] arr = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0; i < bytes.length; i++) {
            arr[Integer.parseInt(new String(new byte[]{bytes[i]}))] += 1;
        }

        for (int i = 0; i < arr.length; i++) {
            bw.write( arr[i]+"\n");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
