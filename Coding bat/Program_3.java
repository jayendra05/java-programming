import java.util.Scanner;
public class Program_3 {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.print("enter the number : ");
        int a=s1.nextInt();
        int result=21-a;
        if(result>=1){
            System.out.println(result);
        }
        else if(result<0){
            System.out.println(-+result);
        }
        else if(result==0){
            System.out.println("zero");
        }
        else{
            System.out.println("invalid");
        }
        

    }    
}
