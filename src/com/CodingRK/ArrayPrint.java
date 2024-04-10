package com.CodingRK;

import javax.swing.*;
import java.util.*;

public class ArrayPrint {
    public static void arrayPrint(int[] inputArr) {
        System.out.print("[ ");
        for(int i=0; i<inputArr.length; i++){
            System.out.print(inputArr[i] + ",");
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        int[] testArr = {1, 3, 5, 6, 7};
        arrayPrint(testArr);
    }
}
