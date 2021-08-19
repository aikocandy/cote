package com.silkdog.baekjoon.nocategory.notcate17609;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tot_cnt = Integer.parseInt(br.readLine());

        int[] arr_result = new int[tot_cnt];
        for (int x = 0; x < tot_cnt; x++) {
            char[] line = br.readLine().toCharArray();
            arr_result[x] = func(line);
        }

        for(int x = 0; x < arr_result.length; x++){
            System.out.printf("%d\n", arr_result[x]);
        }
    }

    public static int func(char[] line) {

        int size = 0;
        int cnt = 0;

        for (int i = 0; i < (size = line.length % 2 == 0 ? line.length / 2 : line.length / 2 + 1); i++) {
            if (String.valueOf(line[i]).equals(String.valueOf(line[line.length - i - 1]))) cnt++;
        }

        if (cnt == size) {
            return 0;
        } else {
            int idx = 0;
            char[] newline = new char[line.length - 1];

            while (idx < newline.length - 1) {
                for (int i = 0, k = 0; i < line.length; i++) {
                    if (i == idx) {
                        continue;
                    }
                    newline[k++] = line[i];
                }
                cnt = 0;
                for (int i = 0; i < (size = newline.length % 2 == 0 ? newline.length / 2 : newline.length / 2 + 1); i++) {
                    if (String.valueOf(newline[i]).equals(String.valueOf(newline[newline.length - i - 1]))) cnt++;
                }
                if (cnt == size) {
                    return 1;
                }
                idx++;
            }
        }
        return 2;
    }

}
