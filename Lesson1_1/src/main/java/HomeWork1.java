public class HomeWork1 {
    public static void main(String[] args) {
        //Некоторые тесты для проверки задач.
        System.out.println(sum(10, 5));
        System.out.println(sum(Integer.MAX_VALUE, Integer.MAX_VALUE));
        System.out.println(max(7, 10));
        System.out.println(average(new int[]{1, 2, 3, 4, 5}));
        System.out.println(max(new int[]{1, 77, 3, 54, 5, 87, 99}));
        System.out.println(calculateHypotenuse(12,16));
    }

    /**
     * 1. Метод должен вернуть сумму двух чисел a и b
     * 2. Дополнительно: сделать проверку если сумма a и b больше чем максимальное значение int то вернуть -1
     **/
    public static int sum(int a, int b) {
      if ((long)a + b > Integer.MAX_VALUE) {  // дополнительное задание
        return -1;  // дополнительное задание
        }
        return a + b; // - метод нахождения суммы двух чисел
    }

    /**
     *
     * Метод должен вернуть максимальное значение из двух чисел
     *
     * <p>
     * Example1:
     * a = 4,
     * b = 5
     * <p>
     * Метод должен вернуть 5
     * Example2:
     * a = 10,
     * b = 10
     * <p>
     * Метод должен вернуть 10
     */
    public static int max(int a1, int b1) {
       return a1 > b1 ? a1 : b1;
       // return Math.max(a1, b1);
    }

    /**
     * Метод должен вернуть среднее значение из массива чисел
     * (необходимо сумму всех элеменов массива разделить на длину массива)
     * <p>
     * Example:
     * array = {1,2,3,4,5}
     * Метод должен return 3.0
     */
    public static double average(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return (double) sum / array.length; // - это для нахождения среднего значения массива
     // return sum;  - это для нахождения суммы массива
    }

    /**
     * Метод должен вернуть максимальый элемент массива. Пример: array = {1,2,10,3} метод возвращает 10
     **/
    public static int max(int[] array) {
        int maximum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (maximum < array[i])
                maximum = array[i];
        }
        return maximum; // - это для нахождения максимального элемента массива
    }

    /**
     * Используя теорему Пифагора, вычислите значение гипотенузы. Квадрат гипотенузы = сумме квадратов катетов
     *
     * Example1:
     * 3
     * 4
     * return 5
     * <p>
     * Example2:
     * 12
     * 16
     * return 20
     */
    public static double calculateHypotenuse(int a3, int b3) {
       return Math.sqrt(a3*a3 + b3*b3); // - это для нахождения "квадратов" по Пифагору
    }
}