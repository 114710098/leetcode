package com.zili.oj;

import java.util.HashSet;
import java.util.Set;

public class LC_0961_n_repeated_element_in_size_2n_array {
    public int repeatedNTimes(int[] A) {
        Set<Integer> m = new HashSet<>();
        for (int i : A) {
            if(m.contains(i)) return i;
            else m.add(i);
        }
        return 0;
    }
}
