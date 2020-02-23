//Question2
public class Question2 extends Thread{
    public void run(){
       for(int i=0;i<5;i++) {
           System.out.println("Hello");
       }
    }

    public static void main(String[] args) {
        Question2 obj=new Question2();
        obj.start();
        Thread th=new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("World");
                }
            }
        });
        th.start();
    }
}
