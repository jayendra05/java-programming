import java.util.ArrayList;
import java.util.List;

public class List_Copy_Con {
    
    public static void main(String[] args) {
        List<String> name=new ArrayList<String>();
        name.add("jayendra");
        name.add("chandan");
        name.add("atul");
        System.out.println(name);
        List<String> student=new ArrayList<>(name);
        System.out.println(student);

    }
}
