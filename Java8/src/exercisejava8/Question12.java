package exercisejava8;

import java.util.Arrays;
import java.util.List;

public class Question12 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 8);
        System.out.println(
                list
                        .stream()
                        .filter(e -> e>3)
                        .filter(e->e%2==0)
                        .findFirst()
        );
    }
}
