package stringTest;

public class t2 {
    public static void main(String[] args) {

// Получение символов и подстрок
        String pal = "Минск - город герой!"; // вывод символа строки
        char atChar = pal.charAt(10);
        System.out.println("Возвращает: " + atChar); // выдаст (р)
        System.out.println("--------------");

        String pal1 = "Минск - город герой!"; // подсчет всей строки
        int s = pal1.length();
        System.out.println("Кол-во букв: " + s);
        // при (pal.length()) выдаст (20)
        // при (pal.length()-1) выдаст (19) с тем учетом что отсчет символов идет с нуля
        System.out.println("--------------");


// String substring(int beginIndex, int endIndex) - Возвращает подстроку данной строки,
// начиная с символа с индексом beginIndex, заканчивая endIndex — 1.
// String substring(int beginIndex) - Возвращает подстроку данной строки,
// начиная с символа под номером beginIndex и до конца строки.
        String pal2 = "Минск - город герой!";
        String sity = pal2.substring(8, 13); // Следующий код вернет подстроку строки,
        String sity1 = pal2.substring(8, pal2.length() - 7); // ???
        String s1 = pal2.substring(8);       // начиная с 8 символа, но не включая 13, получится слово «город»
        System.out.println("String substring(int beginIndex, int endIndex): " + sity);
        System.out.println("String substring(int beginIndex, int endIndex): " + sity1);
        System.out.println("String substring(int beginIndex): " + s1);
        System.out.println("--------------");


// Поиск символов и подстрок
// Класс String содержит методы, которые возвращают позицию символа или подстроки в строке: indexOf()и lastIndexOf().
// Метод indexOf() находит индекс первого вхождения подстроки в строку.
// Метод lastIndexOf() - индекс последнего вхождения.
// Если подстрока не будет найдена, то оба метода возвращают -1:

// Метод contains, который возвращает true, если заданная последовательность символов содержится в строке.
// Используйте этот метод, если необходимо узнать о существовании подстроки в строке, а её позиция не важна.
        String s3 = "Минск - город герой!";
        int sss = s3.indexOf('о'); // 9
        int sss1 = s3.indexOf("г"); // 8
        int sss2 = s3.lastIndexOf('о'); // 17
        System.out.println("до первого выбранного символа в строке: " + sss);
        System.out.println("до первого выбранного символа в строке: " + sss1);
        System.out.println("до последнего выбранного символа в строке: " + sss2);
        System.out.println("--------------");


// МОДИФИКАЦИЯ СТРОК (ОБРЕЗКА СТРОКИ И ИЗМЕНЕНИЕ РЕГИСТРА)
        // toLowerCase() — позволяет преобразовать строку в нижний регистр;
        // toUpperCase() — позволяет преобразовать строку в верхний регистр;
        // trim() — позволяет удалить начальные и конечные пробелы;
        String s4 = " Корова говорит - Му-му! ";
        s4 = s4.trim(); //убрал символы пробела в начале и конце строки
        System.out.println("нижний регистр: " + s4.toLowerCase()); // все слова с заданной строки с маленькой буквы
        System.out.println("ВЕРХНИЙ РЕГИСТР: " + s4.toUpperCase()); // все слова с заданной строки с большой букввы
        System.out.println("--------------");

// String replace(char oldChar, char newChar), replace(CharSequence target, CharSequence replacement)
// замена в строке одного символа или подстроки на другой символ или подстроку.
        String s5 = " Ваша киска купила бы Вискас! ";
        String rep = s5.replace(" ", ".");
        System.out.println(rep);
        System.out.println("--------------");

// Сравнение строк
// boolean equals(Object anObject) — проверяет идентичность строк.
// Возвращает true только в том случае, если в строках представлена одинаковая последовательность символов одной величены.
        String ss = "Корова говорит - Му-му!";
        String ss1 = "корова говорит - му-му!";
        //строки не идентичны
        System.out.println(ss.equals(ss1)); // false
        //строки идентичны после перевода первой строки в нижний регистр
        System.out.println(ss.toLowerCase().equals(ss1)); // true
        System.out.println("--------------");

// Вариант удаления части строки заменой на пробел
        String text = "Корова говорит ";
        String text1 = "Му - му!";
        text1 = text1.replace(text, " ");
        System.out.println(text1); // Му - му!
        System.out.println("--------------");

// ЗАМЕНА В СТРОКЕ
        String str = "Evil Empire";
        String repl = str.replace('v', 'm'); // Emil Empire
        String repl1 = str.replace("Empire", "Good"); // Evil Good
        System.out.println(repl);
        System.out.println(repl1);
        System.out.println("--------------");

// ОБРАТНЫЙ ПОРЯДОК В СТРОКЕ
        StringBuffer stringBuffer = new StringBuffer("каламбур");
        stringBuffer.reverse();
        System.out.println(stringBuffer.toString()); // румбалак
        System.out.println("--------------");
    }
}