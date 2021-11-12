package stringTest;

// Палиндром - это слово или предложение, которое одинаково читается в обе стороны.
// Напишем небольшую программу, которая перевернет палиндром.
// Мы будем использовать метод charAt(i), который возвращает i-й символ строки, начиная с 0.
public class Palindrome0 {
    public static void main(String[] args) {
        String pal = "Казак Шалаш Потоп Кабак";
        int len = pal.length();

        char[] tCharArr = new char[len];
        char[] charArr = new char[len];

// Создаём из строки массив символов
        for (int i = 0; i < len; i++) {
            tCharArr[i] = pal.charAt(i);
        }
// Здесь перевернем массив символов
        for (int j = 0; j < len; j++) {
            charArr[j] = tCharArr[len - 1 - j];
        }
        String reversePal = new String(charArr);
        System.out.println(reversePal);
    }
}
// Для того чтобы перевернуть строку, мы сначала создали из строки массив символов (первый цикл),
// затем создали новый массив, в который записали перевернутый первый массив, далее создали новую строку.