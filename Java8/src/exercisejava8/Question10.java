package exercisejava8;

import java.util.Arrays;
import java.util.List;

public class Question10 {
    public static void main(String[] args) {
            List<Integer> list= Arrays.asList(3, 4, 5, 9, 14, 2, 7);
            System.out.println("Sum of the number greater than 5="+
            list
                        .stream()
                        .filter(e -> e > 5)
                        .mapToInt(e->e).sum()
            );
    }
}
