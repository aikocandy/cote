package com.silkdog.hash;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Hash1 {

    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Set<String> setComplete = new HashSet<>(Arrays.asList(completion));
        Set<String> setPart = new HashSet<>(Arrays.asList(participant));

        for (int i = 0; i < setPart.size(); i++) {
            setPart.remove(setComplete);
        }

        int j =1;

        return "";
    }

    public static void main(String args[]) {
        Hash1 hash1 = new Hash1();
        hash1.solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"});
    }

}
