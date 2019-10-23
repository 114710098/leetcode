package com.zili.oj;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;
import java.util.concurrent.DelayQueue;

public class LC_0844_backspace_string_compare {
    public boolean backspaceCompare(String S, String T) {
        Deque<Character> s1 = new ArrayDeque<>();
        Deque<Character> s2 = new ArrayDeque<>();

        for (char c : S.toCharArray()) {
            if (c != '#') {
                s1.push(c);
            } else {
                if(!s1.isEmpty())
                    s1.pop();
            }
        }
        for (char c : T.toCharArray()) {
            if (c != '#') {
                s2.push(c);
            } else {
                if(!s2.isEmpty())
                    s2.pop();
            }
        }
//        System.out.println(s1.toString());
//        System.out.println(s2.toString());
        return compare(s1,s2);
    }

    private boolean compare(Deque<Character> dq1, Deque<Character> dq2) {
        if(dq1.size()!=dq2.size()) return false;
        while (!dq1.isEmpty()) {
            if(dq1.pop()!=dq2.pop()) return false;
        }
        return true;
    }
}
