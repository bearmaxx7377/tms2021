package palindrome;

public class TextFormatter {

    public static String countWords(String s) {
        int cout = 0;
        if (s.length() != 0) {
            cout++;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' ') {
                    cout++;
                }
            }
        }
        System.out.println("!Вы ввели " + cout + " слов(а)!");
        return s;
    }

    public static String reverseString(String s) { //Метод для переворачивания строки
        String r = "";
        for (int i = s.length() - 1; i >= 0; --i)
            r += s.charAt(i);
        return r;
    }

    public static Boolean isPalindrome(String s) { //Метод для поиска полиндрома
        if (s.equals(reverseString(s))) {
            System.out.println("Полиндром");
        } else {
            System.out.println("Не полиндром");
        }
        return s.equals(reverseString(s));
    }
}