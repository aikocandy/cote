package com.silkdog.baekjoon.whilewrap.while10951;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a, b, c;
        String line;
        while ((line = br.readLine()) != null) {
            if ("".equals(line)) {
                bw.flush();
                bw.close();
                br.close();
                System.exit(1);
            }
            a = Integer.parseInt(line.split(" ")[0]);
            b = Integer.parseInt(line.split(" ")[1]);
            c = a + b;
            bw.write(Integer.toString((c)) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

}


