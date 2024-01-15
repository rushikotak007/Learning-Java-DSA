package com.CodingRK;

public class stringbuilder {
    public static void main(String args[]) {

        StringBuilder sb = new StringBuilder("mother");
        System.out.println("Old string : " + sb);

        //functions of StringBuilder

        //setChar to replace any char of String
        sb.setCharAt(0, 'F');
        System.out.println(sb);

        //inert to add any charachter to the string which was str = str +'char' in case of string
        sb.insert(0, 'f');
        System.out.println(sb);

        //delete function to delete any charachter from String builder
        sb.delete(4, 5);
        System.out.println(sb);

        //Reversing this string using StringBuilder functions
        for (int i = 0; i < sb.length() / 2; i++) {
            int front = i;
            int back = sb.length() - i - 1;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }

        System.out.println(sb);


    }
}
