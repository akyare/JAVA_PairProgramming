package be.intecbrussel.Moderate;

public class CeasarCipher {

    public String decode(String code) {

        String message = "";
        for (Character car: code.toCharArray()) {

            if( (car +5) > 122) {
                message += (char) ((122-car)+97);
            } else {
                message += (char) (car + 5);

            }

        }

        return message;
    }

}
