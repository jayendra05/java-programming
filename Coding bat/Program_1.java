import java.util.Scanner;

public class Program_1 {
    
    public static void main(String[] args) {
        Scanner s1= new Scanner(System.in);
        System.out.print("if it weekday enter t and if not enter f : ");
        String week= s1.nextLine();
        week=week.toLowerCase();
        // System.out.println(week);
        System.out.print("if it vacation enter t and if not enter f : ");
        String vac=s1.nextLine();
        vac=vac.toLowerCase();
        if(week.equals("t") && vac.equals("f")){
            System.out.println("no Holiday");
        }
        else if(week.equals("f") && vac.equals("f")){
            System.out.println("Holiday");
        }
        else if(week.equals("t") && vac.equals("t")){
            System.out.println("Holiday");
        }
        else if(week.equals("f") && vac.equals("t")){
            System.out.println("Holiday");
        }
        else{
            System.out.println("invalid key");
        }

    }
}
