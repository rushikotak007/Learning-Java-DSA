package com.CodingRK;

public class HollowRhombusPattern {
    public static void RhombusCreator(int length){
        for (int i=0; i<length; i++){
            for (int j=0; j<length-i; j++){
                System.out.print(" ");
            }
            for (int j=0; j<length; j++){
                if (i==0 || i==(length-1) || j==0 || j==(length-1)){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        RhombusCreator(5);
    }
}
