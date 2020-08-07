package be.intecbrussel.Easy;

public class Factorial {

    public Integer factorial(Integer n) {
        int total = 1;
        for (int i = n; i > 0 ; i--) {
            total *= i;
        }

        return total;
    }
}
