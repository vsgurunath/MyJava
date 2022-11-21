import java.util.*;
import java.lang.*;

class Main {

   public static void main(String args[]) {
        
        String A = "pampampam";//given string
        int p_count = 0;//count of 'p' in the string
        int m_count = 0;//count of 'm' in the string
        int a_count = 0;//count of 'a' in the string
        
        //loop to process the input string
        for(int i = 0; i < A.length(); i++){
            char ch = A.charAt(i);//character at index
            if(ch == 'a'){
                a_count++;
            }
            else if(ch == 'm'){
                m_count++;
            }
            else if(ch == 'p'){
                p_count++;
            }
        }

        int apm_total = p_count + m_count + a_count;
        
        System.out.println("a_count: " + a_count);
        System.out.println("p_count: " + p_count);
        System.out.println("m_count: " + m_count);
        System.out.println("apm_total " + apm_total);

        //loop the wishes: until break point
        int i = 1;
        // for(int i = 1; m_count > 0; i++){
        while(m_count > 0){
            //odd wish: remove 'p' and 'm'
            if(i % 2 == 1){
                p_count--;
                m_count--;
                apm_total -= 2;
                System.out.println("p_count: " + p_count);
                System.out.println("m_count: " + m_count);
                System.out.println("------------");
            }
            //even wish: remove 'a' and 'm'
            else{
                a_count--;
                m_count--;
                apm_total -= 2;
                System.out.println("a_count: " + a_count);
                System.out.println("m_count: " + m_count);
                System.out.println("------------");
            }

            // //if(p_count == 0 || a_count == 0 || m_count == 0){
            // if(m_count == 0){
            //     break;
            // }
            i++;
        }

        System.out.println("apm_total " + apm_total);
        //check if there are any 'a' or 'p' left in the string
        if(apm_total > 0){
            //return 1;
            System.out.println(0);
        }
        else{
            //return 0;
            System.out.println(1);
        }
   }
}