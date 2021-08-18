package com.silkdog.baekjoon.arraywrap.arr3052;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    /*

    // 모범답안
    public class Main {
        public static void main(String args[]) throws IOException {
            InputStream in = System.in;
            InputStreamReader reader = new InputStreamReader(in);
            BufferedReader br = new BufferedReader(reader);
            HashSet<Integer> remainderSet = new HashSet<>();
            for(int i=0; i<10; i++){
                int input = Integer.valueOf(br.readLine());
                remainderSet.add(input%42);
            }
            System.out.println(remainderSet.size());
        }
    }

    * */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int tmp;
        boolean flag = true;
        List<Integer> lst = new ArrayList<>();

        while ((str = br.readLine()) != null && str.length() > 0) {
            tmp = Integer.parseInt(str);
            if (lst.size() == 0) {
                lst.add(tmp % 42);
            } else {
                for (Integer integer : lst) {
                    if (integer == tmp % 42) {
                        flag = false;
                        break;
                    }
                }
                if (flag) lst.add(tmp % 42);
            }
            flag = true;
        }

        System.out.println(lst.size());
    }
}
