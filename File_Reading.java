import java.io.File; 
import java.util.Scanner; 
public class File_Reading {

    public static void main(String[] args) throws Exception{
        File file = new File("F:\\Jayendra\\Java\\abc.txt"); 
        Scanner sc = new Scanner(file); 
  
        while (sc.hasNextLine())
        {
            System.out.println(sc.nextLine());   
        } 
       
    }
    
}
