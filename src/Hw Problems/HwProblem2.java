import java.util.*;

public class HwProblem2 {
    public static void main(String args[]) {
/*
//        System.out.println("Enter a natural number and get the sum till that number :");
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//
//        int sum = 0;
//        for( int i=0;  i<= a; i++){
//            sum = i + sum;
//        }
//        System.out.println(sum);
*/

        /* ***Now we will pweform the code  to write down a table takinginpur from user***  */

        System.out.println("Enter a natural number and get the table of that number :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.print(a);
            System.out.print(" * ");
            System.out.print(i);
            System.out.print(" = ");
            System.out.println(a * i);
        }
    }
}