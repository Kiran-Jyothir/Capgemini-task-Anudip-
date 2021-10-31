import java.util.Scanner;
class Operators
{
    float a,b;
    public static void main(String[] args) 
    {
        float c;
        Scanner in= new Scanner(System.in);
        System.out.println("enter the value of a:");    
        float a= in.nextFloat();

        System.out.println("enter the value of b:");    
        float b= in.nextFloat();

        c=a+b;
        System.out.println("a+b = "+c);
        c=a-b;
        System.out.println("a-b = "+c);
        c=a*b;
        System.out.println("a*b = "+c);
        c=a/b;
        System.out.println("a/b = "+c);
        c=a%b;
        System.out.println("a%b = "+c);
        if(a==b){
            System.out.println("a==b = ");
            System.out.print("true");
        }
        else{
            System.out.print("false");
        }
        in.close();
    }
}