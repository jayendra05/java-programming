class Cal{                                                //super,parent
    public int add(int i,int j){
        return i+j;
    }
}

class CalAdv extends Cal{                                //base,child
    public int sub(int a,int b){
        return a-b;
    }
}

class CalVeryAdv extends CalAdv{
    public int mul(int x ,int y){
        return x*y;
    }
}



public class Inheritance { 
    public static void main(String[] args) {
        CalVeryAdv c1=new CalVeryAdv();
        int result1=c1.add(4, 5);
        int result2=c1.sub(5,3);
        int result3=c1.mul(3,4);

        System.out.println("the answer of add is : "+result1);
        System.out.println("the answer of sub is : "+result2);
        System.out.println("the answer of mul is : "+result3);


    }
}
