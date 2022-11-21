import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt(); //range
        
        /*
        //Q1. Print N stars
        for (int i = 1; i <= N; i++){
            System.out.print("*");
        }
        */
        
        /*
        //Q2. Given n, print square with *
        
        //approach 1 - using escape sequence '\n' after printing last star in a line
        
        for(int i = 1; i <= N; i++){
            for (int j = 1; j <= N; j++){
                if (j < N){
                    System.out.print("*");    
                }
                else if(j == N){
                    System.out.print("*\n");
                }
            }
        }
        
        //approach 2 - using println() after printing a row (inner loop)
        for(int i = 1; i <= N; i++){
            for (int j = 1; j <= N; j++){
                System.out.print("*");
            }
            System.out.println();
        }        
        
        //Q3. Given n, print staircase pattern
        for(int i = 1; i <= N; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println(); //new line after printing one line of stars
        }
        
        //Q4. Given n, print inversed staircase pattern
        for(int i = N; i >= 1; i--){
            for(int j = i; j >= 1; j--){
                System.out.print("*");
           }
           System.out.println();
        }
        */
                
        //Q5. Pattern with spaces
        //n rows
        //each row: one star + (n-i) spaces + one star
        //*----*
        //*---*
        //*--*
        //*-*
        //**
        
        /*
        for (int i = 1; i <= N; i++){
            System.out.print("*"); //print the first star
            
            for (int j = 1; j <= N-i; j++){
                System.out.print("-"); //print '-' so as to be able to count the spaces
            }
            
            System.out.print("*\n");
        }
        */
        
        /*
        //Q6. print the pattern

        //N = 6
        //*
        //*2
        //*2*
        //*2*4
        //*2*4*
        //*2*4*6
        
        for (int i = 1; i <= N; i++){
            for (int j = 1; j <= i; j++){
                if (j % 2 == 0){
                    System.out.print(j);
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        //Q. Given n, print inversed right-aligned staircase pattern
        for (int i = N; i >= 1; i--){
            String pattern = "";
            for (int j = 1; j <= N-i; j++){
                pattern = pattern + " ";
            }
            for (int k = 1; k <= i; k++){
                pattern = pattern + "*";                 
            }
            System.out.println(pattern);
        }
        
        //Q. Given n, print right-aligned staircase pattern
        //approach 1: use String variable to concatenate spaces and stars
        for (int i = 1; i <= N; i++){
            String pattern = "";
            for (int j = 1; j <= N-i; j++){
                pattern = pattern + " ";
            }
            for (int k = 1; k <= i; k++){
                pattern = pattern + "*";                 
            }
            System.out.println(pattern);
        }
        */       
         
        //approach 2: to print the stars based on looping only
        //outer loop: to print number of rows
        for (int i = 1; i <= N; i++){
            //inner loop 1: to print spaces
            for (int j = N-i; j > 0; j--){
                System.out.print(" ");//print spaces
            }
            //inner loop 2: to print stars followed by spaces
            for (int k = i; k > 0; k--){
                System.out.print("*");//print the stars
                if(k != 1){
                    System.out.print(" ");    
                }
            }
            System.out.println();//move the cursor to new line
        }
        /*
        //Homework Q: print right aligned inverted staircase
        for( int i = N; i > 0; i--){
            for (int j = N-i; j > 0; j--){
                System.out.print(" ");//print spaces
            }
            for (int k = i; k > 0; k--){
                System.out.print("*");//print stars
            }
            System.out.println();//move to new line
        }
        */

    
    }
}