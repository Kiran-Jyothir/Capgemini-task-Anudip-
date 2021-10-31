import java.io.*;
import java.util.*;


public class Solution {
    public static void main(String[] args) throws IOException {
    	
        Scanner src = new Scanner(System.in);
        
        System.out.println("enter the no of list items u want to enter : ");
        int listsize = src.nextInt();
        
        int[] arr= new int[listsize];	
        System.out.println("enter the array list elements");
        
        for(int i=0; i<listsize; i++)
        {
        	arr[i] = src.nextInt();
        }
        
        src.close();
        
        System.out.println("array elements before reverse");
        System.out.println(Arrays.toString(arr));
       
        System.out.println("After reversing a array");
        for(int i=listsize-1;i>=0;i--)
        {
        	System.out.print(arr[i] + " ");
        }
        
       
    }

}
