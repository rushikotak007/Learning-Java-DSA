package com.CodingRK;

public class FindHCF {
    public static int findHCF(int n1, int n2) {
        int result = 1;
        while (n1!=0 && n2!=0 && n1*n2>0){
            if(n1>n2){
                n1-=n2;
            }else{
                n2-=n1;
            }
        }

        if (n1==0){
            result=n2;
        } else if (n2==0) {
            result=n1;
       }

        return result;
    }
    public static void main(String[] args) {
        System.out.println(findHCF(9,17));
    }
}
