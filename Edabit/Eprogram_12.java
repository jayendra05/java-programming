public class Eprogram_12 {
    static void solve(int a,int b){
        for(int i=0;i<=11;i++){
            double pow = Math.pow(a,i);
            if(pow==b){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        solve(4,1024);
    }
}
