import java.lang.*;
import java.util.*;

public class Main {
    
    static boolean check(int[]arr) {
        int n = arr.length;
        for(int i=0; i < n; i++) {
            if(arr[i] <= arr[i-1]) {
                return false;
            }
        }
        return true;
    }
    /*
    //Q3. Given an array and a value k. Write a function that returns true if there is a pair for which A[i] + A[j] == k (i != j), otherwise return false
    //while looping thru the element at outer and inner loop indices i = j is the same element
    //alternatively known as: TARGET SUM PAIR problem
    static boolean target_sum_pair(int []A, int target_sum){
        int len = A.length;
        //outer loop for the element that's the first operand of the sum operation
        for(int i = 0; i < len; i++){
            //inner loop to pair the currently chosen element (first operand) with the other elements (second operand)
            for()            
        }
        
        
    }    
    */
    
    /*
    //Q. Given an array in which there can be multiple unique elements (that which appears only once in the entire array), find and return them in the form of an output array
    static int[] find_all_uniques(int []inp_arr){
        int len = inp_arr.length;//length of input array
        int count_of_unique = 0; //variable to keep the count of unique elements (this will be the length of the output array)
        //outer loop to find the frequency of each element
        for(int i = 0; i < len; i++){
            
        }
    }
    */
    
    //Q2. Given an array in which all values are coming twice except for one value that is coming once. Return this unique number.
    //find the value that is coming only once
    static int find_unique(int []arr){
        //check the frequency of each element in the array and return that which has frequency = 1
        int len = arr.length;//length of array
        int result = -1;//variable that stores the unique element if there is one, else return -1:
        //outer loop to find the frequency of each element
        for(int i = 0; i < len; i++){
            int element = arr[i];//this is the value that is being checked now
            int frequency = 0;//this must be reset for every element in the array
            //inner loop to traverse through the array and check the frequency
            for(int j = 0; j < len; j++){
                if(element == arr[j]){
                    frequency ++;//increment the frequency
                }
            }
            //check if the element appeared only once
            if (frequency == 1){
                result = element;
                return result;
            }
        }
        return result;//for the sake of avoiding compilation error 'missing return statement', even though the logic would force the code to return the value already
    }
        
    //Q1. Given an array, write a function that returns 'true' if array is sorted, otherwise return 'false'. 
    //"sorted" = strictly increasing manner (not necessarily sequential) - two elements can't have same value
    static boolean sort_check(int []arr){
        int len = arr.length;//length of array
        boolean result = true;//declare and intialize the output
        for(int i = 0; i < len-1; i++){
            if(arr[i] < arr[i+1]){
                //do nothing
                continue;
            }
            else{
                result = false;//even if one element is not greater than its previous element, the array is not in increasing order
                return result;//return 'false' and exit the function
            }
        }
        return result;//returns true if all the elements are sorted (the condition is true until the last element)
    }
    

    static int solve(int[] A) {
        int len = A.length;//length of the input array
        //outer loop to traverse through the elements of the array
        for(int i = 0; i < len-1; i++){
            if(A[i] <= A[i+1]){
                //continue;//array is in non-decreasing --> at least same element is repeated
            }
            else{
                return 0;//return 0 and exit the function even if one element is less than the previous element 
            }
        }
        return 1;//return 1 only after processing all the elements of the array
    }
    
    

    
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        
        /*
        //Q1. check sorted array
        //int []arr = {2, 3, 5, 5, 6, 9, 10};//input array
        int []arr = {1, 2, 3, 4, 5, 6, 7, 8};//input array
        System.out.println("Result: " + sort_check(arr));
        */
        
        /*
        //Q2. find the unique element in an array
        int []arr = {18, 9, 4, 9, 4, 10, 10, 16, 16, 18}; //answer: 16
        //int []arr = {9, 18, 16, 18, 14, 14, 16, 9}; //answer: 14
        System.out.println("Unique number: " + find_unique(arr));
        */
        
        /*
        //Q. find all unique elements
        int []arr = {18, 9, 4, 9, 4, 10, 10, 16, 16, 18}; //answer: 16
        //int []arr = {9, 18, 16, 18, 14, 14, 16, 9}; //answer: 14
        //System.out.println("Unique number: " + find_all_uniques(arr));
        */
        
        //int []arr = {1, 2, 4, 3, 5, 6, 7, 8};//input array
        int []arr = {1, 2, 1};//input array
        System.out.println("Result: " + solve(arr));
        
    }
}