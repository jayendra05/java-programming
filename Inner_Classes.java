class Outerclass{
    int x=4;
    class Innerclass{
        int y=6;
    }
}

public class Inner_Classes {
    
    public static void main(String[] args) {
        Outerclass myOuter = new Outerclass();
        Outerclass.Innerclass myInner= myOuter.new Innerclass();
        System.out.println(myInner.y+myOuter.x);
    }
}
