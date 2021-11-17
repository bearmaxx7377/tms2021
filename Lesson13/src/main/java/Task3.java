import java.util.Scanner;

/*По строкам дополнительная!
 *  1) Даны строки разной длины c четным числом символов(казаки, просмотреть и так далее),
 *  необходимо вернуть ее два средних знака.
 */

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово, из четного кол-ва символов: ");
        String str = scanner.nextLine();
        System.out.println("Два средних символа -> " + middleCharacters(str) + " <- в введенном слове -> " + str);
    }

    public static String middleCharacters(String str) {
        if (str.length() % 2 == 0) {
            return str.substring(str.length() / 2 - 1, str.length() / 2 + 1);
        } else {
            return "Ошибка! Нечетное кол-во символов в слове!";
        }
    }
}