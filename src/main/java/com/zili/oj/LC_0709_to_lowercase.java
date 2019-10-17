package com.zili.oj;

public class LC_0709_to_lowercase {
    public static String toLowerCase(String str) {
        String lcstr = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                c += 32;
            }
            lcstr += c;
        }
        return lcstr;
    }

    public static void main(String[] args) {
        System.out.println('a'-'A');    // uppercase + 32 = lowercase
    }
}

