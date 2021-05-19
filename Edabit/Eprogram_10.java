public class Eprogram_10 {
    static void end(String a ,String b){
        int a1=a.length();
        int b1=b.length();
        int c=a1-b1;
        String result=a.substring(c,a1);
        System.out.println(result);
        if(result.equals(b)==true){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
    public static void main(String[] args) {
        end("convention","tio");
    }
}
