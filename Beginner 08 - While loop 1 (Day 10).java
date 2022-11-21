import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        
        /*
        //1. print all natural numbers from 1 to 5
        int i = 1; //loop counter
        while(i <= 5){
            System.out.println(i);
            i++;
        }
        
        //2. print all natural numbers from 1 to n
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); //input loop count
        int i = 1; //loop counter
        while(i <= n){
            System.out.println(i);
            i++;
        }
        
        //3. print all EVEN numbers between 0 and n
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); //input loop count
        int i = 0; //loop counter

        while(i <= n){
            if (i%2 == 0){
                System.out.print(" " + i);    
            }
            i++;
        }
        
        while(i <= n){
            System.out.println(i);    
            i += 2;
        }
        
        //4. print all ODD numbers between 0 and n
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); //input loop count
        int i = 1; //loop counter

        while(i <= n){
            if (i%2 != 0){
                System.out.println(i);    
            }
            i++;
        }
        
        while(i <= n){
            System.out.println(i);    
            i += 2;
        }        

        
        //factorial
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); //input loop count
        int i = 0; //loop counter
        int sum = 0;
        
        while (i <= n){
            sum = sum + i;
            System.out.println(sum);
            i++;
        }
        
        //multiples of 4
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); //input loop count
        int i = 4; //loop counter --> beware: if you initialize as 0 and multiply, it'll be an infinite loop
        while(i <= n){
            System.out.println(i);
            i += 4;
        }
        */                
        //fibonacci series
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); //input loop count
        int i = 0; //loop counter
        int sum = 0;
        
        while (i <= n){
            sum = sum + i;
            System.out.println(sum);
            i++;
        }

    }
}