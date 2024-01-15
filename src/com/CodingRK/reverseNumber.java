package com.CodingRK;

public class reverseNumber {
    public static int reverseNum(int inputNum) {
        int rev = 0;
        while (inputNum != 0) {
            int lastDigit = inputNum % 10;
            rev = (rev * 10) + lastDigit;
            inputNum /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println(reverseNum(1233));
    }
}
