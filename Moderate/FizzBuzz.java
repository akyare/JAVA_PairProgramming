package be.intecbrussel.Moderate;

public class FizzBuzz {

    public static void main(String[] args) {

    }

    public String fizzBuzz(Integer i) {

        String text = "";

        if (i % 5 == 0 && i % 3 == 0) {
            text += "FizzBuzz";
        } else if (i % 3 == 0) {
            text += "Fizz";
        } else if (i % 5 == 0) {
            text += "Buzz";
        } else {
            text += i;
        }
        return text;
    }


}

