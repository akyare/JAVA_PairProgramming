package be.intecbrussel.Moderate;

public class FindMaximum {

    public Integer maximum (Integer[] list){

        int max = 0;

        for (int i = 0; i<list.length; i++) {
            if (list[i] > list[i + 1]) {
                max = list[i];
                list[i] = list[i + 1];
                list[i + 1] = max;
            }
        }
        return max;
    }

}
