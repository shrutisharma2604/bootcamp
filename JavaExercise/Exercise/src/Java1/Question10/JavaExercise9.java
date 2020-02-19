import java.util.Scanner;
public class JavaExercise9{
   public int add(int n1,int n2){
        return n1+n2;
    }
    public double add(double n1,double n2){
        return n1+n2;
    }
    public int  multiply(int n1,int n2){
        return n1*n2;
    }
    public static void main(String[] args) {
        JavaExercise9 obj=new JavaExercise9();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter values");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int obj1=obj.add(num1,num2);
        System.out.println("addition of integer values" + obj1);
        System.out.println("multiplication of interger values" + obj.multiply(num1,num2));
        System.out.println("Enter values");
        double number1=sc.nextDouble();
        double number2=sc.nextDouble();
        double obj2=obj.add(number1,number2);
        System.out.println("addition of double values" + obj2);

    }
}