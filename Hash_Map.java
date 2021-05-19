import java.util.HashMap;

public class Hash_Map {
    
    public static void main(String[] args) {

        HashMap<String,String> nr=new HashMap<String,String>();
        nr.put("jayendra","mishra");
        nr.put("atul","tiwari");
        nr.put("badal","singh");
        nr.put("punu","kunu");
        System.out.println(nr);
        System.out.println(nr.get("jayendra"));
        nr.remove("punu");
        System.out.println(nr);
        int a=nr.size();
        System.out.println("the size is : "+a);

        for (String i : nr.keySet()){
            System.out.println("key : "+i);
        }

        for(String i : nr.values()){
            System.out.println("value : "+i);
        }


    }
}
