package com.silkdog.baekjoon.bruteforcewrap.bruteforce2798;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 6, 7, 8, 9};
        int[] arrDesc = Arrays.stream(arr).boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

        int cnt = 0;
        for (int i = 0; i < arrDesc.length - 2; i++) {
            for (int j = i + 1; j < arrDesc.length - 1; j++) {
                for (int k = j + 1; k < arrDesc.length; k++) {
                    if ((arrDesc[i] + arrDesc[j] + arrDesc[k]) <= 21) {
                        cnt++;
                        System.out.printf("%d %d %d\n", arrDesc[i], arrDesc[j], arrDesc[k]);
                    }

                }
            }

        }
        //System.out.println(cnt * 3);

    }
}
