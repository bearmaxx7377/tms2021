package stringTest;

import java.util.Scanner;

// Определение палиндрома в строке
public class PalindromeDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите слово(число): ");
        String s = scan.next();
        isPalindrome(s);
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
