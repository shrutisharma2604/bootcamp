//Question 3
public class Exceptionex{
    public static void main(String[] args) {
        try {
            Class.forName("test");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
