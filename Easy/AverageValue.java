package be.intecbrussel.Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class AverageValue {

    public Double average(List<Integer> list) {

        return list.stream()
                   .mapToDouble(e -> e.doubleValue())
                   .average()
                   .getAsDouble();
    }

}
