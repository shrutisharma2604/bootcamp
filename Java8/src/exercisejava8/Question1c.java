package exercisejava8;
import java.util.Scanner;
interface concatInterface{
    String concatString(String s1,String s2);
}
public class Question1c {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String string= scanner.next();
        String string1=scanner.next();
        concatInterface concatInterface=(s1,s2)->s1+" "+s2;
        System.out.println("Concatenation of two string is :" +concatInterface.concatString(string,string1));
    }
}
