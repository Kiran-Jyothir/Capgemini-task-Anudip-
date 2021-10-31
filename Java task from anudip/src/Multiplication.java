import java.util.Scanner;

class Multiplication
{
    public static void main(String[] args) 
    {
        int i;
        Scanner in= new Scanner(System.in);

        System.out.print("Enter the number to find multiples:");
        int a= in.nextInt();
        in.close();
        for(i=0;i<=10;i++)
        {
            System.out.println(a+"X"+i+" "+"="+" "+a*i);
        }
    }
}
