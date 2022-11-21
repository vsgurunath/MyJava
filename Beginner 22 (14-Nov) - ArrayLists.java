import java.util.*;
import java.lang.*;


public class Main {
    //Q2. Row-wise sum using 2D ArrayList
    //note the use of return datatype and input datatype 
    static ArrayList<Integer> rowsum (ArrayList<ArrayList<Integer>> mat){
        ArrayList<Integer> ans = new ArrayList<>();//declare the output 1D ArrayList
        int n = mat.size();//how many 1D ArrayList are there
        int m = mat.get(0).size();//how many elements are present in each 1D ArrayList 
        
        //loop to sum the rows (each 1D ArrayList)
        for(int i = 0; i < n; i++){
            int rowsum_val = 0;//declare the variable for the row-wise sum
            //loop through the elements of the 1D ArrayList
            for(int j = 0; j < m; j++){
                rowsum_val += mat.get(i).get(j);//element within list of ArrayList
            }
            ans.add(rowsum_val);//append the row sum to the output ArrayList
        }
        return ans;//return the output ArrayList
    }
    
    //Q1. divisible by 5 & 7
    static ArrayList <Integer> solve (ArrayList <Integer> list){
        ArrayList <Integer> ans = new ArrayList <>();//declare the ArrayList without having to mention the size
        //loop to traverse through the input ArrayList
        for(int i = 0; i < list.size(); i++){
            int val = list.get(i);//fetch the element value using index: so, the loop must be from 0 to size()
            if(val % 5 == 0 && val % 7 == 0){
                ans.add(val);//append to the output ArrayList
            }
        }
        return ans;//return the ArrayList
    }
    
    
    
    
    public static void main(String [] args){
        
        Scanner scn = new Scanner(System.in);
        //ArrayList: nothing but an array that gives the advantage of size modifications
        //you can add or remove elements in ArrayList
        //You don't need to know the size of the array before creating ArrayList
        //ArrayList <Integer> list = new ArrayList <>[];
        /*
        Data type   -   ArrayList type
        int         -   Integer
        float       -   Float
        double      -   Double
        */
        /*
        //We can work on ArrayList using its functions:
        //1. add: list.add(val); //--> appends by default
        //1a. add at particular index: list.add(index,val); --> inserts at a particular index. and the rest of the elements are right shifted
        //2. size(): list.size();
        //3. get(index): list.get(2);
        //4. set(index,value): list.set(1,50);--> can be used on an element that's already present (can't be used for inserting)
        //5. remove(index): list.remove(1);
        //ArrayList <Integer> list = new ArrayList <> [];//[] as well as () are working
        ArrayList <Integer> list = new ArrayList <> ();//[] as well as () are working
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list.size());//find the size of ArrayList
        System.out.println(list.get(2));//fetch element at index 2
        list.set(1,50);
        System.out.println(list.get(1));//get the modified element value
        list.remove(1);
        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        list.add(1,20);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        */
        
        /*
        //Q1. Given an ArrayList containing some integer values, find all the numbers divisible
        //by 5 & 7 and return them.
        
        int n = scn.nextInt();//user input: get the size 
        ArrayList <Integer> list = new ArrayList<>();//note that you are not mentioning the size
        
        //note that you're not looping from i=0 because we're not accessing the elements of ArrayList using index. We're simply appending. 
        //you're not using index
        for(int i = 1; i <= n; i++){
            int val = scn.nextInt();//user input
            list.add(val);//appends (you're not required to use index for this)
        }
        
        //note that you're able to print the ArrayList without having to loop through the elements individually
        System.out.println(list);
        //you can also pring individual elements using loop and indexes
        
        System.out.println("----------");
        
        ArrayList <Integer> ans = solve(list);//call the function
        
        System.out.println(ans);//pring the ArrayList
        */
        
        /*
        //2D ArrayList
        //2D Array: Array of array
        //2D ArrayList: ArrayList of ArrayList
        
        ArrayList < ArrayList <Integer>> list = new ArrayList <>();//2D ArrayList
        
        ArrayList <Integer> l1 = new ArrayList<>();//1D ArrayList
        l1.add(10);//append 10 to the ArrayList l1
        l1.add(20);//append 20 to the ArrayList l1
        
        ArrayList <Integer> l2 = new ArrayList<>();//1D ArrayList
        l2.add(10);//append 10 to the ArrayList l2
        l2.add(20);//append 20 to the ArrayList l2
        l2.add(30);//append 30 to the ArrayList l2
        
        list.add(l1);//append the 1D ArrayList l1 to 2D ArrayList
        list.add(l2);//append the 1D ArrayList l2 to 2D ArrayList
        
        //find the sizes of the ArrayList
        System.out.println(list.size());//number of 1D ArrayList in the 2D ArrayList
        System.out.println(list.get(0).size());//length of first 1D ArrayList
        System.out.println(list.get(1).size());//length of second 1D ArrayList
        
        //how to fetch the value 30 among the ArrayList
        System.out.println(list.get(1).get(2));//note the index of the element in which ArrayList
        */
        
        //Q2. Row-wise sum using 2D ArrayList
        ArrayList <ArrayList <Integer>> mat = new ArrayList<>();//right hand side is always 'new ArrayList<>();'
        
        int n = scn.nextInt();//user input: number of ArrayLists
        int m = scn.nextInt();//user input: number of elements in each ArrayList
        
        //loop to get the elements into ArrayList
        for(int i = 0; i < n; i++){
            ArrayList <Integer> row = new ArrayList<>();//declare new 1D ArrayList with the name 'row'
            //get the elements into 1D ArrayList
            for(int j = 0; j < m; j++){
                int val = scn.nextInt();//user input: integer element to be saved into the 1D ArrayList
                row.add(val);//add the element to the 1D ArrayList
            }
            mat.add(row);//add the 1D ArrayList 'row' to the 2D ArrayList
        }
        System.out.println(mat);//print the 2D ArrayList
        
        System.out.println("-------------------------------");
        
        ArrayList <Integer> ans = rowsum(mat);//call the function
        
        System.out.println(ans);//print the 2D ArrayList
        
    }
}