package be.intecbrussel.Moderate;

public class PalindromeCheck {

    public boolean isPalindrome(String word) {

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
