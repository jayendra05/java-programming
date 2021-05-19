import java.util.Scanner;
public class Program_7 {
    public static void main(String[] args) {
        Scanner s1= new Scanner(System.in);
        System.out.print("enter the word : ");
        String a=s1.nextLine();
        boolean b=a.contains("hi");
        String c=String.valueOf(b);
        if(c.equals("true")){
            System.out.println("it contains hi");
        }
        else{
            System.out.println("it no contains hi");

        }
    }
}
