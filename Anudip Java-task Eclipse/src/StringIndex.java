import java.util.Scanner;

public class StringIndex {

	public static void main(String[] args) 
	{
		
		String str;
		char index;
		
		Scanner inp = new Scanner(System.in);
		System.out.print("enter a String : ");
		str = inp.nextLine();
		
		Scanner inp1 = new Scanner(System.in);
		System.out.print("enter the index you want to find in a string : ");
		int ind = inp1.nextInt();
		
		System.out.println("the string you entered is"+str);
		index = str.charAt(ind);
		System.out.println("The char at the index is"+index);

		inp.close();
		inp1.close();
	}

}
