package com.zili.oj;

import jdk.internal.org.objectweb.asm.tree.IntInsnNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LC_0299_bulls_and_cows {
    public String getHint(String secret, String guess) {
        int nb = 0;
        int nc = 0;
        int N = secret.length();

        Set<Integer> bids = new HashSet<>();
        Map<Character, Integer> m = new HashMap<>();

        for (int i = 0; i < N; i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                bids.add(i);
                nb += 1;
                continue;
            }
            Character c = secret.charAt(i);
            if (m.containsKey(c)) {
                m.put(c, m.get(c) + 1);
            } else {
                m.put(c, 1);
            }
        }

//        System.out.println(m.toString());
        for (int i = 0; i < N; i++) {
            if(bids.contains(i)) continue;
            Character c = guess.charAt(i);
            if (m.containsKey(c)) {
                m.put(c, m.get(c) - 1);
//                System.out.println(m.toString());
                if(m.get(c)==0) m.remove(c);
                nc += 1;
            }
        }

        return nb + "A" + nc + "B";
    }
}
