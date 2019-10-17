package com.zili.oj;

public class LC_0848_shift_letters {
    public static String shiftingLetters(String S, int[] shifts) {
        StringBuilder sb = new StringBuilder(S);
        for (int i = 0; i < shifts.length; i++) {
            for (int j = 0; j <= i; j++) {
                sb.setCharAt(j, (char)((sb.charAt(j) + shifts[i] - 'a') % 26 + 'a'));
            }
        }
        return sb.toString();
    }
}
