package boundedTypes;

import java.util.List;

public class Utils {
    public static <Type extends Comparable<Type>> Type maxElement(List<Type> list){
        if (list.isEmpty()) {
            throw new IllegalStateException("A lista não pode estar vazia!");
        }

        Type bigger = list.getFirst();
        for (Type item: list) {
            if (item.compareTo(bigger) > 0) {
                bigger = item;
            }
        }
        return bigger;
    }
}
