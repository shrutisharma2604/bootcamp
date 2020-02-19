public class JavaExercise4{
    public static void main(String[] args) {
        int[] arr1={1,1,1,5,6,8,9};
        int[] arr2={5,9,1,10,1};
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]);
                    break;
                }
            }
        }
    }
}