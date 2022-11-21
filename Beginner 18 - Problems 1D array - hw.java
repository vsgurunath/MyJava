import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scn = new Scanner(System.in);

        int T = scn.nextInt();//User input: number of test cases (rows)

        //outer loop to process T test cases: you don't have to worry about number of lines of input to be counted. 
        //as the sets of input test cases are taken-in using nextInt() commands, the appropriate number of lines will automatically traverse and process all user input test cases
        for (int i = 1; i <= T; i++){
            int array_len = scn.nextInt();//number of elements in the input array
            //System.out.println("length:" + array_len);
            int []arr = new int[array_len]; //declare new array to store the input array pertaining to the current test case
            int result = 0;//print 0 if the element is not found in the array after processing all elements; 1 if found
            //loop to process array elements
            for(int j = 0; j < array_len; j++){
                //int element = scn.nextInt();//get the input number
                arr[j] = scn.nextInt();//get the input number;
                //System.out.println(arr[j]);
            }
            
            //for(int z = 0; z < array_len; z++){
            //System.out.println(arr[z]);
            //}

            int B = scn.nextInt();//B --> the number that needs to be searched in the input array

            //search through the array and print the result
            for (int k = 0; k < array_len; k++){
                if (arr[k] == B){
                    result = 1;
                    break;//so that it doesn't need to check other elements
                }
            }
            System.out.println(result);
        }
    }
}