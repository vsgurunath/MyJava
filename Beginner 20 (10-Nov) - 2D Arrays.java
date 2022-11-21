import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scn = new Scanner(System.in);

        /*
        //Q1.Take N and M from user. And then N x M values. Create a matrix of size NxM and fill values in this matrix (given by user)
        //print the elements row by row

        int N = scn.nextInt(); //user input: number of rows (1D arrays)
        int M = scn.nextInt(); //user input: number of columns (elements of each 1D array)
        
        int [][] mat = new int [N][M];//create a 2D array (matrix) with 2x3 dimension
        
        //outer loop for each row
        for(int i = 0; i < N; i ++){
            //inner loop for each column: element of 1D array
            for(int j = 0; j < M; j ++){
                mat[i][j] = scn.nextInt();//accept the element
            }
        }
        
        System.out.println("Matrix dimensions: ");
        System.out.println("Rows: " + N);
        System.out.println("Colss: " + M);
        System.out.println("mat.length: " + mat.length);
        
        
        //print the matrix row by row
        for(int i = 0; i < mat.length; i ++){
            System.out.println("mat[i].length: " + mat[i].length);
            for(int j = 0; j < mat[i].length; j ++){
                System.out.print(mat[i][j] + " ");//print the element 
            }
            System.out.println();//move to next line
        }
        */
        
        /*
        //Q2. Print matrix column by column
        int N = scn.nextInt(); //user input: number of rows (1D arrays)
        int M = scn.nextInt(); //user input: number of columns (elements of each 1D array)
        
        int [][] mat = new int [N][M];//create a 2D array (matrix) with 2x3 dimension
        
        //outer loop for each row
        for(int i = 0; i < N; i ++){
            //inner loop for each column: element of 1D array
            for(int j = 0; j < M; j ++){
                mat[i][j] = scn.nextInt();//accept the element
            }
        }
        
        int columns = mat[0].length;//length of the 1D array will be same for all rows
        //print the matrix column by column
        
        //outer loop for column variable j
        for(int j = 0; j < columns; j ++){
            //inner loop for row variable i
            for(int i = 0; i < mat.length; i ++){
                System.out.print(mat[i][j] + " ");//print the element 
            }
            System.out.println();//move to next line
        }
        */
        
        //Q3. Wave print (column-wise) or Snake print
        int N = scn.nextInt(); //user input: number of rows (1D arrays)
        int M = scn.nextInt(); //user input: number of columns (elements of each 1D array)
        
        int [][] mat = new int [N][M];//create a 2D array (matrix) with 2x3 dimension
        
        //outer loop for each row
        for(int i = 0; i < N; i ++){
            //inner loop for each column: element of 1D array
            for(int j = 0; j < M; j ++){
                mat[i][j] = scn.nextInt();//accept the element
            }
        }
        
        int columns = mat[0].length;//length of the 1D array will be same for all rows
        
        //wave-print (column-wise) or snake print
        
        //outer loop for column variable j
        for(int j = 0; j < columns; j ++){
            
            //check whether column is even or odd and print accordingly
            if(j % 2 ==0){
                //even column: 0, 2, 4, ...
                //print from top to bottom (row in increasing manner)
                for(int i = 0; i < mat.length; i ++){
                    System.out.print(mat[i][j] + " ");//print the element 
                }
            }
            else{
                //odd columns: 1, 3, 5,...
                //print from bottom to top (row in decrasing manner)
                for(int i = mat.length-1; i >= 0 ; i --){
                    System.out.print(mat[i][j] + " ");//print the element 
                }
            }
        }        
    }
}