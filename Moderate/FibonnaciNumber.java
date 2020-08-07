package be.intecbrussel.Moderate;

public class FibonnaciNumber {

    public Integer fibonacci(Integer n) {

        if (n == 1) {
            return 1;
        } else if (n == 0) {
            return 0;
        } else if (n > 1) {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
        return 0;
        }
    }
