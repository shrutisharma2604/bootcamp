package exercisejava8;
interface defaultInterface{
   default void display(String s){
       System.out.println("Default Method in Interface");
   }

}
interface staticInterface{
    static void display(String s1){
        System.out.println("Static Method in Interface");
    }

}
public class Question6 implements defaultInterface,staticInterface {
    public static void main(String[] args) {
        Question6 obj=new Question6();
        obj.display("Hello");
        staticInterface.display("Hello");

    }
}
