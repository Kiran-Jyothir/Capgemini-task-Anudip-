package java_task1_2;
import java.lang.reflect.Constructor;
import java.io.*;

public class ObjectCreation implements Serializable,Cloneable
{

    String name="This is created using ";

    public static void main(String[] args) throws Exception 
    {

    
        // 1. Using new keyword
        ObjectCreation obj1 = new ObjectCreation();
        System.out.println(obj1.name +"new keyword");


        // 2. Using Class class's newInstance() method
        ObjectCreation obj2 = ObjectCreation.class.newInstance();
        System.out.println(obj2.name +"newInstance()");


        // 3. Using Constructor class's newInstance() method
        Constructor<ObjectCreation> constructor = ObjectCreation.class.getConstructor();
        ObjectCreation obj3 = constructor.newInstance();
        System.out.println(obj3.name +"newInstance() of constructor class");


        // 4. Using clone() method
        ObjectCreation obj4 = (ObjectCreation) obj3.clone();
        System.out.println(obj4.name + "Clone()");

    }
}
