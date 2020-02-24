//Question 1 part 1)
package exercisejava8;
import java.util.Scanner;
interface myInterface{
    boolean checkGreater(int a,int b);
}
public class Question1a{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x= scanner.nextInt();
        int y=scanner.nextInt();
        myInterface obj=(a,b)->a > b  ? true :false;
        System.out.println("First Number is greater than Second Number -"+obj.checkGreater(x,y));
    }
}
