package com.CodingRK;

public class RecursionBasics {
    public static void printInc(int n){
        if(n==0){
            return;
        }
        printInc(n-1);
        System.out.println(n + " ");


    }



    public static int sumOfNaturalNumbers(int n){
        if(n == 1){
            return 1;
        }
        int sum = n + sumOfNaturalNumbers(n-1);
        return sum;
    }

    public static int fibonacciNumber(int n){
        if(n==1){
            return 0;
        }

        if(n==2){
            return 1;
        }

        return fibonacciNumber(n-2)+fibonacciNumber(n-1);

    }

    public static void main(String[] args) {
        System.out.println(sumOfNaturalNumbers(10));
    }
}
