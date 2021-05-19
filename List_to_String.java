import java.util.Arrays;
import java.util.List;
import com.google.common.base.Joiner;
public class List_to_String {
    public static void main(String[] args) {
        List<Character>str=Arrays.asList('G', 'e', 'e', 'k');
        String a=Joiner.on("").join(str);
        System.out.println(a);
    }
}
