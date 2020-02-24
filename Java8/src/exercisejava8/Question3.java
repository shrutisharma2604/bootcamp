package exercisejava8;

import java.util.Scanner;

interface instanceInterface{
    int operation(int n1,int n2);
}
public class Question3 {
    int add(int a,int b){
      return a+b;
    }
    int subtract(int a,int b){
        return a-b;
    }
    static int multiply(int  a,int b){
        return a*b;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        instanceInterface instanceInterface=new Question3()::add;
        System.out.println("Addition of two number is :" +instanceInterface.operation(x,y));
        instanceInterface instanceInterface1=new Question3()::subtract;
        System.out.println("Subtraction of two number is :" +instanceInterface1.operation(x,y));
        instanceInterface instanceInterface2=Question3::multiply;
        System.out.println("Multiplication of two number is :" +instanceInterface2.operation(x,y));
        };
}


