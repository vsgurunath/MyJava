import java.util.*;
import java.lang.*;


public class Main {
    //Q3. Given A and B, return the matrix multiplication A*B
    //Dimensions of matrix A: r1xc1
    //Dimensions of matrix B: r2xc2    
    //Rules for matrix multiplication: A*B is possible when
    //1. Columns of A (c1) == Rows of B (r2)
    //2. The dimension of result matrix is r1 x c2 => will have same row count of 1st matrix and column count of 2nd matrix
    //rows in result = rows in A (r1)
    //cols in result = cols in B (c2)
    static int[][] matrix_multiplication(int[][]A, int[][]B){
        int r1 = A.length;//rows of matrix A
        int c1 = A[0].length;//columns of matrix A
        int r2 = B.length;//rows of matrix B
        int c2 = B[0].length;//columns of matrix B
        
        int[][] C = new int [r1][c2];//product Matrix
        
        //outer loop to process A's rows
        for(int i = 0; i < r1; i++){
            //1st inner loop to process B's cols
            for(int j = 0; j < c2; j++){
                //2nd inner loop to multiply the elements from A and B
                //C[i][j] --> (ith row of A) x (jth col of B)
                int temp_element = 0;//sum of product of elements
                for(int k = 0; k < c1; k++){
                    temp_element += A[i][k] * B[k][j];//multiply the specific element of A and B
                }
                C[i][j] = temp_element;//populate the output matrix with the product
            }
        }
        return C;    
    }
    
    //Q2. Given a matrix A, check whether it is an Identity Matrix or not
    //Identity matrix: two properties
    //1. it should be a square matrix (N = M)
    //2. On the main diagonal, all elements should be 1 and the rest of the elements must be 0
    static boolean Is_identity(int[][] A){
        int N = A.length;//number of rows
        int M = A[0].length;//number of columns
        
        if(N != M){
            return false;//matrix is not even a square matrix, so can't be Identity
        }
        //don't write else to return true here. 
        //when the 'if' doesn't execute, it simply means that the given matrix is square, not necessarily an Identity matrix. 
        //so, proceed to check the elements.
        
        //validate the matrix for Identity condition
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                if((i == j) && A[i][j] != 1){
                    return false;//diagonal element is not 1
                }
                else if((i != j) && A[i][j] != 0){
                    return false;//non-diagonal element is not 0
                }
            }
        }
        return true;//return true only if all the validations above succeeded (didn't fail)
    }
    
    //Q.homeworkd mcq
    static boolean isIdentity(int[][]mat) {
        int r = mat.length;
        int c = mat[0].length;
        if(r != c) {
            return false;
        }
        int i = 0;
        int j = 0;
        while(i < r && j < c) {
            if(mat[i][j] != 1) {
                return false;
            }
            i++;
            j++;
        }
        return true;
    }
    
    //Q1. Given A, find transpose of A.
    //input matrix's order: NxM => element position (i,j)
    //transposed matrix's oder: MxN: => element position (j,i) => diagonal elements will be maintain their positions
    static int[][] transpose(int [][]A){
        int N = A.length;//rows of input matrix
        int M = A[0].length;//columns of input matrix
        int [][]A_transpose = new int[M][N];//declare and initialize output matrix
        
        //loop through the rows of input matrix (stack of arrays)
        for(int i = 0; i < N; i++){
            //loop through the columns of the input matrix (elements of the 1D array)
            for(int j = 0; j < M; j++){
                A_transpose[j][i] = A[i][j];//find the position of the element in the transpose
            }
        }
        return A_transpose;//return the transpose
    }
    
    //function for printing matrix
    static void print_matrix(int[][] mat){
        int rows = mat.length;//rows
        int cols = mat[0].length;//columns
        
        //print the given matrix
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(mat[i][j] + " "); //print the element from given matrix
            }
            System.out.println();//next line
        }
    }
    
    
    
    
    public static void main(String[] args) {        
        Scanner scn = new Scanner(System.in);
        /*
        //Q1. Transpose of matrix
        
        // int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};//3x3 matrix
        // int N = arr.length;//rows
        // int M = arr[0].length;//cols
        
        int N = scn.nextInt();//user input: number of rows
        int M = scn.nextInt();//user input: number of columns
        int [][] arr = new int [N][M];//original matrix
        int [][] arr_trans = new int [M][N];//transpose of original matrix
        
        //get the matrix
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                arr[i][j] = scn.nextInt();//get user input and place it in the original matrix
            }
        }
        //print the input original matrix
        print_matrix(arr);//pring the input matrix
        
        System.out.println("------------------------");//separator line
        
        arr_trans = transpose(arr);//call the function 
        //print the transpose by calling the print_matrix function
        print_matrix(arr_trans);
        */
        
        /*
        //Q2. Check for identity condition
        int N = scn.nextInt();//user input: number of rows
        int M = scn.nextInt();//user input: number of columns
        int [][] arr = new int [N][M];//original matrix
        int [][] arr_trans = new int [M][N];//transpose of original matrix
        
        //get the matrix
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                arr[i][j] = scn.nextInt();//get user input and place it in the original matrix
            }
        }
        //print the input original matrix
        print_matrix(arr);//pring the input matrix
        
        System.out.println("------------------------");//separator line
        
        if(Is_identity(arr)){
            System.out.println("class:Given matrix is Identity Matrix");
        }
        else{
            System.out.println("class:Given matrix is NOT an Identity Matrix");
        }
        
        
        if(isIdentity(arr)){
            System.out.println("hw: Given matrix is Identity Matrix");
        }
        else{
            System.out.println("hw: Given matrix is NOT an Identity Matrix");
        }
        */
        
        //Q3. Matrix multiplication
        //Get the dimensions of matrix A from user
        int r1 = scn.nextInt();//user input: number of rows in matrix A
        int c1 = scn.nextInt();//user input: number of cols in matrix A
        int [][]A = new int[r1][c1];//declare and initialize matrix A with r1 x c1 dimension
        //Get the matrix A from user
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c1; j++){
                A[i][j] = scn.nextInt();//user input: element of matrix A
            }
        }
        //print matrix A
        print_matrix(A);
        System.out.println("---------");
                
        //Get the dimensions of matrix B from user
        int r2 = scn.nextInt();//user input: number of rows in matrix B
        int c2 = scn.nextInt();//user input: number of cols in matrix B
        int [][]B = new int[r2][c2];//declare and initialize matrix B with r2 x c2 dimension
        //Get the matrix B from user
        for(int i = 0; i < r2; i++){
            for(int j = 0; j < c2; j++){
                B[i][j] = scn.nextInt();//user input: element of matrix B
            }
        }
        //print matrix B
        print_matrix(B);
        System.out.println("-------------------");
        
        //check if the matrices qualify to be multiplied
        if(c1 == r2){
            //matrices qualify and the multiplication can take place
            int [][]C = matrix_multiplication(A, B);//pass on the matrices to the matrix_multiplication function
            
            //print the matrix product
            print_matrix(C);
        }
        else{
            System.out.println("Multiplication not possible.");
        }
        
        
        
    }
}