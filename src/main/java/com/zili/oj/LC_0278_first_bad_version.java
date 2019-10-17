package com.zili.oj;

public class LC_0278_first_bad_version {
    private int badVer = 0;
    void setBadVersion(int ver) {
//        System.out.println("set new bad version");
        badVer = ver;
    }
    boolean isBadVersion(int version) {
//        System.out.println("called");
        return version >= badVer;
    }

    public int firstBadVersion(int n) {
        long l = 0;
        long r = n;
        long m = 0;

        while (l < r) {
            m = (l + r) / 2;
            if(l+1==r) return (int)r;
            if(isBadVersion((int)m)) r=m;
            else l=m;
//            System.out.println("["+l+","+r+"]");
        }

        return (int) m;
    }
}

