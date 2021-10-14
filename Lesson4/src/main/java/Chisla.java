import java.util.Scanner;
//    4)В переменную записываем число.
//    Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
//    Например, Введите число: 5
//    "5 - это положительное число, количество цифр = 1"
public class Chisla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int i = scanner.nextInt();
        int copy = i;
        int cout = 0;
        while (i > 0) {
            ++cout;
            i /= 10;
        }
        System.out.println(copy + " - Число положительное, кол-во цифр = " + cout);
        System.out.println();
    }
}