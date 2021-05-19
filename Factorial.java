public class Factorial {

    static int function(int n){

        if(n==0)
        {
            return 1;
        }
        else{
            return (n*function(n-1));
        }
    }
    public static void main(String[] args) {
        int num=4;
        int fact=1;
        fact=function(num);
        System.out.println("result:"+fact);
        }

    
    
}