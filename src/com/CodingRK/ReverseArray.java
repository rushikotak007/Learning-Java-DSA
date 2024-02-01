package com.CodingRK;
import java.util.*;

public class ReverseArray {
    public static void reverseArray(int[] numbers){
        int start = 0;
        int end = numbers.length-1;

        System.out.println("Old Array is : "+Arrays.toString(numbers));

        while(start < numbers.length/2 ){
            int temp = numbers[end];
            numbers[end] = numbers[start];
            numbers[start]=temp;
            start++;
            end--;
        }
        System.out.println("New string is : " + Arrays.toString(numbers));
//        for (int i=0; i<numbers.length; i++){
//            System.out.print();
//        }
    }

    public static void main(String[] args) {
        int[] numbers = {2,4,6,8,10};
        reverseArray(numbers);
    }
}
