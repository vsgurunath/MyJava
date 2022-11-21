import java.util.*;
import java.lang.*;


public class Main {
    
    //Q4. replace characters in string and return
    static String replace_string(String str, char given_char){
        //REMEMBER: you can't replace a character in the original string at an index position
        String ans = "";//string variable to store the output string
        //compare each character in the input string if it matches given_char
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);//character
            if(ch == given_char){
                ans += '$';//replace with $
            }
            else{
                ans += ch;//original char from string
            }
        }
        return ans;//return the replaced string
    }
    
    //Q3. count of vowels and consonants
    static int[] vowels_consonants(String str){
        int v = 0;//count of vowels
        int c = 0;//count of consonants
        //loop through all characters in the string
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u')){
                v++;
            }
            else {
                c++;
            }
        }
        int []ans = {v, c};//1D array to return the count of vowels and consonants
        return ans;//return the array
    }
    
    //Q2. High to Low
    static String high_to_low(String str){
        String ans = "";
        //loop through the characters
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);//character wise conversion: assumption that the input is uppercase for sure
            
            //ascii difference between uppercase and lowercase of an alphabet is 32 
            //ASCII of A = 65; ASCII of a = 97
            //adding 32 to the ASCII value of uppercase character/alphabet (A-Z) will give me the lowercase alphabet
            
            //change case if the character is uppercase
            if(ch >= 'A' && ch <= 'Z'){
                char lch = (char)(ch + 32);//typecast the ASCII integer value into char
                /*
                char lch = ch + 32;//This won't work as compiler treats it as integer
                */
                ans += lch;//append the lower case character
            }
            else{
                ans += ch;//append the lowercase character directly
            }
            
        }
        return ans;        
    }
    
    //Q1. palindrome check
    static boolean isPalindrome(String str){
        //calculate reversed string
        String str_rev = "";
        //reverse
        for(int i = str.length()-1; i >= 0; i--){
            char ch = str.charAt(i);//character from right to left
            str_rev += ch;//append the character
        }
        
        // strings can't be compared using ==
        /*
        if(rev == str){
            return true;
        }
        else{
            return false;
        }
        */
        
        //APPROACH 1: go for character comparison after verifying both strings are of same length (general comment, not specifically for this question - reverse of a string will be having same length as that of original string)
        
        //APPROACH 2: equals() method: string1.equals(string2) --> returns a boolean value
        if(str.equals(str_rev)){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        
        /*
        //Q1.Given a string, check whether it is palindromic or not. Note: String doesn't contain whitespace.
        String str = scn.next();
        System.out.println(isPalindrome(str));//call the function to check

        
        //Q2. High to Low: 
        //Given an uppercase string, return lowercase version of the string
        String str = scn.next();//user input
        System.out.println(high_to_low(str));//call the function to convert
        
        //Q3. Given a string, find the count of vowels and consonants
        //assume the input string has only lowercase
        //Ex: for "elephant", the length is 8 --> 3 vowels and 5 consonants
        String str = scn.next();//user input
        int [] ans = vowels_consonants(str);
        System.out.println("vowels:" + ans[0]);
        System.out.println("consonants:" + ans[1]);
        */
        
        //Q4. Given a string and a character, build a function to replace all the occurences of the given character in the string and return it.
        String str = scn.next();//input string
        char given_char = scn.next().charAt(0);//first character of next string
        System.out.println(replace_string(str, given_char));//call the function       
    }
}