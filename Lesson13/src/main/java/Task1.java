import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*2) Дана строка "cab, ccab, cccab"
Необходимо составить регулярное выражение, сделать класс Pattern, Matcher,
вызвать метод find и вывести слова на консоль
   * Должно вывести:
   * cab
   * ccab
   * cccab
*/
public class Task1 {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("c+ab");
        Matcher matcher = pattern.matcher("cab, ccab, cccab");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
