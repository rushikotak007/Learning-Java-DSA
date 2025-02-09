package com.CodingRK;

public class reverseNumber {
    public static int reverseNum(int inputNum) {
        int outputNum =0;

        while(inputNum>0){
            int curr = inputNum%10;
            outputNum= (outputNum*10) + curr;
            inputNum/=10;
        }

        return outputNum;
    }

    public static void main(String[] args) {
        System.out.println(reverseNum(1233));
    }
}
