package be.intecbrussel.Easy;

import java.util.List;
import java.util.stream.Collectors;

public class ConvertToUpperCase {

    public List<String> upperCase(List<String> list) {

        return list.stream()
                   .map(e -> e.toUpperCase())
                   .collect(Collectors.toList());

    }

}
