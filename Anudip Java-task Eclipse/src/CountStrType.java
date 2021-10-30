import java.util.Scanner;
public class CountStrType 
{

	public static void count(String x)		// method
	{
		char[] ch = x.toCharArray();		//store string char to array into a variable
		int letter = 0;							// variable declaration
		int space = 0;							// variable declaration
		int num = 0;							// variable declaration
		int other = 0;							// variable declaration
		for(int i = 0; i < x.length(); i++)		//loop total char length
		{
			if(Character.isLetter(ch[i]))			//condition if array contains is char
				{
					letter ++ ;							//increment letter count
				}
			else if(Character.isDigit(ch[i]))		//condition if array contains is digit
				{
					num ++ ;							//increment digit count
				}
			else if(Character.isSpaceChar(ch[i]))	//condition if array contains is space
				{
					space ++ ;							//increment space count
				}
			else									//none of the above condition
				{
					other ++;							//increment space count
				}
		}
		
			System.out.println("\nthe string you have entered contains"); 	// o/p
			System.out.println("letter: " + letter);						// o/p
			System.out.println("space: " + space);							// o/p
			System.out.println("number: " + num);							// o/p
			System.out.println("other: " + other);							// o/p
	}
	     
	public static void main(String[] args) 
		{
		   System.out.print("enter the string :");		// o/p
		   Scanner str = new Scanner(System.in);
			String test = str.nextLine();		//system input
			count(test);	//method call
			str.close();
		}
		

}
