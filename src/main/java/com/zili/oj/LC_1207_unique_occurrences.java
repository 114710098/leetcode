package com.zili.oj;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LC_1207_unique_occurrences {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int i : arr) {
            if(m.containsKey(i))
                m.put(i, m.get(i) + 1);
            else
                m.put(i, 1);
        }

        Set<Integer> s = new HashSet<>(m.values());
        return s.size() == m.size();
    }
}
