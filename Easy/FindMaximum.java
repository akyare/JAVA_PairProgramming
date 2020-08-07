package be.intecbrussel.Easy;

public class FindMaximum {

    public Integer maximum(Integer[] list) {

        int max = list[0];

        for (int i = 1; i < list.length; i++) {
            if(max < list[i]) {
                max = list[i];
            }
        }
        return max;

    }

}
