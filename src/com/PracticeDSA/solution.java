package com.PracticeDSA;

import java.util.*;

public class solution {
    public static void main(String args[]) {
        String word1 = "abc";
        String word2 = "pqrst";
        StringBuilder sb = new StringBuilder();
        int i = 0;

        mergeAlternately(word1, word2, sb);

        System.out.println(sb);
    }

    public static void mergeAlternately(String word1, String word2, StringBuilder sb) {
        int i = 0;
        while (i < (word1.length() + word2.length())) {
            if (i < word1.length()) {
                sb.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                sb.append(word2.charAt(i));
            }
            i++;
        }
    }
}
