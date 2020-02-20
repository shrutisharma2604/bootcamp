//Question1
import java.util.Scanner;
class VolatileEx extends Thread{
    private volatile int x=10;
    public void run(){
        while(x==10) {
            System.out.println(x);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void Change(){
        x=20;
    }
}
public class Question1{
    public static void main(String[] args) {
        VolatileEx obj=new VolatileEx();
        obj.start();
        new Scanner(System.in).nextLine();
        obj.Change();
    }
}