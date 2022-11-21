import java.util.*;
class Main {
	public static void main(String args[]) {
		// Your code goes here
        /*
        int a = 100000000000;
        int b = 1000;
        System.out.println(a*b);


        int a = 100000;
        int b = 400000;
        int c = a * b;
        System.out.println(c);
        System.out.print(1000000000*1000000000);
                
                int a = 100000;
        int b = 400000;
        long c = a * b;
        System.out.print(c);

        long a = 100000;
        long b = 400000;
        int c = a * b;
        System.out.print(c);


        long a = 100000;
        int b = 400000;
        int c = a * b;
        System.out.print(c);

        long a = 100000;
        int b = 400000;
        long c = a * b;
        System.out.print(c);


        long a = 100000;
        long b = 400000;
        long c = a * b;
        System.out.print(c);


        int a = 100000;
        int b = 400000;
        long c = (long)(a * b);
        System.out.println(c);


        int a = 100000;
        int b = 400000;
        long c = (long)(a * b); //first the calculation is carried out with output data type as int --> data loss already happens
        //(long)(a*b) is not the same as (long)a*b
        System.out.println(c);

        int d = 100000;
        int e = 400000;
        long f = (long)d * e;
        System.out.println(f);

        //float g = 8.2/4; //error --> compiler favorite for decimal numbers is double, though float can also store decimals
        float g = (float)8.2/4; 
        System.out.println(g);
        double a = 10;
        double b = 5;
        double c = (double) a/b;
        System.out.println(c);

        //long z = 100000000000; //error --> compiler default for integer number unless explicity instructed to treat it as larger type is int;
        long z = 100000000000l;
        System.out.println(z); 

        //float y = 4.6; //error --> compiler default for decimal number is double. so, it needs to be instructed
        float y = (float) 4.6; 
        System.out.print(y);
        */

        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt(); //InputMismatchException if a decimal value, say 4.5, is input
        System.out.println(a);

        float val1 = (float)(4.2/2); //we are overriding the compiler default for 4.2 (double) by forcing it to treat the value as float with "(float)"
        System.out.println(val1);
        //float val2 = (4.2/2); //error as compiler default for 4.2 is double and lossy conversion by assigning it to float variable
        //System.out.println(val2);

        //Operators
        /*
        int a = 10;
        int b = 20;
        boolean comparisonresult = a<b;
        System.out.println(comparisonresult);
        */

        /*
        //Q1 - with boolean data type
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int n3 = scn.nextInt();

        boolean b1 = (n1 > n2); //boolean type to save the result of comparison
        boolean b2 = (n2 <= n3);
        boolean b3 = (n1 < n2) || ((n2 == n3) && (n1 < n3)); //(n1 < n2) will be on one side and ((n2 == n3) && (n1 < n3)) will be on the other side

        System.out.println("Number 1 is " + n1);
        System.out.println("Number 2 is " + n2);
        System.out.println("Number 3 is " + n3);

        System.out.println("(n1 > n2) condition is " + b1);
        System.out.println("(n2 <= n3) condition is " + b2);
        System.out.println("(n1 < n2) || (n2 == n3) && (n1 < n3)) condition is " + b3);
        
        //Q1 - without boolean data type
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int n3 = scn.nextInt();
        System.out.println("Number 1 is " + n1);
        System.out.println("Number 2 is " + n2);
        System.out.println("Number 3 is " + n3);

        System.out.println("(n1 < n2) condition is " + (n1 < n2));
        System.out.println("(n2 == n3) condition is " + (n2 == n3));
        System.out.println("(n1 < n2) && (n2 == n3) condition is " + ((n1 < n2) && (n2 == n3)));
        
        //Q2
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int n3 = scn.nextInt();
        System.out.println("Number 1 is " + n1);
        System.out.println("Number 2 is " + n2);
        System.out.println("Number 3 is " + n3);
        System.out.println(((n1<50)||(n2>n3)||(n1==n3)));
        
        
        //Q3
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int n3 = scn.nextInt();

        boolean b1 = (n1 > n2); //boolean type to save the result of comparison
        boolean b2 = (n2 <= n3);
        boolean b3 = (n1 < n2) || ((n2 == n3) && (n1 < n3)); //(n1 < n2) will be on one side and ((n2 == n3) && (n1 < n3)) will be on the other side

        System.out.println("Number 1 is " + n1);
        System.out.println("Number 2 is " + n2);
        System.out.println("Number 3 is " + n3);

        System.out.println("(n1 > n2) condition is " + b1);
        System.out.println("(n2 <= n3) condition is " + b2);
        System.out.println("(n1 < n2) || (n2 == n3) && (n1 < n3)) condition is " + b3);
        
        
        //Q4
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int n3 = scn.nextInt();

        boolean b1 = (n1 > n2); //boolean type to save the result of comparison
        boolean b2 = (n2 <= n3);
        boolean b3 = (n1 < n2) || ((n2 == n3) && (n1 < n3)); //(n1 < n2) will be on one side and ((n2 == n3) && (n1 < n3)) will be on the other side

        System.out.println("Number 1 is " + n1);
        System.out.println("Number 2 is " + n2);
        System.out.println("Number 3 is " + n3);

        System.out.println((n1 < 50) && (n2 > n3) && (n1 <= n3));
        
        
        //Q5
        Scanner scn = new Scanner(System.in);
        int N1 = scn.nextInt();
        int N2 = scn.nextInt();
        int N3 = scn.nextInt();

        //double output = (N1 + N2)/N3;
        int output = (N1 + N2)%N3;
        System.out.println(output);
        */
        
        //MCQ
        /*
        int a = 2 - - 7;
        System.out.println(a);
        
        
        boolean b = false;
        b = !b;
        System.out.println(b);
        
        
        int a=3, b=8;
        boolean c = a > 5 && ++b > 6;
        System.out.println(b);
        
        
        int a = 20;
        int b = 10;
        System.out. print((a > b) && (b++ > 25));
        System.out.println(b);
        
        
        Scanner scn = new Scanner(System.in);
        String s = scn.nextString();
        System.out.println(s);
        */
        
        /*
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int n3 = scn.nextInt();

        boolean b1 = (n1 > n2); //boolean type to save the result of comparison
        boolean b2 = (n2 <= n3);
        boolean b3 = (n1 < n2) || ((n2 == n3) && (n1 < n3)); //(n1 < n2) will be on one side and ((n2 == n3) && (n1 < n3)) will be on the other side

        System.out.println("Number 1 is " + n1);
        System.out.println("Number 2 is " + n2);
        System.out.println("Number 3 is " + n3);

        System.out.println("(n1 > n2) condition is " + b1);
        System.out.println("(n2 <= n3) condition is " + b2);
        System.out.println("(n1 < n2) || (n2 == n3) && (n1 < n3)) condition is " + b3); 
        */
        
        
	}
}