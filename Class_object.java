class Add
{
    int num1;
    int num2;
    int result;

    public void perform() {
        result=num1+num2;
    }
}

public class Class_object {
    public static void main(String[] args) {
        Add add=new Add();
        add.num1=5; 
        add.num2=4;
        add.perform();
        System.out.print("the result is: "+add.result);
        
    }
    
}
