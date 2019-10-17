package com.zili.oj;

import java.util.HashMap;
import java.util.Map;

public class LC_0003_longest_substr_without_repeating_char {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int N = s.length();
        if (N == 0) {
            return 0;
        }

        Map<Character, Integer> m = new HashMap<>();
        int l = 0;
        int r = 0;
        while (l < N) {
            m.clear();
            r = l;
//            System.out.println("");
//            System.out.println("[" + l + "] ->");
            while (r < N) {
                Character c = s.charAt(r);
                if (m.containsKey(c)) {
                    l = m.get(c) + 1;
                    ans = Math.max(ans, m.size());
//                    System.out.println(m.toString());
                    break;
                }
                m.put(c, r);
                r += 1;
            }
            if(r==N) {
                ans = Math.max(ans, m.size());
//                System.out.println(m.toString());
                break;
            }
        }

        return ans;
    }
}
