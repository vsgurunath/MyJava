import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        /*
        int i = 1;
        while (i <= 10){
            System.out.println(i);
            i++;
        }

        int N = scn.nextInt();
        int sum = 0;
        int i = 0;
        while (i <= N){
            sum += i;
            //System.out.println(i);
            i += 2;
            //i++;
        }
        System.out.println(sum);

        int A = scn.nextInt();
        int B = scn.nextInt();
        int pow = 1;
        int i = 1;
        while (i <= B){
            pow *= A;
            i++;
        }
        System.out.println(pow);

        int N = scn.nextInt();
        int i = 4;
        
        while(i <= N){
            System.out.println(i);
            i += 4;
        }

        int N = scn.nextInt();
        int i = 1;
        while(i*i <= N){
            System.out.println(i*i + " ");
            i++;
        }        

        int T = scn.nextInt();
        
        while(T > 0){
            int N = scn.nextInt();
            int digitcount = 0;
            if (N ==0){
                digitcount = 1;
            }
            while(N > 0){
                digitcount++;
                N = N/10;
            }
            System.out.println(digitcount);
            T--;
        }

        
        int N = scn.nextInt();
        int sumodd = 0;
        int sumeven = 0;
        
        while(N > 0){
            int digit = N % 10;
            if(digit % 2 == 0){
                sumeven += digit;
            }
            else{
                sumodd += digit;
            }
            N = N/10;
        } 
        System.out.println(sumodd);
        System.out.println(sumeven);


        int T = scn.nextInt();
        
        while(T-- > 0){
            int N = scn.nextInt();
            int sum = 0;
            while(N > 0){
                int d = N % 10;
                sum += d;
                N = N/10;
            }
            System.out.println(sum);
        }

        
        int N = scn.nextInt();
        int sumodd = 0;
        int sumeven = 0;
        int digitcount = 0;
        
        while(N > 0){
            int digit = N % 10;
            digitcount++;
            if(digitcount % 2 == 0){
                sumeven += digit;
            }
            else{
                sumodd += digit;
            }
            N = N/10;
        }
        System.out.println(sumodd);
        System.out.println(sumeven);
        */
        
        int N = scn.nextInt();
        int []arr = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = scn.nextInt();
        }

        int min = arr[0];
        int max = arr[0];
                        
        for(int i = 0; i < N; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("min:" + min + " max: "+ max);
    }
}