package exercisejava8;
import java.util.Scanner;
interface myInterface1{
    int IncrementNumber(int x);
}
public class Question1b {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        myInterface1 myInterface1=(x)-> ++x;
        System.out.println("Value incremented by one "+ myInterface1.IncrementNumber(a));
    }
}
