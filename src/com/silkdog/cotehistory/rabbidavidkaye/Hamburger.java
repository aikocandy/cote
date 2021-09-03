package com.silkdog.cotehistory.rabbidavidkaye;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Hamburger {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int size = Integer.parseInt(input);

        ArrayList<Integer> arr1 = new ArrayList<>(size);
        ArrayList<Integer> arr2 = new ArrayList<>(size);

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < size; i++) {
            arr1.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < size; i++) {
            arr2.add(Integer.parseInt(st.nextToken()));
        }


        Collections.sort(arr1, Collections.reverseOrder());
        Collections.sort(arr2);

        int stack = 0;
        int last = 0;

        for (int i = 0; i < size; i++) {
            last = arr1.get(i) + arr2.get(i);
            if (i != size - 1) {
                stack += arr2.get(i);
            }
        }

        System.out.println(stack + last);


    }
}
