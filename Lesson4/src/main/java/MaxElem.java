// 8) Найти максимальный элемент в массиве {4,5,0,23,77,0,8,9,101,2}
// и поменять его местами с нулевым элементом

public class MaxElem {
    public static void main(String[] args) {
        System.out.println("Максимальный элемент в массиве: ");
        int[] array = {4, 5, 0, 23, 77, 0, 8, 9, 101, 2};
        int max = array[0];
        for (int i = 0; i < array.length; i++) { //исправлено
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.print(max); // вывод максимального элемента массива
    }
}

// С ЗАМЕНОЙ "НОЛЯ" НА МАКСИМАЛЬНОЕ ЗНАЧЕНИЕ, ПОКА НЕ СМОГ РАЗОБРАТЬСЯ