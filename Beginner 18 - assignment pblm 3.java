import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();//number of test cases

        //outer loop to process the number of test cases
        for(int i = 1; i <= T; i++){
            System.out.println("i " + i);
            //1st inner loop: to process the i'th array: two lines of input per test case - length and array
            for(int j = 1; j <= 2; j++){
                System.out.println("j " + j);
                int array_len = scn.nextInt(); //user input: array length for this test case
                System.out.println("length " + array_len);
                //note that array_len should be equal to sum of counts of even and odd elements
                //int count_of_even_elements = 0; //counter variable to hold the count of even elements (based on value, not position)
                //int count_of_odd_elements = 0; //counter variable to hold the count of odd elements (based on value, not position)

                String odd_elements = "";//string to hold the odd numbers
                String even_elements = "";//string to hold the even numbers

                //int []arr = new int[array_len]; //declare and initialise new int array to capture input array
                
                //2nd inner loop: to capture/process the array elements
                for(int k = 0; k < array_len; k++){
                    int element = scn.nextInt();//read next user input
                    //arr[k] = element; //store the user input array element in array
                    
                    System.out.println("k" + k);
                    System.out.println("element" + element);
                                        
                    if(element % 2 != 0){
                        System.out.println("odd");
                        odd_elements = odd_elements + " " + element;//concatenate the odd element
                        //count_of_odd_elements ++; //increment the odd element counter
                    }
                    else{
                        System.out.println("even");
                        even_elements = even_elements + " " + element;//concatenate the even element
                        //count_of_odd_elements ++; //increment the even element counter
                    }
                }
                System.out.println(odd_elements);//print the odd elements
                System.out.println(even_elements);//print the even elements
                
                
                /*
                //3rd inner loop: to segregate the odd elements of main array into odd array based on count found in 2nd inner loop
                if (count_of_odd_elements > 0){
                    int []odd_arr = new int[count_of_odd_elements];//declare and initialise odd array
                    for (int l = 0; l < count_of_odd_elements; l++){
                        odd_arr[l] = 
                    }
                }
                else{
                    System.out.println();//print an empty line in case of zero odd elements in main array
                }

                //4th inner loop: to segregate the even elements of main array into even array based on count found in 2nd inner loop
                int []even_arr = new int[count_of_even_elements];//declare and initialise even array
                for (int l = 0; l < count_of_even_elements; l++){
                    
                }
                */
            }
        }
    }
}