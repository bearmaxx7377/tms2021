package palindrome;

import java.util.Scanner;

import static palindrome.TextFormatter.countWords;
import static palindrome.TextFormatter.isPalindrome;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слова одной строкой через пробел: ");
        String s = sc.nextLine();
        countWords(s);
        isPalindrome(s);
    }
}

