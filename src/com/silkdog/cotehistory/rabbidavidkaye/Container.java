package com.silkdog.cotehistory.rabbidavidkaye;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Container {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int tmp;

        ArrayList<Integer> all = new ArrayList<>();
        ArrayList<Integer> minus = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            tmp = Integer.parseInt(br.readLine());
            if (tmp < 0) {
                minus.add(tmp);
            }
            tmp = tmp < 0 ? tmp * -1 : tmp;
            all.add(tmp);
        }

        Collections.sort(all);

        for (int i = 0; i < size; i++) {
            tmp = all.get(i) * -1;
            if (minus.contains(tmp)) {
                all.set(i, tmp);
            }
        }

        int cnt = 1;

        for (int i = 0; i < size; i++) {
            if (i < size - 1) { // 어차피 마지막은 비교할 대상이 없으므로 패스
                if ((all.get(i) > 0 && all.get(i + 1) < 0 || all.get(i) < 0 && all.get(i + 1) > 0)) {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);

    }
}
