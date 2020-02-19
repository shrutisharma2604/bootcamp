//Question 2
import java.util.Scanner;
import java.util.Arrays;
public class Stringsort{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] a=str.toCharArray();
        Arrays.sort(a);
        String res = new String(a);
        System.out.println(res);
    }
}