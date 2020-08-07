package be.intecbrussel.Easy;

public class ReverseString {

    public String reverse(String s) {
        StringBuilder reverseText = new StringBuilder();
        for (int i = s.length()-1; i >= 0; i--) {
            reverseText.append(s.charAt(i));
        }

        return reverseText.toString();
    }

}
