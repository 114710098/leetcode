package com.zili.oj;

import java.util.HashMap;
import java.util.Map;

public class LC_0290_word_pattern {
    public boolean wordPattern(String pattern, String str) {
        String[] ws = str.split(" ");
        if(ws.length!=pattern.length()) return false;

        Map<String, Character> m1 = new HashMap<>();
        Map<Character, String> m2 = new HashMap<>();
        for (int i = 0; i < ws.length; i++) {
            String w = ws[i];
            Character p = pattern.charAt(i);
            if (m1.containsKey(w)) {
                if (!m1.get(w).equals(p)) return false;
            } else m1.put(w, p);
            if (m2.containsKey(p)) {
                if (!m2.get(p).equals(w)) return false;
            } else m2.put(p, w);
        }
        return true;
    }
}
