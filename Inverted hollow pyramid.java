/*inverted half hollow pyramid: sample output for N=6

******
*   *
*  *
* *
**
*
*/


import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scn = new Scanner(System.in);

        int N = scn.nextInt(); //user input for pattern

        //outer loop for rows
        for (int row = 1; row <= N; row++){
            //first row
            if (row == 1){
                for (int col = 1; col <= N; col++){
                    System.out.print("*");
                }
            }
            else if (row == N){ //last row
                System.out.print("*");
            }
            else {//in-between rows
                //first star
                System.out.print("*");//1
                //to print spaces
                for(int col = 1; col <= N - row - 1; col ++){//3
                    System.out.print(" ");
                }
                //to print last star
                System.out.print("*");//1
            }

            System.out.println();//move to next line
        }
    }
}