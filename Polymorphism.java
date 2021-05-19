class Pol{
    public int add(){
        int a=2;
        int b=3;
        int result=a*b;
        return result;
    }
    public int add(int a,int b){
        return a*b;
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Pol p1=new Pol();
        System.out.println("with out parameter "+p1.add());
        System.out.println("with parameter "+p1.add(2,3));

    }
    
}
