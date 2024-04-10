package com.CodingRK;
import java.util.*;

public class StringBasics {
    public static boolean checkStringPallindrime(String inputStr){
        for (int i=0; i<(inputStr.length()+1)/2; i++){
            if (inputStr.charAt(i) != inputStr.charAt(inputStr.length()-i-1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String testCase = "abccba";
        System.out.println(checkStringPallindrime(testCase));
    }
}
