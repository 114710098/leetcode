package com.zili.oj;

import java.util.HashSet;

public class LC_0771_jewels_and_stones {
    public int numJewelsInStones(String J, String S) {
        int ans=0;
        HashSet<Character> jset=new HashSet<Character>();
        for(int i=0;i<J.length();i++) jset.add(J.charAt(i));
        for(int i=0;i<S.length();i++){
            if(jset.contains(S.charAt(i))) ans+=1;
        }
        return ans;
    }
}
