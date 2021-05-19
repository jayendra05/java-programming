import java.util.*;
import java.util.Arrays;
import java.util.Collections;
public class Eprogram_11 {
    public static void main(String[] args) {
        List<Integer> number=Arrays.asList(0, 4, 1, 4, -10, -50, 32, 21);
        int max=Collections.max((number));
        int min=Collections.min((number));
        int result=max-min;
        System.out.println(result);
    }
}
