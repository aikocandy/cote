package com.silkdog.baekjoon.greedywrap.greedy1541;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // 55-50+40    |     -35

        String str = "55-50+40";
        int result = Integer.parseInt(str);

        System.out.println(result);

//        String[] strArr = str.split("\\+|-");
//        ArrayList<String> strSign = new ArrayList<>();
//
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == 43 || str.charAt(i) == 45) {
//                strSign.add(String.valueOf(str.charAt(i)));
//            }
//        }
//
//        for (int i = 1; i < strArr.length; i++) {
//            if (!strSign.get(i - 1).equals("+")) {
//                strArr[i] = String.valueOf(Integer.parseInt(strArr[i]) * -1);
//            }
//        }

        System.out.println("dd");

    }

}
