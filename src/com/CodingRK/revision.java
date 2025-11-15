package com.CodingRK;

import static com.CodingRK.ArrayPrint.arrayPrint;
import java.util.*;

public class revision {

    public static void printN(int n, int iterator) {
        if (n < iterator) return;

        System.out.println(iterator);

        printN(n,iterator+1);
    }

    public static int nthFibonacci(int iterator){
        if(iterator==0) return 0;
        if(iterator==1) return 1;

       int last = nthFibonacci(iterator-1);
       int seconLast = nthFibonacci(iterator-2);

       return last + seconLast;

    }

    public static void reverseArray(int[] arr, int iterator){
        if (iterator == ((arr.length/2)) ){
            arrayPrint(arr);
            return;
        }

        int temp = arr[iterator];
        arr[iterator] = arr[(arr.length-1)-iterator];
        arr[(arr.length-1)-iterator] = temp;

        reverseArray(arr, iterator+1);
    }

    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;

        return;
    }

    public static void main(String[] args) {
        int[] temp = new int[]{1,2,3,4,5};
//        reverseArray(temp,0);


//        System.out.println(nthFibonacci(5));
    }

}
