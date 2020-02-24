package exercisejava8;

import java.util.Arrays;
import java.util.List;

public class Question11 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(3, 4, 5, 9, 14, 2, 7);
        System.out.println("Average of the number="+
                list
                        .stream()
                        .mapToDouble(e->e).average()
        );
    }
}
