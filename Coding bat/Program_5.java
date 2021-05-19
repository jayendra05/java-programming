import java.util.Scanner;
public class Program_5 {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.print("enter the word : ");
        String a=s1.nextLine();
        int b=a.length();
        int c=b-1;
        String d=a.substring(c);
        System.out.println("the new word is : "+d);
        System.out.println(d+a+d);
    }
}
