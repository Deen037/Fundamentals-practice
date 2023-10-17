public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("rotor"));
        System.out.println(isPalindrome("car"));
    }

    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(str.length() - (i + 1))) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
