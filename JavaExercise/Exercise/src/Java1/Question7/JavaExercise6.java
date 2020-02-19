public class JavaExercise6{
        static String FName;
        static String LName;
        static int Age;
        static int n=5;
        static String s="Java";
        static{
            System.out.println("Static block 1");
            FName="Shruti";
            LName="Sharma";
            Age=20;
        }
        static{
            System.out.println("Static block 2");
            FName="Richa";
            LName="Sharma";
            Age=25;
        }
        static void show(){
            System.out.println(n);
            System.out.println(s);
        }
        public static void main(String[] args){
            show();
        }
}