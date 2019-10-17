package com.zili.oj;

public class LC_1108_defanging_ip {
    public static String defangIPaddr(String address) {
        String dfip="";
        for (int i = 0; i < address.length(); i++) {
            char c = address.charAt(i);
            if (c == '.') {
                dfip += "[.]";
            } else {
                dfip += c;
            }
        }
        return dfip;
    }
}
