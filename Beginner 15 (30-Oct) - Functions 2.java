import java.lang.*;
import java.util.*;

public class Main {
    
    //approach 1: doesn't return a value to calling function
    static void even_odd_print(int num){
        if (num % 2 == 0){
            System.out.println("(void) Even");
        }
        else{
            System.out.println("(void) Odd");
        }
    }
    
    //approach 2: returns a boolean value (True or False) to calling function checking for even condition
    static boolean is_even_return(int num){
        boolean is_E;
        if (num % 2 == 0){
            is_E = true;
        }
        else{
            is_E = false;
        }
        return is_E;
    }
    
    //Question 3: perfect square check: return 1 if yes, 0 if not
    static int is_perfect_square(int num){
        int return_val = 0;//to return 0 in case the condition doesn't pass
        int square_of_i = 1;//temp variable
        for(int i = 1; i*i <= num; i++){
            square_of_i = i*i;
            if (square_of_i == num){
                return_val = 1;//return 1 if given number is perfect square
                break;
            }
        }
        return return_val;
    }
    
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scn = new Scanner(System.in);

        int N = scn.nextInt(); //user input
        
        //approach 1: void function
        even_odd_print(N);//calls function;
        
        //approach 2: return function
        boolean is_even = is_even_return(N);
        System.out.println("(return) " + is_even);
        
        //approach 3: in the way the function is used
        if(is_even_return(N)){
            System.out.println(N + " is Even");
        }
        else{
            System.out.println(N + " is Odd");
        }
        
        //Question 3: check for perfect square (1 for perfect square, 0 if not)
        int answer = is_perfect_square(N);
        if (answer == 1){
            System.out.println(N + " is a perfect square");
        }
        else{
            System.out.println(N + " is not a perfect square");
        }
        
        //another method to call the function
        if(is_perfect_square(N) == 1){
            System.out.println("perfect square");
        }
        else{
            System.out.println("not a perfect square");
        }
        
        //assignment Question
        System.out.println(solve1(-500));
        
        //celcius to farenheit Question
        solve2(36.8);
    }
    
    static int solve1(int A) {
        /*
        double X = A/200.0;//for all the divisions, always use double division (not integer division)
        System.out.println(X);
        X = (Math.round(X)*100)/100d;
        int Y = (int) Math.ceil(X);//just round off the quotient and type cast into i
        return Y;
        */
        
        double a=(A*1.0)/200.00;
        if(a>=0){
        a+=0.5d;
        }else{
        a-=0.5d;
        }
        int k;
        if(a>=0){
        k=(int)Math.floor(a);
        }else{
        k=(int)Math.ceil(a);
        }
        //return k;
        System.out.println(k);
        return k;
        /*
        double a=(A*1.0)/200.00;
        if(a>=0){
        a+=0.5d;
        }else{
        a-=0.5d;
        }
        int k;
        if(a>=0){
        k=(int)Math.floor(a);
        }else{
        k=(int)Math.ceil(a);
        }
        return k;
        */
    }
    
    public static double solve2(double celsius) {
        //conversions
        //F = (C * 9/5) + 32
        //C = (F - 32) * 5/9
        double farenheit = (celsius * 9/5d) + 32; //formula
        System.out.println(farenheit);
        //farenheit = Math.round((farenheit * 100.0)/100d);
        farenheit = Math.round(farenheit * 100.0)/100.0;
        System.out.println(farenheit);
        return farenheit;
    }
}