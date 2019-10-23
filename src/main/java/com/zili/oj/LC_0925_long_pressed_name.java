package com.zili.oj;

public class LC_0925_long_pressed_name {
    public boolean isLongPressedName(String name, String typed) {
        boolean ans = false;
        int i=0;
        int j=0;

        if(name.length()>typed.length()) return false;
        char pre = ' ';
        char c1, c2;
        while (i < name.length() && j < typed.length()) {
            c1 = name.charAt(i);
            c2 = typed.charAt(j);
            if (c1 == c2) {
                i++;
                j++;
                pre = c1;
            } else {
                if (c2 == pre) {
                    j++;
                } else {
                    return false;
                }
            }
        }
        if(i<name.length()) return false;
        if (j < typed.length()) {
            for (int x = j; x < typed.length(); x++) {
                if(typed.charAt(x)!=pre) return false;
            }
        }

        return true;
    }
}
