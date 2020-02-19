public class JavaExercise5{
    public static void main(String[] args) {
        int[] arr={5,3,4,5,2,3,4};
        int res=arr[0];
        for(int i=1;i<arr.length;i++) {
            res = res^arr[i];
        }
        System.out.println("Single repeated element is :"+res);
    }
}