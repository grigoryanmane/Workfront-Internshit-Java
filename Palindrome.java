package am.oop;

public class Palindrome {
    public static boolean isPalindrom(String word) {
        boolean result = false;

        String symbols = "[^\\w]";  //Expression for finding all the symbols
        word = word.replaceAll(symbols, "").toLowerCase(); //Replace all the symbols with empty string
        
         for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == word.charAt(word.length() - i - 1)) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        boolean result = isPalindrom("No lemon, no melon");
        System.out.println(result);

        result = isPalindrom("I did, did I");
        System.out.println(result);

        result = isPalindrom("Top spot");
        System.out.println(result);

        result = isPalindrom("Eva, can i see bees in a cave?");
        System.out.println(result);

        result = isPalindrom("Was it a cat I saw");
        System.out.println(result);

    }
}
