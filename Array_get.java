import java.util.ArrayList;
import java.util.Collections;
public class Array_get {
    
    public static void main(String[] args) {

        ArrayList<String> name=new ArrayList<String>();
        name.add("jayendra");
        name.add("chandan");
        name.add("yatindra");
        name.add("badal");
        name.add("jaggu");
        name.add("anand");
        // System.out.println(name.get(0));
        for(int i =0;i<name.size();i++)
        {
            System.out.println("the name are : "+name.get(i));
        }  

        name.set(3,"bhavesh");
        System.out.println("the set name is change to : "+name.get(3));

        for(int i =0;i<name.size();i++)
        {
            System.out.println("the name are : "+name.get(i));
        }  
        name.remove(5);
        for(int i =0;i<name.size();i++)
        {
            System.out.println("the name are : "+name.get(i));
        }  
        Collections.sort(name);
        System.out.println("the list is : "+name);

    }
}
