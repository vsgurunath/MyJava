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
        //create an array that can store 5 integer values
        int [] arr1 = new int [5];//array declaration - 1st style - PREFERRED
        int arr2 [] = new int [5];//array declaration - 2nd style
        int [] arr = {1,2,3,4,5,6,7}; //array declaration - 3rd style
        
        
        //Q: take 5 values from user, store them in array
        int [] arr = new int [5]; //--> array declaration: automatically initialised with 0 in all elements
        //arr[0] = scn.nextInt(); //index 0 - element 1
        //arr[1] = scn.nextInt(); //index 1 - element 2
        //arr[2] = scn.nextInt(); //index 2 - element 3
        //arr[3] = scn.nextInt(); //index 3 - element 4
        //arr[4] = scn.nextInt(); //index 4 - element 5
        for(int i = 0; i < 5; i++){
            arr[i] = scn.nextInt();//store the inputs in array elements using index
            //System.out.println(arr[i]);//print the array elements
        }
        
        for(int j = 0; j < 5; j++){
            System.out.println("arr[" + j + "] = " + arr[j]);//print the array elements
        }
        
        //Q. take n values from user denoting marks of n students. store these n values in array and find the average marks of the class.
        int n = scn.nextInt(); //number of students
        //declare array of size n 
        int [] arr = new int [n];
        //loop to capture scores of n students in array
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();//store the given mark in array index
        }
        int total_marks = 0;//total 
        //sum the marks of all students
        for(int j = 0; j < n; j++){
            total_marks += arr[j];
        }
        //double avg = Math.round(total_marks) * 100 / (n * 100d);//rounded off to two decimals
        double avg = total_marks / (double) n;
        avg = Math.round(avg * 100)/100d;
        System.out.println("Average of " + n + " students is: " + avg);

        //Q. Given the marks of n students, find the maximum marks by a student.
        int n = scn.nextInt(); //number of students
        //declare array of size n 
        int [] arr = new int [n];
        //loop to capture scores of n students in array
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();//store the given mark in array index
        }
        int max_marks = 0;//total 
        //sum the marks of all students
        for(int j = 0; j < n; j++){
            if(arr[j] > max_marks){
                max_marks = arr[j];
            }
        }
        System.out.println("Maximum mars = " + max_marks);
        
 
        int [] arr = {1,2,3,4,5,6,7,8,9};
        //arr.length gives size of array
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }       
        */
        
        int [] arr = new int[10]; //declares arr with 10 elements
        int n = arr.length;
        System.out.println(n);

        int [] arr2 = {1,2,3}; //declares arr with 3 elements
        int n2 = arr2.length;
        System.out.println(n2);

        
    }
    
        
}