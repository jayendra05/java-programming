import java.util.Scanner;
public class Program_4 {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.print("enter the key : ");
        String a=s1.nextLine();
        String b=a.substring(0,3);
        System.out.println(b+b+b);
    }
}
