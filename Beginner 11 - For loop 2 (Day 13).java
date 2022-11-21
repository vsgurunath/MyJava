import java.lang.*;
import java.util.*;

/*
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        
        //Q. Find the factors of N
        
        /*
        //Approach 1 - after finding all the factors
        //Factor of N: is a number that divides N completely
        //smallest factor is 1
        //largest possible factor is N itself
        int N = scn.nextInt(); //user input
        int count_of_factors = 0; //count of factors - when N > 1, count of factors is only 2, it could be a prime number!
        for (int i = 1; i <= N; i++){ //valid range for factors is smallest factor to largest factor
            if(N % i == 0){ //i completely divides N
                count_of_factors += 1;
                System.out.println(i);
            }
        }
        if (count_of_factors == 2){
            System.out.println("The input number " + N + " is a prime number");
        }
        else if(count_of_factors > 2) {
            System.out.println("The input number " + N + " is composite number");
        }
        else {
            System.out.println("The input number " + N + " is neither a prime nor a composite number");
        }
        
        //Approach 2: optimized looping - using a BREAK statement
        //Q. Find the factors of N
        int N = scn.nextInt(); //user input
        int count_of_factors = 0; //count of factors - when N > 1, count of factors is only 2, it could be a prime number!
        for (int i = 1; i <= N; i++){ //valid range for factors is smallest factor to largest factor
            if(N % i == 0){ //i completely divides N
                count_of_factors += 1;
                if (count_of_factors > 2){//number can't be prime
                    break;
                }
            }
        } 
        //if ((count_of_factors == 2) && (i == N)){ // i is undefined outside of 'for' loop
        if (count_of_factors == 2){
            System.out.println("The input number " + N + " is a prime number");
        }
        else {
            System.out.println("The input number " + N + " is not a prime number");
        }

        
        
        //CONTINUE statement
        for(int i = 1; i <= 10; i++){
            if(i == 4 || i == 6){
                System.out.println("inside CONTINUE condition");
                continue;
                //if any statement is given after 'continue' statement, compilation error: "unreachable statement"
                //System.out.println("this statement will never be processed");
            }
            System.out.println(i);
        }        
        
        //Factorial: N!        
        int N = scn.nextInt();//user input
        int factorial_value = 1;
        for (int i = 1; i <= N; i++){
            factorial_value *= i;
        }
        System.out.println(factorial_value);
        
        
        
        //homework - with function
    }
}
*/


public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int A = scn.nextInt(); //user input  
        Solution sln = new Solution();//create an object of Solution 
        int sum = sln.solve(A);//call the method on the object
        //int sum_of_even_num = solve(A); //call the function and store the returned value in the variable
        //System.out.println(sum_of_even_num);
        System.out.println(sum);
    }


    public int solve(int A) {
        int sum = 0;
        for (int i = 1; i <= A; i++){
            if (i % 2 == 0){
                sum += i;
            }
        }
        return sum;
        
    }
}