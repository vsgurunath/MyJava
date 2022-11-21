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

        //System.out.println("T " + T);
        //outer loop to process the number of test cases
        for (int i = T; i > 0; i--){
            //System.out.println("inside T loop");
            //1st inner loop: to process the i'th array: two lines of input per test case - length and array
            //for (int j = 2; j > 0; j--){
                //System.out.println("inside j loop");
                int array_len = scn.nextInt(); //user input: array length for this test case
                //System.out.println("array_len: " + array_len);
                //NOTE: array_len would be equal to sum of counts of even and odd elements
                int count_of_even_elements = 0; //counter variable to hold the count of even elements (based on value, not position)
                int count_of_odd_elements = 0; //counter variable to hold the count of odd elements (based on value, not position)

                //input array
                //int []arr = new int[array_len]; //declare and initialise new int array to capture input array

                //declare temp arrays of same length as that of input array but store the even and odd
                //this is not efficient as we may be using extra length in the temp array
                int []odd_arr_temp = new int[array_len];
                int []even_arr_temp = new int[array_len];

                //2nd inner loop: to capture/process the array elements
                for (int k = 0; k < array_len; k++){
                    //System.out.println("inside k loop");
                    int element = scn.nextInt();//read next input: array element
                    //System.out.println("element: " + element);
                    //arr[k] = element; //store the user input array element in array
                    if(element % 2 != 0){
                        count_of_odd_elements ++; //increment the odd element counter
                        odd_arr_temp[count_of_odd_elements - 1] = element;//store the odd number in the index
                    }
                    else{
                        count_of_even_elements ++; //increment the even element counter
                        even_arr_temp[count_of_even_elements - 1] = element;//store the even number in the index
                    }
                }
                //System.out.println("count_of_odd_elements: " + count_of_odd_elements);
                //System.out.println("count_of_even_elements: " + count_of_even_elements);

                //3rd inner loop: to remove the extra 0 elements from the temp odd array (based on count)
                int []odd_arr = new int[count_of_odd_elements];//declare and initialise odd array
                for (int l = 0; l < count_of_odd_elements; l++){
                    //System.out.println("inside l loop");
                    odd_arr[l] = odd_arr_temp[l];//capture the elements from the odd temp array
                    System.out.print(odd_arr[l] + " ");//print in output
                }
                System.out.println();//move to next line

                //4th inner loop: to remove the extra elements from the temp even array (based on count)
                int []even_arr = new int[count_of_even_elements];//declare and initialise even array
                for (int m = 0; m < count_of_even_elements; m++){
                    //System.out.println("inside m loop");
                    even_arr[m] = even_arr_temp[m]; //capture the elements from the even temp array
                    System.out.print(even_arr[m] + " ");//print in output
                }
                System.out.println();//move to next line
            //}
        }
    }
}