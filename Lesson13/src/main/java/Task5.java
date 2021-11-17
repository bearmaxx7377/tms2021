import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*  *  5*)со звездочкой! В метод на вход приходит строка
          *
          *  public static boolean validate(String str) {
        return false;
        }
        * Необходимо выполнить проверку на валидацию входящей строки и вернуть false или true
        * - Строка должна содержать только маленькие латинские буквы и цифры 1 или 5 без знака подчеркивания.
        * - Длина строки должна быть от 4 до 20 символов.
        * PS: нужно посмотреть презентацию страница 44 (Метасимволы для группировки символов)
 */
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String st = scanner.nextLine();
        System.out.println(validate(st));
    }

    public static boolean validate(String st) {
        Pattern pat = Pattern.compile("[a-z1|5]{4,20}");
        Matcher mat = pat.matcher(st);
        while (mat.find()) {
        }
        if (st.length() < 4) {
            System.out.println("Строка меньше (4) символов!");
        } else {
            if (st.length() > 20) {
                System.out.println("Строка больше (20) символов!");
            }
            if (st.matches("[a-z1|5]{4,20}") && (st.length() >= 4 && st.length() <= 20)) {
                return true;
            }
        }
        return false;
    }
}
