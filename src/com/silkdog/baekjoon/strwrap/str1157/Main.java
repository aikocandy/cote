package com.silkdog.baekjoon.strwrap.str1157;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    /*
    * // 모범답안.. ㅜㅜ
    * https://www.acmicpc.net/source/30036402
    * */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().toUpperCase(Locale.ROOT).split("(?<!^)");
        Arrays.sort(line);

        Map<String, Integer> map = new HashMap<>();
        int tmp;
        for (String s : line) {
            if (map.containsKey(s)) {
                tmp = map.get(s);
                map.put(s, tmp + 1);
            } else {
                map.put(s, 1);
            }
        }

        String maxChar = "";
        int max = Integer.MIN_VALUE;
        Object[] set = map.keySet().toArray();
        for (int i = 0; i < map.size(); i++) {
            if (max < map.get(set[i])) {
                maxChar = String.valueOf(set[i]);
                max = map.get(set[i]);
            } else if (max == map.get(set[i])) {
                maxChar = "?";
            }
        }

        System.out.println(maxChar);

    }
}
