import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scn = new Scanner(System.in);
        
        //slab-wise charges
        double r1 = 1.0;
        double r2 = 2.0;
        double r3 = 3.0;
        double r4 = 5.0;
        double ttl_charge = 0;

        int u = scn.nextInt(); //input value: electricity units consumed
        
        if (u <= 50) {
            ttl_charge = u * r1;
        }
        else if (u > 50 && u <= 150) {
            ttl_charge = (50 * r1) + ((u - 50) * r2);
        }
        else if (u > 150 && u <= 250) {
            ttl_charge = (50 * r1) + (100 * r2) + ((u - 150) * r3);
        }
        else if (u > 250) {
            ttl_charge = (50 * r1) + (100 * r2) + (150 * r3) + ((u - 250) * r4);
        }
        
        //output the total charges
        System.out.println(ttl_charge);
        
        /*
        if(u <= 50) {
            System.out.println(u*1);
        }
        else if(u > 50 && u <= 150) {
            System.out.println(50*1 + (u-50)*2);
        }
        else if(u > 150 && u <= 250) {
            System.out.println(50*1 + 100*2 + (u-150)*3);
        }
        else if(u > 250) {
            System.out.println(50*1 + 100*2 + 100*3 + (u-250)*5);
        }
        */
        //we can minimise the use of conditions
        /*
        if(u <= 50) {
            System.out.println(u*1);
        }
        else if(u <= 150) {
            System.out.println(50*1 + (u-50)*2);
        }
        else if(u <= 250) {
            System.out.println(50*1 + 100*2 + (u-150)*3);
        }
        else {
            System.out.println(50*1 + 100*2 + 100*3 + (u-250)*5);
        }
        */
        
        //Assignment
Scanner scn = new Scanner(System.in);

        //input the consumed units of electricity
        int N = scn.nextInt();
        int bill = 0;

        //logic to calculate electricity bill
        if (N <= 50){
            bill = (int)(N * 0.5);
            System.out.println((bill + (int)(bill * .2)));
        }
        else if (N <= 150){
            bill = 25 + (int)((N-50) * 0.75);
            System.out.println((bill + (int)(bill * .2)));
        }
        else if (N <= 250){
            bill = 100 + (int)((N - 150) * 1.20);
            System.out.println((bill + (int)(bill * .2)));
        }
        else {
            bill = 220 + (int)((N - 250) * 1.50);
            //System.out.println((bill + (int)(bill * .2)));
            System.out.println((int)((220 + ((N - 250) * 1.50)) + (((220 + ((N - 250) * 1.50))) * 0.2)));
        }

        /*
        //slab-wise charges
        double r1 = 0.5;
        double r2 = 0.75;
        double r3 = 1.2;
        double r4 = 1.5;
        double ttl_charge = 0;
        int ttl_charge_sur = 0;

        int u = scn.nextInt(); //input value: electricity units consumed
        
        if (u <= 50) {
            ttl_charge = (u * r1);
            ttl_charge_sur = (int)(ttl_charge * 0.2) + (int)ttl_charge;
        }
        else if (u <= 150) {
            ttl_charge = (50 * r1) + ((u - 50) * r2);
            ttl_charge_sur = (int)(ttl_charge * 0.2) + (int)ttl_charge;
        }
        else if (u <= 250) {
            ttl_charge = (50 * r1) + (100 * r2) + ((u - 150) * r3);
            ttl_charge_sur = (int)(ttl_charge * 0.2) + (int)ttl_charge;
        }
        else if (u > 250) {
            ttl_charge = (50 * r1) + (100 * r2) + (100 * r3) + ((u - 250) * r4);
            ttl_charge_sur = (int)(ttl_charge * 0.2) + (int)ttl_charge;
        }
        
        //output the total charges
        System.out.println((int)ttl_charge);
        System.out.println((int)ttl_charge_sur);
        */
        
        /*
        if(u <= 50) {
            System.out.println(u*1);
        }
        else if(u > 50 && u <= 150) {
            System.out.println(50*1 + (u-50)*2);
        }
        else if(u > 150 && u <= 250) {
            System.out.println(50*1 + 100*2 + (u-150)*3);
        }
        else if(u > 250) {
            System.out.println(50*1 + 100*2 + 100*3 + (u-250)*5);
        }
        */
        //we can minimise the use of conditions
        /*
        if(u <= 50) {
            System.out.println(u*1);
        }
        else if(u <= 150) {
            System.out.println(50*1 + (u-50)*2);
        }
        else if(u <= 250) {
            System.out.println(50*1 + 100*2 + (u-150)*3);
        }
        else {
            System.out.println(50*1 + 100*2 + 100*3 + (u-250)*5);
        }
        */        
    }
}