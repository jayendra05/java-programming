public class Constructor_1 {

    String name;
    int age;
    
    public Constructor_1(String x,int y){
        name=x;
        age=y;
    }
    public static void main(String[] args) {

        Constructor_1 con=new Constructor_1("jayendra",21);
        System.out.println("name:"+con.name);
        System.out.println("age:"+con.age);


    }
}