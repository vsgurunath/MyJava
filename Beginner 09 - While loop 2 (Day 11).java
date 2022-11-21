import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        /*
        //Q: print a number in reverse order. Eg. input = 6397; output = 7936
        int num_in = scn.nextInt(); //input number
        int num_loop = num_in; //to process during loop
        //int num_lsd = 0; //least significant digit (last digit)
        int num_sum = 0;
        
        System.out.print("input number: " + num_in);
        //to handle other user inputs: 0, negative and positive
        if (num_loop ==0) {
            System.out.print(0);
        }
        else if(num_loop < 0){
            num_loop = - num_loop;
            System.out.print("\nreversed: ");
        }
        while (num_loop > 0){
            int num_lsd = num_loop % 10; //least significant digit
            num_sum += num_lsd; //sum of all digits in the number
            System.out.print(num_lsd);
            num_loop = num_loop / 10;
        }
        
        System.out.println("\nsum of digits: " + num_sum);
        
        
        //Q: print perfect squares from 1 to n
        int n = scn.nextInt();
        int i = 1;
        
        while ((i*i) <= n){
            System.out.println(i*i);
            i++;
        }

        
        //Q: Check if the input number is a perfect square
        int n = scn.nextInt();
        int i = 1;
        
        while ((i*i) <= n){
            if ((i*i) == n) {
                System.out.println("input number: " + n);
                System.out.println("yes, " + n + " is a perfect square of " + i + "!");    
            }
            i++;
        }
        
        
        //Q: Given T numbers, pring the LSD of all the input numbers
        int T = scn.nextInt(); //number of input numbers
        int num_loop = T; //to process during loop
        
        while (T > 0){
            int num_in = scn.nextInt();
            int num_lsd = num_in % 10; //least significant digit of the input number
            System.out.println(num_lsd);
            T--; //decrement the loop counter after processing one of the inputs
        }
        
        
        //Q: Given T numbers, print the total of digits of all input numbers
        int T = scn.nextInt(); //number of input numbers
        System.out.println("number of inputs: " + T + "\n");
        
        while (T > 0){
            int num_in = scn.nextInt(); //input number
            int num_loop = num_in; //to process during loop
            //int num_lsd = 0; //least significant digit (last digit)
            int num_sum = 0;
            
            while (num_loop > 0){
                int num_lsd = num_loop % 10; //least significant digit
                num_sum += num_lsd; //sum of all digits in the number
                System.out.print(num_lsd);
                num_loop = num_loop / 10;
            }
            
            System.out.println("\nsum of digits: " + num_sum);
            T--; //decrement the loop counter after processing one of the inputs
        }
        */
        
//Assignment
        
        int t = scn.nextInt();
        
        while(t-- > 0) {
            int n = scn.nextInt();
            int first = 0;
            int last = 0;
            
            last = n % 10;
            
            while(n > 0) {
                first = n % 10;
                n = n / 10;
            }
            
            System.out.println(first + " " + last);
        }
        
    }
}