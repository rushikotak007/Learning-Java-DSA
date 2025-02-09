package com.CodingRK;

public class BacktrackingBasics {

    public static void findSubsets(String str, String result, int i){

        // Base Cases
        if(i == str.length()){
            System.out.println(result);
            return;
        }

        char curr = str.charAt(i);
        //Recursion step : Choice to take the character into answer string
        findSubsets( str, result + curr, i+1);
        //Backtrackked to the original function again and then recursion for no choice
        findSubsets(str, result, i+1);
    }

    public static void findPermutations(String str, String result){

        //Base Case
        if(str.length() == 0 ){
            System.out.println(result);
        }

        //Recursion
        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);

            //New string for providing input to the next recursion
            String newStr = str.substring(0,i) + str.substring(i+1,str.length());

            //Recursion Step
            findPermutations(newStr,result+curr);
            //Backtracking will occur when the new iteration of for loop happerns
        }
    }

    public static void nQueen(char[][] chessBoard, int n){

    }

    public static void  printBoard(char[][] chessBoard){
        for(int i=0; i<chessBoard.length; i++){
            for (int j = 0; j < chessBoard.length; j++) {
                System.out.print(chessBoard[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String testStr = "abc";
        findPermutations(testStr,"");
    }
}
