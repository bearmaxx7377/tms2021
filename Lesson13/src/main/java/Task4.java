import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 4*)со звездочкой! Предложение состоит из нескольких слов, разделенных пробелами.
     Например: "One two three раз два три one1 two2 123 ".
     *  Найти количество слов, содержащих только символы латинского алфавита.
     *  Необходимо составить регулярное выражение и вызвать его в методе split(Regexp)[a-zA-Z]+\s+?"
     *  String str = "One two three раз два три one1 two2 123 ";
     *  System.out.println(str.split("регулярное выражение").length); ([а-яА-Я]{2,}) | ([0-9]{3,}) |([a-zA-Z]+\\d)
 */
public class Task4 {
    public static void main(String[] args) {
        int mm = 0;
        String str = "One two three раз два  три one1 two2 123 ";
        String reg = "[a-zA-Z]+\\s+?";
        Pattern pat = Pattern.compile(reg);
        Matcher mat = pat.matcher(str);
        while (mat.find()) {
            mm++;
            System.out.println(mm + " слово, это слово -> " + mat.group());
        }
    }
}