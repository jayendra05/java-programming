public class Run_Call extends Thread{
    public void run(){
        for (int i=1;i<=5;i++)
        {
            try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);} 
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Run_Call r1=new Run_Call();
        Run_Call r2=new Run_Call();

        r1.run();
        r2.run();

    }
    
}
