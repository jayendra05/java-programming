import java.util.Scanner;
public class User_input {

    public static void main(String[] args) {
        Scanner myobj=new Scanner(System.in);
        System.out.print("enter your name : ");
        String name=myobj.nextLine();
        System.out.print("enter your age : ");
        int age =myobj.nextInt();
        System.out.println("your name is : "+name);
        System.out.println("your age is : "+age);

    }
    
}
