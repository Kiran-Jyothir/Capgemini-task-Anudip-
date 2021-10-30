import java.util.*;
public class MutltiplicationTable 
{
	 public static void main(String[] args) 
	    {
	        int i;
	        Scanner inp= new Scanner(System.in);

	        System.out.print("Enter the number to find multiples:");
	        int a= inp.nextInt();
	        inp.close();
	        for(i=0;i<=10;i++)
	        {
	            System.out.println(a+"X"+i+" "+"="+" "+a*i);
	        }
	        
	    }
}
