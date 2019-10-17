package com.zili.oj;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//compare A and B
//  if(ndiff>2) false
//  if(ndiff==2) true
//  if(ndiff==1) false
//  if(ndiff==0) true(contains dup-char), false(no dup-char)
public class LC_0859_buddy_strings {
    public boolean buddyStrings(String A, String B) {
        if(A.length()!=B.length()) return false;
        int ndiff=0;
        char a1=0;
        char a2=0;
        char b1=0;
        char b2=0;
//        Set<Character> diffset_a = new HashSet<>();
//        Set<Character> diffset_b = new HashSet<>();
        for (int i = 0; i < A.length(); i++) {
            if(A.charAt(i)!= B.charAt(i)) {
                ndiff += 1;
                if (a1 == 0) a1 = A.charAt(i);
                else a2 = A.charAt(i);
                if (b1 == 0) b1 = B.charAt(i);
                else b2 = B.charAt(i);
//                diffset_a.add(A.charAt(i));
//                diffset_b.add(B.charAt(i));
            }
            if(ndiff>2)
                return false;
        }
        if(ndiff>2) return false;
        if(ndiff==2){
//            if(diffset_a.equals(diffset_b)) return true;
            if(a1==b2&&a2==b1) return true;
            if(a1==b1&&a1==b1) return true;
            return false;
        }

        if(ndiff==1) return false;
        if (ndiff == 0) {
//            System.out.println("same string");
            Set<Character> s = new HashSet<>();
            for(char c:A.toCharArray()) s.add(c);
//            System.out.println(A.toCharArray().toString());
//            System.out.println(s.toString());
//            System.out.println(s.size());
            return s.size()!=A.length();
        }
        return true;
    }
}
