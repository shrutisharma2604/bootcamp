class Singleton{
        private static Singleton instance = null;
        public  String s;
        private void Singleton()
        {
            System.out.println("This is the singleton class");
        }
        public static Singleton getInstance()
        {
            if (instance == null)
                instance = new Singleton();

            return instance;
        }
}
public class SingletonEx {
    public static void main(String[] args) {
        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();
        Singleton z = Singleton.getInstance();
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}