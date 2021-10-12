// 8) Найти максимальный элемент в массиве {4,5,0,23,77,0,8,9,101,2}
// и поменять его местами с нулевым элементом

public class MaxElem {
    public static void main(String[] args) {
        System.out.println("Максимальный элемент в массиве: ");
        int[] array = {4, 5, 0, 23, 77, 0, 8, 9, 101, 2};
        int max = array[0];
        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }
        System.out.print(max); // вывод максимального элемента массива
    }
}

// пока что с заменой запутался