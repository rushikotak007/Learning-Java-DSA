package com.CodingRK;

public class BinToDec {
    public static int binaryToDec(int binNum){
        int pow = 0;
        int decNum = 0;

        while(binNum>0){
            int lastDigit = binNum%10;
            if (lastDigit==1){
                decNum = decNum + (int)Math.pow( 2, pow );
            }
            binNum /= 10;
            pow++;
        }

        return decNum;
    }
    public static void main(String[] args) {
        System.out.print(binaryToDec(1011));
    }
}
