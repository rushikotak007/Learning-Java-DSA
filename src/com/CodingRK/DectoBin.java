package com.CodingRK;

public class DectoBin {
    public static int DecToBin(int dec){
        int highestPow = 0;
        int bin = 0;

        while ( (int)Math.pow(2,highestPow) < dec ){
            highestPow++;
        }
        return highestPow;
    }
    public static void main(String[] args) {

    }
}
