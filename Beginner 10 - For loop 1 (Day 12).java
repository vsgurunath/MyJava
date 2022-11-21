import java.util.*;

class Main {
	public static void main(String args[]) {
		// Your code goes here
        Scanner scn = new Scanner(System.in);
        /*
        for(int i = 1; i <= 5; i++){
            System.out.println(i);
        }
        
        int j = 0;
        for(int i = 1; i <= 5; i++){
            System.out.println(i);
        }
        System.out.println(j);
        
        //declaration outside the FOR loop
        int k;
        for(k = 1; k <= 5; k++){
            System.out.println(k);
        }
        
        //declaration and initialization outside FOR loop
        int n = scn.nextInt(); //user input
        for(;n>0;n /= 10){
            System.out.println(n%10);
            //System.out.println(n);
        }
        
        //declaration, initialization and updating outside FOR statement
        int a = scn.nextInt();
        for(;a>0;){
            System.out.println(a%10);
            a /= 10;
        }
        
        //print first and last digit of a given number
        int n = scn.nextInt();
        int fd = 0; //first digit
        int ld = n%10; //last digit
        
        //loop through the digits
        for (;n>0;n/=10){
            fd = n%10;
        }
        System.out.println("first digit: " + fd);
        System.out.println("last digit: " + ld);
        

        //append a digit to a number
        int n = scn.nextInt(); //number
        int m = scn.nextInt(); // digit to be appended
        int new_n = (n * 10) + m;
        System.out.println(new_n);
        
        
        //reverse a number
        int num_in = scn.nextInt(); //user input
        int num_temp = num_in; //to keep num_in unaffected
        int num_rev = 0; //output value - that captures the reverse of input        
        
        for (;num_temp > 0; num_temp /= 10){
            int digit = num_temp % 10;
            num_rev = (num_rev * 10) + digit;
        }
        System.out.println("input: " + num_in);
        System.out.println("reverse: " + num_rev);
        if (num_in == num_rev){
            System.out.println(num_in + " is a palindrome number");
        }
        else{
            System.out.println(num_in + " is not a palindrome number");
        }
        
        

        for(int i = 10; i <= 5; i--) {
             System.out.print(i + " ");
         }
         
         
         for(int i = 1; i <= 10; i++) {
             System.out.print(i++ + " ");
         }
         
         
         for(int i = 1; i <= 20; i = i * 2) {
             System.out.print("Hello ");
         }
         */
        
        for(int i = 11; i < 10; i++) {
             System.out.print(100 / 0);
         }
	}
}