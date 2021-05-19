public class Constructor {
    int x;

    public Constructor(){
        x=5;
    }
    public static void main(String[] args) {
       Constructor con=new Constructor();
       System.out.println(con.x);
    }
}