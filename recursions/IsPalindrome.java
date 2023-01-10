package recursions;

//import java.lang.*;

public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("mama"));
    }

    static boolean isPalindrome(String word){
        if (word.length() <= 1) return true;

        if(word.charAt(0) != word.charAt(word.length() - 1)) return false;


        return isPalindrome(word.substring(1, word.length() - 1));
    }
}
