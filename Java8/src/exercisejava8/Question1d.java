package exercisejava8;
import java.util.Scanner;
interface uppercaseInterface{
    String uppercaseString(String s1);
}
public class Question1d {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String string= scanner.next();
        uppercaseInterface uppercaseInterface=(s1)->s1.toUpperCase();
        System.out.println("String in Uppercase " + uppercaseInterface.uppercaseString(string));
    }
}
