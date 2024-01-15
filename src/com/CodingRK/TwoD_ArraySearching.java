package com.CodingRK;

import java.util.*;

public class TwoD_ArraySearching {
    public static void main(String[] args) {

        //taking rows and columns as input from user
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        //Creating a 2d array
        int[][] matrix = new int[r][c];

        //Taking input from User
        for (int a = 0; a < r; a++) {
            for (int b = 0; b < c; b++) {
                matrix[a][b] = sc.nextInt();
            }
        }

        //Printing Matrix
        for (int a = 0; a < r; a++) {
            for (int b = 0; b < c; b++) {
                System.out.print(matrix[a][b] + " ");
            }
            System.out.println();
        }
        System.out.println(" Enter any number from above matrix to know its location in matrix :");
        int input = sc.nextInt();

        //Traversing through matrix and printing the location of
        for (int a = 0; a < r; a++) {
            for (int b = 0; b < c; b++) {
                if (matrix[a][b] == input) {
                    System.out.println("Location of the number is : " + a + "," + b);
                } else if (input > 12) {
                    System.out.println("The number entered does not belong to the above matrix.");
                }
            }
        }
    }
}
