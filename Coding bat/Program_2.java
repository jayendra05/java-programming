import java.util.Scanner;

public class Program_2 {

    public static void main(String[] args) {
        Scanner s1= new Scanner(System.in);
        System.out.println("enter t or f for a : ");
        String a=s1.nextLine();
        System.out.println("enter t or f for b : ");
        String b=s1.nextLine();
        a=a.toLowerCase();
        b=b.toLowerCase();
        if(a.equals("t") && b.equals("t"))
        {
            System.out.println("true");
        }
        else if(a.equals("f") && b.equals("f")){
            System.out.println("true");
        }
        else if(a.equals("t") && b.equals("f")){
            System.out.println("false");
        }
        else if(a.equals("f") && b.equals("t")){
            System.out.println("false");
        }
        else{
            System.out.println("invalid....");
        }
    }
}
