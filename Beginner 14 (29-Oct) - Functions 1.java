import java.lang.*;
import java.util.*;

public class Main {
    
    //approach 2: returning a value to main function
    static int factorial_return (int n){
        int fact_n = 1;//declare the factorial value as int 
        for(int i = 1; i <= n; i++){
            fact_n = fact_n * i;//formula for factorial in the loop
        }
        System.out.println("(return function) Factorial of " + n + " is: " + fact_n);//print the factorial
        return fact_n;
    }    
    
    
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scn = new Scanner(System.in);

        int N = scn.nextInt(); //user input
        
        //approach 1: call a function that doesn't return a value
        factorial_void(N);//call the function that prints the value from within the function itself
                
        //approach 2: call a function that returns a value
        int fact_N = factorial_return(N);//call the function and save the returned value
        System.out.println("(returned from function) Main print: " + fact_N);
        
        
        
        
        
        //pre-defined functions
        //Math functions
        
        //1. Math.pow(a,b) --> a power b --> returns double value
        double power = Math.pow(4,4);
        System.out.println("Power: " + power);
        int power_int = (int)Math.pow(4,4);
        System.out.println("Power (int): " + power_int);
        

    }
}