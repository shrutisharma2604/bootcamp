public class JavaExercise7{
    public static void main(String[] args) {
        StringBuffer sbf=new StringBuffer("BootcampSession");
        StringBuffer str=sbf.reverse();
        System.out.println(str);
        StringBuffer str1=str.delete(4,10);
        System.out.println(str1);
    }
}