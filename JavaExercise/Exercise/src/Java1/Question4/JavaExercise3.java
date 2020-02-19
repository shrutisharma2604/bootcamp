public class JavaExercise3{
    public static void main(String[] args) {

        String strng="I am in class 12th_";
        char [] charArray=strng.toCharArray();
        int lowercase=0;
        int uppercase=0;
        int specialchar=0;
        int digit=0;
        int total=strng.length();
        for(int i=0;i<strng.length();i++){
            if(Character.isUpperCase(charArray[i])){
                uppercase++;
            } else if(Character.isLowerCase(charArray[i])){
                lowercase++;
            } else if(Character.isDigit(charArray[i])){
                digit++;

            }
            else{
                specialchar++;
            }
        }
        System.out.println("Total length of the string :"+total);
        System.out.println("UpperCase :"+uppercase);
        System.out.println("Percentage of UpperCase :"+(uppercase*100)/total);
        System.out.println("LowerCase :"+lowercase);
        System.out.println("Percentage of LowerCase :"+(lowercase*100)/total);
        System.out.println("Digit :"+digit);
        System.out.println("Percentage of Digit :"+(digit*100)/total);
        System.out.println("Special character :"+specialchar);
        System.out.println("Percentage of Special character :"+(specialchar*100)/total);


    }
}
