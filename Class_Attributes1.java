public class Class_Attributes1 {
    int x=4;

    public static void main(String[] args) {
        Class_Attributes1 cls =new Class_Attributes1();
        Class_Attributes1 cls1 =new Class_Attributes1();

        System.out.println("The value of x is : "+cls.x+" for cls.x");
        System.out.println("The value of x is : "+cls1.x+" for cls1.x"); 
        cls1.x=9;
        System.out.println("The value of x is : "+cls.x+" for cls.x");
        System.out.println("The value of x is : "+cls1.x+" for cls1.x");
        cls1.x=7;
        System.out.println("The value of x is : "+cls.x+" for cls.x");
        System.out.println("The value of x is : "+cls1.x+" for cls1.x");


    }
    
}
    