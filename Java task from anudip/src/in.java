import java.io.*; 
public class in {
    public static void main(String args[])
    {    
        try{ 

        //Creating the object    
        Studdetails s1 =new Studdetails(1,"kiran");    
        //Creating stream and writing the object    
        FileOutputStream fout=new FileOutputStream("f.txt");    
        ObjectOutputStream out=new ObjectOutputStream(fout);    
        out.writeObject(s1);    
        out.flush();    
        //closing the stream    
        out.close();    
        System.out.println("success");    
        }
        catch(Exception e){System.out.println(e);}    
    }    
   }   