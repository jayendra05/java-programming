public class Final {

    final int x = 10;
    final double PI = 3.14;


    public static void main(String[] args) {
        Final fin = new Final();
        // fin.x=4                                   //it will print error because x can't be change because
        // fin.PI=8                                 // of the final keyword.
        System.out.println(fin.x); 
    }
}
