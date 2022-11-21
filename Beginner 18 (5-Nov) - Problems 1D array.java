import java.util.*;

class Main {
    public static void main(String args[]) {
        
        /*
        //Q1: Given an array of size n, return true if k is present else return false.
        int []arr = {16, 17, 20, 15, 7};
        int k = 15;
        System.out.println(search(arr,k));//note how the array is passed to the function

        
        //Q2. Given an array of size n and a value k. Write a function that returns frequency of k in arr.
        //how many times does an element present in an array?
        int []arr = {16, 17, 20, 15, 7, 15, 10, 15};
        int k = 15;
        System.out.println(element_frequency(arr,k));

        
        //Q3. Given an array of size n. write a function that returns true if CONSECUTIVE DUPLICATES are present in array, otherwise returns false.
        //ex: true for []arr = {4, 9, 9, 6} and false for []arr = {4, 9, 5, 6}    
        int []arr = {16, 17, 20, 15, 7, 15, 7, 7};
        System.out.println(check_consecutive_duplicate(arr));    
        */
        
        //Q4. Given an array, write a function that returns min and max of the array
        int []arr = {20, 5, 16, 35, 19};
        int []A = min_max(arr);//
        System.out.println("Min:" + A[0]);
        System.out.println("Max:" + A[1]);
	}
    
    //Q4: 
    static int[] min_max (int []arr){
        int max = arr[0];
        int min = arr[0];
        int len = arr.length;
        
        for(int i = 0; i < len;i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        
        int []ans = {min, max};//this is how to return more than 1 value to calling function
        return ans;
    }
    
    //Q3:
    static boolean check_consecutive_duplicate(int []arr){
        int len = arr.length;
        //"i < len - 1": to process only upto last element in the array using arr[i+1] while taking the next element.
        //otherwise IndexOutOfBound exception will occur.
        for(int i = 0; i < len-1; i++){
            if (arr[i] == arr[i+1]){
                return true;
            }
        }
        return false;
    }
    
    //Q2: 
    static int element_frequency(int []arr, int k){
        int len = arr.length;
        int frequency = 0;
        for (int i = 0; i < len; i++){
            if (arr[i] == k){
                frequency++;
            }
        }
        return frequency;
    }
    
    //Q1
    static boolean search(int []arr, int k){
        int n = arr.length;//
        
        /*
        the following code will fail because of following reasons: 
        1. premature decision: based on very first element itself you're deciding to return 'false' or 'true' (else part)
        2. it'll give compilation error: according to compiler, the program doesn't even need to get into the loop once. 
        because of the return type given for the function, compiler expects a return statement which will be met in every logical flow (there's no need for a loop to execute even once - so we MUST use return statement outside loop).
        it is accepted to use return statement inside if and else.
        
        //LINEAR SEARCH: search through the elements of the array using loop
        for(int i = 0; i < n; i++){
            if(arr[i] == k){
                return true;
            }    
            else{
                return false;
            }  
        }
        */
        
        //LINEAR SEARCH or SIMPLE SEARCH
        for(int i = 0; i <n; i ++){
            if (arr[i] == k){
                return true;//returns true the first time 'k' is found in the array
            }
        }
        return false;//returns false even after searching through the entire array
    }
    
}