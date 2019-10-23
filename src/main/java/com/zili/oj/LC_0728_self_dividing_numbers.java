package com.zili.oj;

import java.util.ArrayList;
import java.util.List;

public class LC_0728_self_dividing_numbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if(isSelfDividingNumber(i))
                ans.add(i);
        }
//        System.out.println(ans.toString());
        return ans;
    }

    private boolean isSelfDividingNumber(int i) {
//        System.out.println("checking "+i);
        for (char c : String.valueOf(i).toCharArray()) {
//            System.out.println(c);
            if (c == '0') {
//                System.out.println("contains 0, skip");
                return false;
            }
            if (i % (c - '0') != 0) {
//                System.out.println("not dividable, skip");
                return false;
            }
        }
//        System.out.println("yes");
        return true;
    }
}
