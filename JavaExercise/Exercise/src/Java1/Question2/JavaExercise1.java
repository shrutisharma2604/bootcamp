public class JavaExercise1{
    public static void main(String[] args) {
        String str3="Hello Kiet Hello kietians";
        int count;
        str3=str3.toLowerCase();
        String words[]=str3.split(" ");
        for(int i = 0; i < words.length; i++) {
            count = 1;
            for(int j = i+1; j < words.length; j++) {
                if(words[i].equals(words[j])) {
                    count++;
                    words[j] = "0";
                }
            }
            if(count > 1 && words[i] != "0"){
                System.out.println(words[i]);
            }
        }
    }
}