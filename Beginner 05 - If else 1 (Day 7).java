import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scn = new Scanner(System.in);
        
        /*
        //example 1: suggest protien foods
        //program to suggest the user with protien foods based on veg or non-veg
        boolean non_veg = scn.nextBoolean();//user must write "true" or "false" in the input field
        if (non_veg == true){
            System.out.println("Chicken, egg, fish..");            
        }
        else {
            System.out.println("pulses, sprouts, paneer, etc");
        }
        
        //example 2: eligibility to vote
        int age = scn.nextInt();
        if(age>=18){
            System.out.println("eligible to vote");
        }
        else{
            System.out.println("not eligible to vote");
        }

        
        //example 3: fever check with float input
        float temperature = scn.nextFloat();
        if(temperature >= 98.6){ //float is compared against double
            System.out.println("fever");
        }
        else{
            System.out.println("no fever");
        }

        
        //example 4: fever check with type cast 
        float temperature = scn.nextFloat();
        if(temperature >= 98.6f){ //float is compared against float
            System.out.println("fever");
        }
        else{
            System.out.println("no fever");
        }
        
        //example 5: fever check with double
        double temperature = scn.nextFloat();
        if(temperature >= 98.6){ //double is compared against double (compiler default)
            System.out.println("fever");
        }
        else{
            System.out.println("no fever");
        }
        
        
        //more comparisons with ranges
        double temperator = scn.nextDouble();
        if (98.0 <= temperature <= 98.9){ //this comparison express is not understandable to the compiler
            System.out.println("normal");
        }
        else {
            System.out.println("check more");
        }
        
        //with ranges - multiple comparison
        //ensure that the ranges should allow the 'if' to be true for only one range
        double temperature = scn.nextDouble();
        if (temperature >= 98.0 && temperature <= 98.9){
            System.out.println("normal");
        }
        if (temperature >= 99.0 && temperature <= 99.9){
            System.out.println("mild fever");
        }
        if (temperature >= 100.0 && temperature <= 101.9){
            System.out.println("fever");
        }
        if (temperature > 102.0){
            System.out.println("high fever");
        }
        if (temperature >= 96.0 && temperature <= 97.9){
            System.out.println("hypothermia");
        }
        if (temperature < 96.0 ){
            System.out.println("serious hypothermia");
        }
        */
        int a = 10;
        int b= (a++) * 2 / (++a)*2;
        System.out.println(a);
        System.out.println(b);
        
        /*
        //Homework
        Scanner scn = new Scanner(System.in);

        int N = scn.nextInt(); //only integers can be odd or even - so input is integer

        int N_mod_2 = N % 2; //remainder when divided by 2

        if ((N_mod_2 == 0) && (N > 0)) {
            System.out.println("Number is Positive and Even");
        }
        if ((N_mod_2 == 0) && (N < 0)) {
            System.out.println("Number is Negative and Even");
        }
        if ((N_mod_2 != 0) && (N > 0)) {
            System.out.println("Number is Positive and Odd");
        }
        if ((N_mod_2 != 0) && (N < 0)) {
            System.out.println("Number is Negative and Odd");
        }
        
        if(a<b)
        System.out.println("Hi");
        else
        System.out.println("Hello");
        
        String name="dino";

        if(name == "dino")

        System.out.print("DINO");

        System.out.println("GOOD");



        boolean x, y, z;

        x = y = z = true;

        if(!x || (!y && !z))

        System.out.println("WHY");

        else

        System.out.println("WHAT");
        
        
        
        float a = 7.3f;
        System.out.print(a);

        if(a == 7.3f)

        System.out.print("Hi");

        else

        System.out.print("Know Program");
        */

        int a=5, b=6;

        if(a++ == --b)

        {

        System.out.println("5=5");

        }

        else

        {

        System.out.println("NONE");

        }
        */
    }
}