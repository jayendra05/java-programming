class Cala{

    public void add(){
        int a=2;
        int b=3;
        int result=a+b;
        System.out.println("no parameter : "+result);
    }

    public void add(int a ,int b){
        System.out.println("with int parameter : "+(a+b));
    }

    public void add(int a ,int b,int c){
        System.out.println("with three int parameter : "+(a+b+c));
    }

    public void add(Double a ,Double b){
        System.out.println("with double parameter : "+(a+b));
    }

}

public class Overloading1 {
   public static void main(String[] args) {
    Cala c1=new Cala();
    c1.add();
    c1.add(2,3);
    c1.add(1,2,3);
    c1.add(1.1,2.2);
   }

}
