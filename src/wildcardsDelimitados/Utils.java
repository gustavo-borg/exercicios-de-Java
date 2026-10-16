package wildcardsDelimitados;

import java.util.List;

public class Utils {
    public static double somar(List<? extends Number> lista) {
        double sum = 0.0;
        for (Number num: lista)
            sum += num.doubleValue();

        return sum;
    }
}
