// 5) Создайте массив из всех нечётных чисел от 1 до 100, выведите его на экран в строку,
//    а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 ... 7 5 3 1).
public class Nechet {
    public static void main(String[] args) {
        System.out.println("Нечетные числа массива: ");
        int[] array = new int[50];
        for (int i = 0, n = 1; i < array.length; n = n + 2, i++) {
            array[i] = n;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
