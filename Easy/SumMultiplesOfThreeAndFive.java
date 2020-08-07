package be.intecbrussel.Easy;

public class SumMultiplesOfThreeAndFive {
    public Integer sum(Integer n) {

        int total =0;
        for (int i = 0; i <= n; i++) {
            if(i%3 == 0 || i%5 ==0) {
                total += i;
            }
        }
        return total;
    }
}
