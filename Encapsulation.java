class Student{
    private int rollno;
    private String name;

    public void setrollno(int r){
        this.rollno=r;
    }
    public int getrollno(){
        return rollno;
    }

    public void setname(String n){
        this.name=n;
    }
    public String getname(){
        return name;
    }


}


public class Encapsulation {

    public static void main(String[] args) {
        Student s1=new Student();
        s1.setrollno(5);
        s1.setname("jayendra");
        System.out.println(s1.getrollno()); 
        System.out.println(s1.getname()); 

    }
}
