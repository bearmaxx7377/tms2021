import java.util.Scanner;

// Определение количества слов в строке
public class CountWords {
    public static void main(String[] args) {
        //Вводим предложение в консоль
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слова одной строкой через пробел: ");
        String input = sc.nextLine();
        //Начальное количество слов равно 0
        int cout = 0;
        //Если ввели хотя бы одно слово, тогда считать, иначе конец программы
        if (input.length() != 0) {
            cout++;
            //Проверяем каждый символ, не пробел ли это
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == ' ') {
                    //Если пробел - увеличиваем количество слов на 1
                    cout++;
                }
            }
        }
        System.out.println("!Вы ввели " + cout + " слов(а)!");
    }
}
