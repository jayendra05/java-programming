import java.io.FileWriter;
import java.io.IOException;
public class File_Write {
    
    public static void main(String[] args) {
        try{
            FileWriter file1=new FileWriter("F:\\Jayendra\\Java\\abc.txt");
            file1.write("hi my name is jayendrs");
            file1.close();
            System.out.println("done!!!!!");
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
        }
        
    }
}
