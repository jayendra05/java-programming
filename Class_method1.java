public class Class_method1 {

    static void add(int x,int y){
        int result=x+y;
        System.out.println("the answer od static method is : "+result);
    }

    public void sub(int x, int y){
        int result=x+y;
        System.out.println("the answer of public method is : "+result);
    }

    public static void main(String[] args) {
        add(5, 4);
        Class_method1 cls=new Class_method1();
        cls.sub(2,3);
    }
    
}
