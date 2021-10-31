import java.util.Scanner;
class Quiz
{
    public static void main(String[] args) 
    {
        int i=0;
        String A,B,C,D;

        Scanner in= new Scanner(System.in);

        System.out.println(" ");
        System.out.println("\t\t\t\t\t\t\t QUIZ BASED ON MARKS "+"\n"+"\n");

     {
        System.out.println("\t\t\t1. An Arithmetic expression in Java involves which Operators or Operations?");
        System.out.print("\n");
        System.out.print("\t\t\t");
        System.out.print(A="A");
        System.out.print(". Addition, Subtraction \n");
        System.out.print("\t\t\t");
        System.out.print(B="B");
        System.out.print(". Multiplication, Division \n");
        System.out.print("\t\t\t");
        System.out.print(C="C");
        System.out.print(". Modulo Division, Increment/Decrement, Unary Minus, Unary Plus \n");
        System.out.print("\t\t\t");
        System.out.print(D="D");
        System.out.print(". All the above\n");
        System.out.print("\t\t ANSWER : " );
        String a1 = in.nextLine();
        if(a1.equals(D))
        {
            System.out.println("\t\t\t\t\t\t\tCORRECT");
            i=i+1;
        }
        else
        {
            System.out.println("\t\t\t\t\t\t\tWRONG");
        }
     }
     {
        System.out.println("\n\t\t\t2. Choose the Compound Assignment Arithmetic Operators in Java below");
        System.out.print("\n");
        System.out.print("\t\t\t");
        System.out.print(A="A");
        System.out.print(". +=, -= \n");
        System.out.print("\t\t\t");
        System.out.print(B="B");
        System.out.print(". *=, /= \n");
        System.out.print("\t\t\t");
        System.out.print(C="C");
        System.out.print(". %= \n");
        System.out.print("\t\t\t");
        System.out.print(D="D");
        System.out.print(". All the above\n");
        System.out.print("\t\t ANSWER : " );
        String a1 = in.nextLine();
        if(a1.equals(D))
        {
            System.out.println("\t\t\t\t\t\t\tCORRECT");
            i=i+1;
        }
        else
        {
            System.out.println("\t\t\t\t\t\t\tWRONG");
        }
     }
     {
        System.out.println("\n\t\t\t3. Which is the arithmetic operator in Java that gives the Remainder of Division?");
        System.out.print("\n");
        System.out.print("\t\t\t");
        System.out.print(A="A");
        System.out.print(". / \n");
        System.out.print("\t\t\t");
        System.out.print(B="B");
        System.out.print(". @ \n");
        System.out.print("\t\t\t");
        System.out.print(C="C");
        System.out.print(". % \n");
        System.out.print("\t\t\t");
        System.out.print(D="D");
        System.out.print(". & \n");
        System.out.print("\t\t ANSWER : " );
        String a1 = in.nextLine();
        if(a1.equals(C))
        {
            System.out.println("\t\t\t\t\t\t\tCORRECT");
            i=i+1;
        }
        else
        {
            System.out.println("\t\t\t\t\t\t\tWRONG");
        }
     }
     {
        System.out.println("\n\t\t\t4. What is the output of the below Java code snippet? int a = 2 - - 7; System.out.println(a);");
        System.out.print("\n");
        System.out.print("\t\t\t");
        System.out.print(A="A");
        System.out.print(". -5 \n");
        System.out.print("\t\t\t");
        System.out.print(B="B");
        System.out.print(". 10 \n");
        System.out.print("\t\t\t");
        System.out.print(C="C");
        System.out.print(". 9 \n");
        System.out.print("\t\t\t");
        System.out.print(D="D");
        System.out.print(". Compiler Error \n");
        System.out.print("\t\t ANSWER : " );
        String a1 = in.nextLine();
        if(a1.equals(C))
        {
            System.out.println("\t\t\t\t\t\t\tCORRECT");
            i=i+1;
        }
        else
        {
            System.out.println("\t\t\t\t\t\t\tWRONG");
        }
     }
     {
        System.out.println("\n\t\t\t5. What is the output of Java code snippet below? short p = 1; short k = p + 2; System.out.println(k);");
        System.out.print("\n");
        System.out.print("\t\t\t");
        System.out.print(A="A");
        System.out.print(". 1 \n");
        System.out.print("\t\t\t");
        System.out.print(B="B");
        System.out.print(". 2 \n");
        System.out.print("\t\t\t");
        System.out.print(C="C");
        System.out.print(". 3 \n");
        System.out.print("\t\t\t");
        System.out.print(D="D");
        System.out.print(". Compiler error \n");
        System.out.print("\t\t ANSWER : " );
        String a1 = in.nextLine();
        if(a1.equals(D))
        {
            System.out.println("\t\t\t\t\t\t\tCORRECT");
            i=i+1;
        }
        else
        {
            System.out.println("\t\t\t\t\t\t\tWRONG");
        }
     }
     {
        System.out.println("\n\t\t\t6. What is the output of Java code snippet? short k=1; k += 2; System.out.println(k);");
        System.out.print("\n");
        System.out.print("\t\t\t");
        System.out.print(A="A");
        System.out.print(". 1 \n");
        System.out.print("\t\t\t");
        System.out.print(B="B");
        System.out.print(". 2 \n");
        System.out.print("\t\t\t");
        System.out.print(C="C");
        System.out.print(". 3 \n");
        System.out.print("\t\t\t");
        System.out.print(D="D");
        System.out.print(". Compiler error about Type Casting \n");
        System.out.print("\t\t ANSWER : " );
        String a1 = in.nextLine();
        if(a1.equals(C))
        {
            System.out.println("\t\t\t\t\t\t\tCORRECT");
            i=i+1;
        }
        else
        {
            System.out.println("\t\t\t\t\t\t\tWRONG");
        }
     }
     {
        System.out.println("\n\t\t\t7. What is the output of the Java code snippet? int a=5, b=10, c=15; a -= 3; b *= 2; c /= 5; System.out.println(a +' '+ b +' '+ c);");
        System.out.print("\n");
        System.out.print("\t\t\t");
        System.out.print(A="A");
        System.out.print(". 2 20 3 \n");
        System.out.print("\t\t\t");
        System.out.print(B="B");
        System.out.print(". 2 20 5 \n");
        System.out.print("\t\t\t");
        System.out.print(C="C");
        System.out.print(". 2 10 5 \n");
        System.out.print("\t\t\t");
        System.out.print(D="D");
        System.out.print(". -2 20 3 \n");
        System.out.print("\t\t ANSWER : " );
        String a1 = in.nextLine();
        if(a1.equals(A))
        {
            System.out.println("\t\t\t\t\t\t\tCORRECT");
            i=i+1;
        }
        else
        {
            System.out.println("\t\t\t\t\t\t\tWRONG");
        }
     }
     {
        System.out.println("\n\t\t\t8. How do you rewrite the below Java code snippet? int p=10; p = p%3;");
        System.out.print("\n");
        System.out.print("\t\t\t");
        System.out.print(A="A");
        System.out.print(". p=%3; \n");
        System.out.print("\t\t\t");
        System.out.print(B="B");
        System.out.print(". p%=3; \n");
        System.out.print("\t\t\t");
        System.out.print(C="C");
        System.out.print(". p=3%; \n");
        System.out.print("\t\t\t");
        System.out.print(D="D");
        System.out.print(". None of the above \n");
        System.out.print("\t\t ANSWER : " );
        String a1 = in.nextLine();
        if(a1.equals(B))
        {
            System.out.println("\t\t\t\t\t\t\tCORRECT");
            i=i+1;
        }
        else
        {
            System.out.println("\t\t\t\t\t\t\tWRONG");
        }
     }
     {
        System.out.println("\n\t\t\t9. Arithmetic operators +, -, /, *  and % have which Associativity?");
        System.out.print("\n");
        System.out.print("\t\t\t");
        System.out.print(A="A");
        System.out.print(". Right to Left \n");
        System.out.print("\t\t\t");
        System.out.print(B="B");
        System.out.print(". Left to Right \n");
        System.out.print("\t\t\t");
        System.out.print(C="C");
        System.out.print(". Right to Right \n");
        System.out.print("\t\t\t");
        System.out.print(D="D");
        System.out.print(". Left to Left \n");
        System.out.print("\t\t ANSWER : " );
        String a1 = in.nextLine();
        if(a1.equals(B))
        {
            System.out.println("\t\t\t\t\t\t\tCORRECT");
            i=i+1;
        }
        else
        {
            System.out.println("\t\t\t\t\t\t\tWRONG");
        }
     }
     {
        System.out.println("\n\t\t\t10. Between Postfix and Prefix arithmetic operators in Java, which operators have more priority?");
        System.out.print("\n");
        System.out.print("\t\t\t");
        System.out.print(A="A");
        System.out.print(". Postfix operators have more priority than Prefix operators \n");
        System.out.print("\t\t\t");
        System.out.print(B="B");
        System.out.print(". Prefix operators have more priority than Postfix operators \n");
        System.out.print("\t\t\t");
        System.out.print(C="C");
        System.out.print(". Both Prefix and Postfix operators have equal priority \n");
        System.out.print("\t\t\t");
        System.out.print(D="D");
        System.out.print(". None of the above \n");
        System.out.print("\t\t ANSWER : " );
        String a1 = in.nextLine();
        if(a1.equals(A))
        {
            System.out.println("\t\t\t\t\t\t\tCORRECT");
            i=i+1;
        }
        else
        {
            System.out.println("\t\t\t\t\t\t\tWRONG");
        }
     }

     System.out.println("\n\t\t\t\t\t\tYOU HAVE COMPLETED THE QUIZ");
     System.out.println("\t\t\t\t\t\t\tYour Score : "+i);
     in.close();
    }
}
