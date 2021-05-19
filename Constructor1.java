public class Constructor1 {
    int x;
    int y;
    int result;
    public Constructor1(){
        x=5;
        y=4;
        result=x+y;
        // System.out.println("the answer of constructor() is : "+result);
    }

    public static void main(String[] args) {
        
        Constructor1 cons=new Constructor1();
        System.out.println("the answer of constructor() is : "+cons.result);

    }
    
}
