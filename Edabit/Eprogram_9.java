public class Eprogram_9 {
    public static void main(String[] args) {
        String a="This is a test";
        int b=0;
        for(int i=0;i<a.length()-1;i++){
            if(a.charAt(i)==' ' && a.charAt(i+1)!=' '){
                b++;
            }
        }
        System.out.println(b+1);
    }
    
}
