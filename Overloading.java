public class Overloading {

    static void function_1(int x,int y){
        int result=x+y;
        System.out.println("result of function 1:"+result);
    }
    static void function_2(double x, double y){
        double result=x+y;
        System.out.println("result of function 2:"+result);
    }
    public static void main(String[] args) {
        function_1(4,3);
        function_2(2.5,3.1);
    }

}