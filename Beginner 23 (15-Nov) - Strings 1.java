import java.util.*;
import java.lang.*;


public class Main {

    
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        /*
        //BASICS OF CHAR
        //Characters = anything we can type using keyboard for length 1: a-z, A-Z, 0-9, space, ~!@ (and other special characters)
        //discussed so far: int, long, float, double, boolean

        char ch1 = 'a';
        System.out.println(ch1);
        System.out.println((int)ch1);//print the ASCII value of the character
        
        char ch5 = '?';
        System.out.println((int) ch5);
        
        int ascii_val = (int) 'a';//type casting character to ascii value 
        System.out.println(ascii_val);//
        ascii_val = 'a';//automatic type casting by the compiler
        System.out.println(ascii_val);//
        
        char ch2 = 97;//ASCII is taken when it's not enclosed within quotes
        System.out.println(ch2);
        
        //char ch3 = '97';//not allowed
        //System.out.println(ch3);
        
        char ch4 = 500;//not an ASCII value: so '?' will be printed
        System.out.println(ch4);
        */
        
        /*
        //BASICS OF STRINGS
        //String = sequence of characters
        
        String str = "Hello world";
        
        //IMPORTANT: USE THE CORRECT METHOD NAMES
        //we must use methods to process the characters present in the String
        System.out.println(str.length());
        //find a character present at a particular index
        System.out.println(str.charAt(7));//at index 7
        //we can't use [] like in arrays: not like str[7]
        //Also, we can't modify the character present in a particular index of a String
        
        String str2 = "Hello" + 12;//Hello12
        System.out.println(str2);
        
        str2 = "Hello" + 12 + 5;//Hello125
        System.out.println(str2);
        
        str2 = 12 + 5 + "Hello" + 12 + 5;//17Hello125
        System.out.println(str2);
        
        String str3 = "Hell" + 'o' + " World" + '!';//concatenation with CHAR variables
        System.out.println(str3);
        */        
        
        /*
        //BASICS OF STRING
        //Q1. Given a string, count total number of upper case characters and return that count
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        str = "SivaGuruNathan";
        //next() will read the string till first white space
        str = scn.next();//get the string input from user without white spaces
        System.out.println(countUpperCase(str));//call the function
        //nextLine() will read the entire line (string)
        str = scn.nextLine();//get the string input from user with white spaces
        System.out.println(countUpperCase(str));//call the function: 
        */
        
        /*
        //Q2. given a string, write a function that returns reverse of a string
        String str = scn.next();//user input: get the input string
        System.out.println(str);//print input string
        System.out.println(reverse_string(str));//print the output reversed string
        */
        
        //Check palindrome
        String s = "level";
        // complete the function template
        int len = s.length();//length of input string
        String s_rev = "";//declare and initialize empty string to store the reverse
        //find the reverse of the original string
        for(int i = len-1; i >= 0; i--){
            s_rev += s.charAt(i);//append the character from right to left
        }

        System.out.println(s);
        System.out.println(s_rev);
        //check for palindrome: whether s and s_rev are same
        
        //IMPORTANT: string comparison isn't direct: == won't give correct result
        if(s == s_rev){
          System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
    
    //Q2. to return the reverse string
    static String reverse_string(String str){
        int len = str.length();//length of input string
        String str_rev = "";//declare and initialize the output string
        //loop through the input string from right to left
        for(int i = len-1; i >= 0; i--){
            str_rev += str.charAt(i);//append the right most character from input string
        }
        return str_rev;//return the reverse
    }
    
    //Q1. to count the upper case characters in a string
    static int countUpperCase(String str){
        int len = str.length();//length() function to find the number of characters
        int count = 0;//output variable to store count of upper case characters
        int start = 'A';//starting value of ASCII value of uppercase: 65
        int end = 'Z';//ending value of ASCII value of uppercase: 90
        
        //loop through the characters in the string
        for(int i = 0; i < len; i++){
            char ch = str.charAt(i);//character at the index (string is array)
            //check if the ASCII value of the character falls in the uppercase range
            /*
            //approach 1: to explicitly compare the ASCII values
            if((int) str.charAt(i) >= start && (int) str.charAt(i) <= end){
                count++;//increment the counter for upper case
            }
            */
            //approach 2: to compare the ASCII values directly for the range
            if(ch >= 65 && ch <= 90){
                count++;//increment the counter for upper case
            }
/*
            //approach 3: to let the compiler compare the ASCII values implicitly
            if(ch >= 'A' && ch <= 'Z'){
                count++;//increment the counter for upper case
            }
*/
        }
        
        return count;//return the count
    }
}