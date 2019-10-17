package com.zili.oj;

import java.util.HashSet;
import java.util.Set;

public class LC_0804_unique_morse_code_words {
    public int uniqueMorseRepresentations(String[] words) {
        String[] dict = new String[]{ ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        Set<String> s = new HashSet<>();
        String ms = "";
        for (String w : words) {
            ms = "";
            for(char c:w.toCharArray())
                ms += dict[c - 'a'];
            s.add(ms);
        }
//        System.out.println(s.toString());
        return s.size();
    }
}
