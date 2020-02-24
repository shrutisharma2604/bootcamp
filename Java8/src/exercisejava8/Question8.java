package exercisejava8;
interface defaultEx{
    default void display(){
        System.out.println("Default Method 1");
    }

}
interface DefaultEx{
    default void display1(){
        System.out.println("Default Method 2");
    }

}
public class Question8 implements defaultEx,DefaultEx {
    public static void main(String[] args) {
        Question8 obj=new Question8();
        obj.display();
        obj.display1();

    }
}
