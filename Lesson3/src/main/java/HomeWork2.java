import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class HomeWork2 {
    public static void main(String[] args) throws IOException {
        //Некоторые тесты для проверки задач. Можно также написать свои тесты.
        printArray();
        System.out.println(operation(1));
        System.out.println(operation(0));
        System.out.println(calculateCountOfOddElementsInMatrix(new int[]{1, 2, 3, 4, 5, 6}));
        calculateSumOfDiagonalElements();
        countDevs(103);
        foobar(6);
        foobar(10);
        foobar(15);
        printMatrix();
        printPrimeNumbers();
    }

    /**
     * Необходимо прочитать с консоли значение числа типа int,
     * далее создать одноменрый массив типа int размера прочитаного с консоли
     * далее заполнить массив случайными значениями
     * далее вывести массив на консоль
     */
    private static void printArray() {
        // тут пишем логику
        System.out.println("Случайные числа массива: ");
        Random random = new Random();
        int[] array = new int[6];
        for (int i = 0; i < 5; i++) {
            array[i] = random.nextInt(50);
            System.out.println(array[i]);
        }
    }

    /**
     * Метод должен выполнять некоторую операцию с int "number" в зависимости от некоторых условий:
     * - if number положительное число, то необходимо number увеличить на 1
     * - if number отрицательное - уменьшить на 2
     * - if number равно 0 , то замените значение number на 10
     * вернуть number после выполнения операций
     */
    public static int operation(int number) throws IOException {
        // тут пишем логику
        System.out.print("Введите число: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        if (a > 0) {
            a = a + 1;
        }
//        System.out.println("Результат: "  + a);
        if (a < 0) {
            a = a - 2;
        }
//        System.out.println("Результат: "  + a);
        if (a == 0) {
            a = 10;
        }
        return a;
    }

    /**
     * На вход приходит массив целых чисел типа int
     * Необходимо найти количество нечетных элементов в массиве и вернуть значение в метод main,
     * в котором это значение распечатается на консоль.
     */
    public static int calculateCountOfOddElementsInMatrix(int[] ints) {
        // тут пишем логику
        System.out.print("Нечетные элемены массива: ");
        int[] array = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i]);
//             return (array[1]);
            }
        }
        return (array[0]);
    }

    /**
     * На вход приходит число.
     * Вывести в консоль фразу из разряда "_COUNT_ программистов",
     * заменить _COUNT_ на число которое пришло на вход в метод и заменить окончание в слове "программистов" на
     * уместное с точки зрения русского языка.
     * Пример: 1 программист, 42 программиста, 50 программистов
     *
     * @param count - количество программистов
     */
    public static void countDevs(int count) {
        // тут пишем логику
        System.out.println("_COUNT_ программистов:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//      System.out.println("Введите число: ");
        int[] prog = new int[]{11, 21, 50, 1, 33};
        System.out.println(prog[0] + " " + declension(prog[0]));
        System.out.println(prog[1] + " " + declension(prog[1]));
        System.out.println(prog[2] + " " + declension(prog[2]));
        System.out.println(prog[3] + " " + declension(prog[3]));
        System.out.println(prog[4] + " " + declension(prog[4]));
    }

    public static String declension(int count) {
        String one = "программист";
        String two = "программиста";
        String five = "программистов";

        if (count > 100)
            count %= 100;

        if (count > 20)
            count %= 10;

        switch (count) {
            case 1:
                return one;
            case 2:
            case 3:
            case 4:
                return two;
            default:
                return five;
        }
    }

    /**
     * Метод должен выводить разные строки в консоли в зависимости от некоторых условий:
     * - если остаток от деления на 3 равен нулю - выведите "foo" (example of number - 6)
     * - если остаток от деления на 5 равен нулю - вывести "bar" (example of number - 10)
     * - если остаток от деления на 3 и 5 равен нулю 0 ,то вывести "foobar" (example of number - 15)
     */
    public static void foobar(int number) {
        // тут пишем логику
        int max = 3;
        for (int i = 1; i <= max; i++) {
            if (i % 3 == 0) {
                System.out.print("foo");
            } else if (i % 5 == 0) {
                System.out.print("bar");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("foobar");
            } else
                System.out.println(i);
        }
    }

    /**
     * заполнить рандомно 2-х мерный массив и посчитать сумму элементов на диагонали
     */
    public static void calculateSumOfDiagonalElements() {
        //пишем логику и выводим результат используя System.out.println
        System.out.println("Случайные числа: ");
        int i = 5;
        int j = 5;
        int sum = 0;
        int[][] mass = new int[i][j];
        Random random = new Random();
        for (i = 0; i < mass.length; i++) {
            for (j = 0; j < mass.length; j++) {
                mass[i][j] = (int) random.nextInt(69);
//                sum += mass[i][mass.length - 1 - i];
                System.out.print(mass[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.print("Сумма диагонали: " + sum); //не получается вывести сумму
    }

    /**
     * Шаги по реализации:
     * - Прочитать два int из консоли
     * - Создайте двумерный массив int (используйте целые числа, которые вы читаете по высоте и ширине консоли)
     * - Заполнить массив случайными значениями (до 100)
     * - Вывести в консоль матрицу заданного размера, но:
     * - Если остаток от деления элемента массива на 3 равен нулю - выведите знак "+" вместо значения элемента массива.
     * - Если остаток от деления элемента массива на 7 равен нулю - выведите знак "-" вместо значения элемента массива.
     * - В противном случае выведите "*"
     * <p>
     * Example:
     * - Значения с консоли - 2 и 3
     * - Массив будет выглядеть так (значения будут разными, потому что он случайный)
     * 6 11 123
     * 1 14 21
     * - Для этого значения вывод в консоли должен быть:
     * <p>
     * + * *
     * * - +
     * <p>
     * Обратите внимание, что 21% 3 == 0 и 21% 7 = 0, но выводить надо не +-, а +
     */
    public static void printMatrix() {
        // тут пишем логику
    }

    /**
     * Задача со звездочкой!
     * Метод должен печатать все простые числа <1000
     * что такое просто число (https://www.webmath.ru/poleznoe/formules_18_5.php)
     */
    public static void printPrimeNumbers() {
        // тут пишем логику
        int n = 1000;
        for (int i = 2; i <= n; i++) {
            boolean a = true;
            int q = (int) Math.sqrt(i);
            for (int j = 2; j <= q; j++) {
                if ((i % j) == 0) {
                    a = false;
                    break;
                }
            }
            if (a) {
                System.out.println(i + " простое");
            }
        }
    }
}