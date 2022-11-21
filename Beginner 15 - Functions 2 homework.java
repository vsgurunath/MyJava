//count of primes
public class Solution {
    public int solve(int A) {
        int count_of_primes = 0;//declare and initialize variable for primes

        //outer loop to process the range
        for(int i = 1; i <= A; i++){
            int count_of_factors = 0;//declare and initialize variable for factors

            //inner loop to process factors of each number in the range
            for(int j = 1; j <= i; j++){
                
                if (i % j == 0){
                    count_of_factors ++;
                }
                if (count_of_factors > 2){
                    //a prime number can't have more than 2 factors, so exit the loop
                    break;
                }
            }
            //after processing all the numbers or exiting the loop (whichever happens), check for count of factors for prime
            if (count_of_factors == 2){
                count_of_primes++; //increment the count of prime number
            }
            count_of_factors = 0;//reset the count of factors while processing a different number in the range
        }
        return count_of_primes;
    }
}

//BMI calculator
import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scn = new Scanner(System.in);

        int A = scn.nextInt();//user input: height in cm
        int B = scn.nextInt();//user input: weight in kg
        
        BMIcategorizer(A, B);//call the function by passing the height and weight
    }

    static void BMIcategorizer(int h, int w){

        double mtr = h / 100.0; //convert centimeters to meters
        double BMI_val = (w * 1.0) / (mtr * mtr * 1.0);//BMI formula: multiply by 1.0 to make double division
        BMI_val = Math.round(BMI_val * 10) / 10d;//to have one decimal point value
        
        //ORDERING THE CONDITIONS:check the value ranges in descending order so that the if-else if structure processes the values appropriately
        if (BMI_val >= 29.9) {
            System.out.println("Obese");
            System.out.println(BMI_val);
        }
        else if(BMI_val >= 24.9) {
            System.out.println("Overweight");
            System.out.println(BMI_val);
        }
        else if(BMI_val >= 18.5) {
            System.out.println("Normal");
            System.out.println(BMI_val);
        }
        else {
            System.out.println("Underweight");
            System.out.println(BMI_val);
        }
        return;
    }
}

//Is perfect square
public class Solution {
    public int solve(int A) {
        int perfect_square = 0;

        /*
        //approach 1: usual looping
        //loop only upto the value when squared doesn't exceed the given number
        for (int i = 1; i*i <= A; i++){
            if (i * i == A){
                perfect_square = 1;
                break;
            }
        }
        */

        //approach 2: using Math.pow(A,0.5) along with Math.ceil & Math.floor
        if ( (int) Math.ceil(Math.pow(A, 0.5)) == (int) Math.floor(Math.pow(A, 0.5)) ) {
            perfect_square = 1;
        }
        return perfect_square;
    }
}


//square root of a number
public class Solution {
    public int solve(int A) {
        int square = 0;//output variable

        //loop only until the point when the square of loop variable doesn't exceed the given number
        for(int i = 1; i*i <= A; i++){
            if(i*i == A){
                //return i; --> even when i gave the return statements inside if and else of the for loop, the compiler gave an error stating 'missing return statement'
                square = i;
            }
            else{
                //return -1; --> even when i gave the return statements inside if and else of the for loop, the compiler gave an error stating 'missing return statement'
                square = -1;
            }
        }
        return square;
    }
}


//sum of evens
public class Solution {
    public int solve(int A) {
        int sum_of_even_numbers = 0;//declare and initialize the sum variable

        //loop upto the given number (as per the instruction mentioned under Output Format)
        for(int i = 1; i <= A; i++){
            if (i % 2 == 0){
                sum_of_even_numbers += i;//add the i to sum
            }
        }
        return sum_of_even_numbers;
    }
}
