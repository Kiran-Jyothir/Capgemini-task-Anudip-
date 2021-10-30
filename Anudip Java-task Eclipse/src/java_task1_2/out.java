package java_task1_2;
import java.io.*;

public class out {

	public static void main(String[] args) 
	{

		  try{  
		        //Creating stream to read the object  
		        ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));  
		        studdetails s=(studdetails)in.readObject();  
		        //printing the data of the serialized object  
		        System.out.println(s.i+" "+s.string);  
		        //closing the stream  
		        in.close();  
		        }catch(Exception e){System.out.println(e);}  
		       
	}  

}
