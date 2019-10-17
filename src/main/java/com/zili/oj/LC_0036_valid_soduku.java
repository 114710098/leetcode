package com.zili.oj;

import java.util.HashSet;
import java.util.Set;

public class LC_0036_valid_soduku {
    public static boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                if(!validSubBox(board,i,j)) return false;
            }
        }
        for (int i = 0; i < 9; i++) {
            if(!validRow(board,i)||!validColumn(board,i)) return false;
        }
        return true;
    }

    private static boolean validSubBox(char[][] a, int x, int y) {
        System.out.println("validing sub-box: [" + x + "," + y + "]");
        Set<Character> s = new HashSet<>();
        for (int i = x; i < x+3; i++) {
            for (int j = y; j < y+3; j++) {
                if(a[i][j]=='.') continue;
                if (!s.add(a[i][j])) {
                    System.out.println("invalid sub-box: [" + i + "," + j + "]");
                    System.out.println(s.toString());
                    System.out.println(a[i][j]);
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean validRow(char[][] a, int row) {
        Set<Character> s = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            if(a[row][i]=='.') continue;
            if (!s.add(a[row][i])) {
//                System.out.println("invalid row: [" + i + "," + row + "]");
//                System.out.println(s.toString());
//                System.out.println(a[row][i]);
                return false;
            }
        }
        return true;
    }

    private static boolean validColumn(char[][] a, int col) {
        Set<Character> s = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            if(a[i][col]=='.') continue;
            if (!s.add(a[i][col])) {
//                System.out.println("invalid column: [" + col + "," + i + "]");
//                System.out.println(s.toString());
//                System.out.println(a[i][col]);
                return false;
            }
        }
        return true;
    }
}
