import java.util.Scanner;
import java.lang.String;
public class JavaExercise10{
    public float multiply(float n1,float n2){
        return n1*n2;
    }
    public static String concat(String s1,String s2){
        return s1+s2;
    }
    public static String concat(String s1,String s2,String s3){
        return s1+s2+s3;
    }
    public static void main(String[] args) {
        float n1=4.5f;
        float n2=4.5f;
        JavaExercise10 obj=new JavaExercise10();
        System.out.println("multiplication of floating point numbers: "+ obj.multiply(n1,n2));
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First String");
        String str=sc.nextLine();
        System.out.println("Enter Second String");
        String str1=sc.nextLine();
        System.out.println("Enter third String");
        String str2=sc.nextLine();
        System.out.println("concatenation of two string is: "+ obj.concat(str+ " ",str1));
        System.out.println("concatenation of three string is: "+ obj.concat(str+ " ",str1+" ",str2));

    }
}