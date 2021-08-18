package com.silkdog.baekjoon.strwrap.str11654;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) throws IOException {
        /*
        	int ch = System.in.read();
		    System.out.println(ch);
        * */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(br.readLine().getBytes(StandardCharsets.UTF_8)[0]);

    }
}
