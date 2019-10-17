package com.zili.oj;

public class LC_1021_remove_outermost_parentheses {
    public String removeOuterParentheses(String S) {
//        System.out.println(S);
        StringBuilder ans = new StringBuilder();

        int np = 0;
        for (char c : S.toCharArray()) {
            if (c == '(') {
                np += 1;
                if(np>1) ans.append(c);
            } else {
                np -= 1;
                if(np!=0) ans.append(c);
            }
//            System.out.println(tmp.toString());
        }
        return ans.toString();
    }
}
