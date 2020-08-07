package be.intecbrussel.Moderate;

public class LinearSearch {

    public int search(Integer n, Integer[] list) {

        int number = 0;

        for (int i = 0; i < list.length; i++) {
            if (n.equals(list[i])) {
                number = i;
                break;
            }
            return number;
        }
        return number;
    }
}
