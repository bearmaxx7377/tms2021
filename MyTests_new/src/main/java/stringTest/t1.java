package stringTest;

public class t1 {
    public static void main(String[] args) {

// Создание строк
        String hello = "Hello World!"; // Самый простой способ создания строк
        System.out.println(hello);
        System.out.println("--------------");

        char[] helloArr = {'h', 'e', 'l', 'l', 'o', '!',}; // Создание объекта через массив
        String helloSt = new String(helloArr);
        System.out.println(helloSt);
        System.out.println("--------------");

// Длина строки (метод считывает всю введенную строку)
        String ss = "Успех неизбежен!";
        int len = ss.length();
        System.out.println(len + " чисел");
        System.out.println("--------------");

// (.concat) - Метод соединения двух(более) строк
        String st = "auf";
        String st1 = "AUF";
        System.out.println(st.concat(st1));
        System.out.println("--------------");
        System.out.println("Успех".concat(" Неизбежен"));
        System.out.println("--------------");
        System.out.println("Hi!" + " what is " + "this?");
        System.out.println("--------------");

        String stt = " тут ";
        System.out.println("Казак" + stt + "мадам");
        System.out.println("--------------");


        String[] car = {"MAN", "MAZ", "KAMAZ"}; //задан массив строк
        String rez = "В гараже стоят машины! "; //задана строка
        //прибавляем к строке элементы массива
        for (int i = 0; i < car.length; i++) {
            //если элемент не последний, разделяем запятой
            if (i != car.length - 1) {
                rez += car[i] + ",";
                //если последний, ставим после него точку
            } else {
                rez += car[i] + ".";
            }
            System.out.println(rez);
        }
        System.out.println("--------------");

// Определить последний символ в строке
        String pr = "Последний символ в этой строке - 0";
        int x = pr.length() - 1; //длина строки - 1, так как отсчет начинается с 0
        char y = pr.charAt(x);
        System.out.println(y);
        System.out.println("--------------");

// Поменять в строке символы пробела на точки при помощи преобразования в массив символов
        String pr1 = "1 000 000 000";
        //преобразовываем строку в массив
        char[] chArr = pr1.toCharArray();
        //перебираем все элементы массива
        for (int i = 0; i < chArr.length; i++) {
            //находим пробел
            if (chArr[i] == ' ') {
                //заменяем на точку
                chArr[i] = '.';
            }
        }
        System.out.println(chArr);
        System.out.println("--------------");


    }
}
