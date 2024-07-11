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

    public static double getShortestPath(String inputStr){
        int x = 0;
        int y=0;
        for (int i=0; i<inputStr.length(); i++){
            if (inputStr.charAt(i)=='W'){
                y += -1;
            }
            if (inputStr.charAt(i)=='E'){
                y += 1;
            }
            if (inputStr.charAt(i)=='S'){
                x += -1;
            }
            if (inputStr.charAt(i)=='N'){
                x += 1;
            }
        }
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public static String getLargestString(String[] inputStrs){
        String largest = inputStrs[0];
        for (int i=0; i<inputStrs.length; i++ ){
            if(largest.compareTo(inputStrs[i])<0){
                largest = inputStrs[i];
            }
        }
        return largest;
    }

    public static String toTitleCase(String inputStr){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(inputStr.charAt(0));
        sb.append(ch);

        for (int i = 1; i < inputStr.length(); i++){
            if (inputStr.charAt(i - 1) == ' ' && i < inputStr.length() - 1){
                sb.append(Character.toUpperCase(inputStr.charAt(i)));
            }
            else{
                sb.append(inputStr.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void stringCompression(String inpString) {
        StringBuilder sb = new StringBuilder("");
        int count = 1;
        int a=inpString.length();
        sb.append(inpString.charAt(0));
        for (int i=0; i<inpString.length()-1; i++){
           if (inpString.charAt(i) == inpString.charAt(i+1)) {
               count++;
           }
           else{
               sb.append(count);
               sb.append(inpString.charAt(i+1));
               if (i!=a-1){count=1;}
           }
        }
        sb.append(count);



        System.out.println(sb);
    }

    public static void main(String[] args) {
        String testCase = "abccba";
        String direction = "NNNEEEE";
        String[] testCaseForLargestSting = {"abc", "abd", "abe"};
        String testTitleCase = " hii, my name is Rushi";
        String testCompression = "aaaabbbcc";
//        System.out.println(toTitleCase(testTitleCase));
        stringCompression(testCompression);
    }
}
