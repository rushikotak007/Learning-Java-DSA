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

    public static boolean isSorted(int[] arr, int i){
        if (i==arr.length-1){
            return true;
        }
        if(arr[i+1]<arr[i]){
            return false;
        }

        return isSorted(arr, i+1);
    }

    public static int firstOccurance(int arr[], int target, int counter){
        if(arr[counter]==target){
            return counter;
        }
        return firstOccurance(arr, target, counter+1);
    }

    public static int lastOccurance(int[] arr, int target, int counter){
            if (counter < 0) {
        return -1;
    }
        if(arr[counter]==target){
            return counter;
        }
        return lastOccurance(arr, target, counter-1);

    }

//    public static int lastOccurance(int arr[], int target, int counter){
//
//
//
//        int isFound = lastOccurance(arr, target, counter+1);
//    }

    public static int xToPowerN(int x, int n){
        if(n==0){
            return 1;
        }

        return x * xToPowerN(x,n-1);
    }

    public static int xToPowerNOptimized(int x, int n){
       if(n==1){
           return x;
       }
        int result =1;
        if(n%2==0){
            return  result=xToPowerNOptimized(x,n/2) * xToPowerNOptimized(x,n/2);
        }

        if(n%2==1){
            return result=x * xToPowerNOptimized(x,(n)/2) * xToPowerNOptimized(x,(n)/2);
        }

        return result;
    }

    public static int tilingProblem(int n){

        //Base Cases
        if( n==1){
            return 1;
        }
        if(n==0){
            return 1;
        }

        //Work
        int horizontalTiles = tilingProblem(n-1);

        int verticalTiles = tilingProblem(n-2);

        int total = horizontalTiles + verticalTiles;

        return total;
    }

//    public static void removeDuplicates(String str, int ptr, StringBuilder sb, boolean[] map){
//
//        //Base Cases
//
//
//    }

    static int paitingFriend(int n){

        //base case
        if(n == 1 || n==2){
            return n;
        }

        return paitingFriend(n-1) + ((n-1) * paitingFriend(n-2));
    }

    public static void printBinStrings(int n, int lastDigit, StringBuilder str){
        //In this function we are supposed to print all the possible binary strings of length n without consecutive 1's

        //Base Case
        if(n==0){
            System.out.println(" ");
            return;
        }
    }

    public static void printOccurance(int[] arr, int key, int ptr){
        if(arr[ptr]==key){
            System.out.println(ptr);
        }
        if(ptr==arr.length-1){
            return;
        }

        printOccurance(arr,key,ptr+1);
    }

    public static void convertToWords(int n){

        //Base Case
        if(n==0){
            return;
        }

        convertToWords(n/10);


        //Work
        int lastDigit = n%10;


        if (lastDigit==1){
            System.out.print("One ");
        }
        if (lastDigit==2){
            System.out.print("Two ");
        }
        if (lastDigit==3){
            System.out.print("Three ");
        }
        if (lastDigit==4){
            System.out.print("Four ");
        }
        if (lastDigit==5){
            System.out.print("Five ");
        }
        if (lastDigit==0){
            System.out.print("Zero ");
        }
        if (lastDigit==6){
            System.out.print("Six ");
        }
        if (lastDigit==7){
            System.out.print("Seven ");
        }
        if (lastDigit==8){
            System.out.print("Eight ");
        }
        if (lastDigit==9){
            System.out.print("Nine ");
        }

    }

    public static void main(String[] args) {
        int[] testArr = new int[]{1,2,5,3,4,5,6,7,8,5,8};
        int key = 5;
//        System.out.println();
        convertToWords(1967);
    }
}
