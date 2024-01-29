package com.CodingRK;

//Pyramid of numbers

public class Pattern6 {
    public static void main(String[] args) {

//        int i = 9;// Which we can take from user
//
//        for (int a = 1; a <= i; a++) {
//
//            //Initial spaces
//            for (int b = 1; b <= (i - a); b++) {
//                System.out.print(" ");
//            }
//
//            //printing (i)th number (i) times
//            for (int number = 1; number <= a; number++) {
//                System.out.print(a + " ");
//            }
//            System.out.println("");
//        }
        for(int i=0; i<5; i++){
            for(int j=0; j<i+1; j++){
                if((i+j)%2==0){
                    System.out.print(1);
                }
                else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
}
