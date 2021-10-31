import java.util.*;
public class arrlist {
public static void main(String[] args) {
ArrayList<String> color_list = new ArrayList<String>(5);
color_list.add("Red");
color_list.add("Blue");
color_list.add("Green");
color_list.add("Yellow");
color_list.add("Orange");
System.out.println("Size of list: " + color_list.size());
Object[] obj = color_list.toArray();
System.out.println("elements of Arraylist");
for (Object value : obj) {
System.out.println("Color = " + value);
}
}
}

