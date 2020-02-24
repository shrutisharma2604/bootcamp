package exercisejava8;

import java.util.Scanner;

interface InterfaceEx{
    int show(int a,int b);
}
public class Question2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x= scanner.nextInt();
        int y=scanner.nextInt();
        InterfaceEx interfaceEx=(a,b)->a+b;
        System.out.println(interfaceEx.show(x,y));

    }
}
