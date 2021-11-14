import java.util.regex.Matcher;
import java.util.regex.Pattern;

//3) Дана строка "Versions: Java  5, Java 6, Java   7, Java 8, Java 12."
//   Найти все подстроки "Java X", где X - число и распечатать их.

public class Task2 {
    public static void main(String[] args) {
        String str = "Versions: Java  5, Java 6, Java   7, Java 8, Java 12.";
        String prob = "Java\\s+\\d{1,2}";
        Pattern pattern = Pattern.compile(prob);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
