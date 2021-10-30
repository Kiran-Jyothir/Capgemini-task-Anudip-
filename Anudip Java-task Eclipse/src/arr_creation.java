import java.util.Scanner;

public class arr_creation 
{

	public static void main(String[] args) 
	{
		int no;		// variable creation
		System.out.print("Enter the no of elements you want to store (max element 10) :");	// o/p
		Scanner n = new Scanner(System.in);	//input creation
		no = n.nextInt();		//input
			
		int[] arr= new int[10];		//array creation
		System.out.println("enter the elements :");		// o/p
		for(int i=0;i<no;i++)				//loop
			{
				arr[i] = n.nextInt();		//input elements
			}
		System.out.println("elements in array are :\t");		// o/p
		for(int i=0;i<no;i++)				//loop
			{
				System.out.println(arr[i]);		// o/p array elements
			}
		n.close();
	}
}