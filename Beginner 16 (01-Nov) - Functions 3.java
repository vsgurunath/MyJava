import java.lang.*;
import java.util.*;

public class Main {
    //global int G = 0;
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scn = new Scanner(System.in);
    
        /*
        //Question 1: nCr 
        int n = scn.nextInt(); //user input n
        int r = scn.nextInt(); //user input r
        
        //ncr formula: ncr = n! / ((n-r)! * r!)
        int ncr = factorial(n) / (factorial(n-r) * factorial(r)) ;
        System.out.println("nCr = " + ncr);

        
        //Question 2: check whether an input number is prime number: returns  
        int N = scn.nextInt();
        if (check_prime(N)) {
            System.out.println(N + " is a prime");
        }
        else{
            System.out.println(N + " is not a prime");
        }
        
        //Question 3: print all prime numbers in the range of a given number
        int N = scn.nextInt();//accept range from user
        print_primes(N);

        //Question 4: numeric pyramic pattern
        int N = scn.nextInt();
        print_numeric_pyramid(N);

        System.out.println("in main");
        int M = scn.nextInt();
        print_user(M);
        System.out.println("returned to main");
        *
        
        
        /*
        user input: a choice (operations) followed by input number
        operations:
        1 --> factorial
        2 --> check even or odd
        3 --> check prime
        4 --> prints all primes in the range
        5 --> print evens in the range
        6 --> print sum of all evens
        
        input value:
        input to the operation
        */        
        
        System.out.println(Math.ceil(3.0));
        System.out.println(Math.floor(3.0));
        
        int X = -10;
        if (X < 0){
            X = - X;
        }
        System.out.println(X);
        
        System.out.println(Math.abs(12));
    }
    
    
    static void print_user(int F1){
        System.out.println("(function1: Hello World!");
        F1 = F1 * 2;
        //System.out.println(G);
        //method 1
        //int F_2 = print_user2(F1);
        
        //method 2
        //print_user2(F1);
                
        //method 3
        System.out.println("printed " + print_user2(F1));
        
        System.out.println("back to function1");
        //return;
    }
    
    static int print_user2(int F2){
        int x = F2*1000;
        System.out.println("function2: Sivaguru");
        return x;
    }
    
    
    
    
    static int factorial(int x){
        int fact = 1; //output value declaration & initialisation
        
        for(int i = 1; i <= x; i++){
            fact *= i; //keep multiplying to find the factorial
        }
        
        return fact;
    }
    
    static boolean check_prime(int n){
        int count_of_factors = 0;
        boolean prime = false;
        
        for(int i = 1; i <= n; i++){
            if (n % i == 0){
                count_of_factors ++; //i is a factor of n
            }
            if (count_of_factors > 2){
                break;
            }
        }
        
        if (count_of_factors == 2){
            prime = true;
        }
        return prime;
    }
    
    static void print_primes(int n){
        
        //process all numbers in range
        for(int i = 1; i <= n; i++){
            int count_of_factors = 0;
            //check whether i is prime
            for(int j = 1; j <= i; j++){
                //check factor
                for(int k = 1; k <= i; k++){
                    if(i % k == 0){
                        count_of_factors ++;
                    }
                    if (count_of_factors > 2){
                        break;
                    }
                } 
                if (count_of_factors == 2){
                    System.out.println(i);
                }           
            }               
        }
    }
    
    
    static void print_numeric_pyramid(int n){        
        /*
        //for n = 5, print numeric pyramid as shown below
        000010000 --> zeros: n-i; 
        000232000
        003454300
        045676540
        567898765
        */       
         
        //outer loop for n rows
        for(int i = 1; i <= n; i++){
            //1st part
            for(int j = 1; j <= n-i; j++){
                System.out.print(0 + " ");
            }
            int val = i;
            for(int j = 1; j <= i; j++){
                System.out.print(val + " ");
                val++;
            }
            
            //2nd part
            val = 2*i-2;
            for(int j = 1; j <= i-1; j++){
                System.out.print(val + " ");
                val--;
            }
            for(int j = 1; j <= n-i; j++){
                System.out.print(0 + " ");
            }
            
            System.out.println();
        }
    }
        
}