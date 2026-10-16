package wildcardsDelimitados;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3, 4, 5);
        System.out.println(Utils.somar(intList));

        List<Double> doubleList = List.of(1.0, 2.0, 12.0);
        System.out.println(Utils.somar(doubleList));
    }
}
