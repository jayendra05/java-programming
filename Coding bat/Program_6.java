import java.util.Scanner;
public class Program_6 {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.print("enter a word : ");
        String a=s1.nextLine();
        String b=a.substring(0,2);
        System.out.println(b+a+b);

    }
}
