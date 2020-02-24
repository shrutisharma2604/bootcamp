package exercisejava8;
interface DefaultInterface{
    default void display(){
        System.out.println("default method");
    }
}
public class Question7 implements DefaultInterface{
    @Override
    public void display(){
        System.out.println("Overriding default method in functional interface");
    }
    public static void main(String[] args) {
        Question7 obj=new Question7();
        obj.display();
    }
}
