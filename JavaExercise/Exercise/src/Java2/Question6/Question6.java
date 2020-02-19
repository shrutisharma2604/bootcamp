import java.util.Scanner;
class Question6{
    public static void main(String[] args) {
        int [] arr=new int[4];
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        try{
            int i=arr[4];
            int res=a/b;
            System.out.println("Inside try block");
        }
        catch (ArithmeticException e){
            System.out.println("Exception caught in catch block"+e);
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("Exception caught in catch block"+ex);
        }
        finally {
            System.out.println("Finally block");
        }
    }
}