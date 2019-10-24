package am.oop;

public class Palindrome {
    public static boolean isPalindrom(String word) {
        boolean result = false;

        //I could not find a regex expression that found all the symblos and replace them with ""
        word = word.replaceAll(" ", "").toLowerCase();
        word = word.replaceAll(",", "").toLowerCase();
        word = word.replaceAll("\\?", "").toLowerCase();
        
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
