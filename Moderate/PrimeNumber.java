package be.intecbrussel.Moderate;

public class PrimeNumber {

    public boolean isPrime(Integer n){

        boolean prime = true;

        for (int i = n; i > 0 ; i--){
        if (n % i == 0 ){
            prime = false;
            break;
        }
        }
        return prime;
    }
}
