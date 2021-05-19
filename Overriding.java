class A{
    public void show(){
        System.out.println("class A");
    }
}

class B extends A{
    public void show(){
        // super.show();                  //it will print class A message due to class A is super class of
        //                                //class B we have to write super
        System.out.println("class B");
    }

}

public class Overriding {

    public static void main(String[] args) {
        B b1 = new B();
        b1.show();           //it will print class B show method because of method overriding
    }
}
