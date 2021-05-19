public class Constructor_2 {

    static void function_1(){
        System.out.println("static method can be call with out creating object");
    }

    public void function_2(){
        System.out.println("Public methods must be called by creating objects");
    }

    static void function_3(){
        System.out.println("static method can be call with creating object");
    }

    public static void main(String[] args) {
        function_1();
        // function_2();
        Constructor_2 con=new Constructor_2();
        con.function_2();
        con.function_3();
    }
    
}