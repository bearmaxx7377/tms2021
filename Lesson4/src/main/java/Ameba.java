import java.util.Scanner;

public class Ameba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количетсво часов: ");
        int x = scanner.nextInt(); // кол-во часов
        int y = 2; // кол-во амёб в 3 часа
        for (int i = 1; i < x / 3; i++) {
            y = y * 2;
        }
        System.out.println("За " + x + " часа(ов), получится " + y + " амёб.");
    }
}
