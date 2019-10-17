package com.zili.oj;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LC_0720_longest_word_in_dict {
    private String max(String s1, String s2) {
//        System.out.println("compare: " + s1 + ", " + s2);
        int N1 = s1.length();
        int N2 = s2.length();
        if (N1 > N2) return s1;
        if (N1 < N2) return s2;
        for (int i = 0; i < N1; i++) {
            if(s1.charAt(i)==s2.charAt(i)) continue;
            if(s1.charAt(i)<s2.charAt(i)) return s1;
            if(s1.charAt(i)>s2.charAt(i)) return s2;
        }
        return s1;
    }

    public static final int NA = 0;
    public static final int FOUND_GOOD_PATH = 1;
    public static final int FOUND_BAD_PATH = 2;
    public static final int IN_GOOD_PATH = 3;
    public static final int IN_BAD_PATH = 4;

    public String longestWord(String[] words) {
        String ans = "";

        //map:
        //  key: word
        //  value: 0-n/a, 1-possible, 2-impossible
        Map<String, Integer> m = new HashMap<>();
        for (String w : words) m.put(w, NA);

        Set<String> path = new HashSet<>();    //words in the path
        int res = NA;
        for (String w : words ) {
            res = NA;
            if(m.get(w)!= NA) continue;
            String tmp= w;
            while (tmp.length() > 0) {
                path.add(tmp);
                if(!m.containsKey(tmp) || m.get(tmp)==IN_BAD_PATH) {
                    res = FOUND_BAD_PATH;
                    break;
                }
                if (m.get(tmp) == IN_GOOD_PATH) {
                    res = FOUND_GOOD_PATH;
                    break;
                }
                tmp = tmp.substring(0, tmp.length() - 1);
                if(tmp.length()==0) res = FOUND_GOOD_PATH;
            }
            if (res == FOUND_BAD_PATH) {
                //bad path
                for (String st : path)
                    m.put(st, IN_BAD_PATH);
//                System.out.println("bad path: " + path.toString());
            } else {
                //good path
                for (String st : path) m.put(st, IN_GOOD_PATH);
                ans = max(ans, w);
//                System.out.println("good path: " + path.toString());
            }
            path.clear();
        }
        return ans;
    }
}
