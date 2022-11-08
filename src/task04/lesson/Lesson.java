package task04.lesson;

import java.util.Arrays;
import java.util.Date;

public class Lesson {
    public static void main(String[] args) { //ООП
        Student ivan;
        ivan = new Student();
        ivan.name = "Ivan";
        System.out.println(ivan.name);
        Student grisha = new Student();
        grisha.name = "Grisha";
        System.out.println(grisha.name);

        System.out.println(ivan.progress.score);
        ivan.test();
        System.out.println(ivan.progress.score);

        System.out.println(grisha.progress.score);
        grisha.test();
        System.out.println(grisha.progress.score);

        System.out.println(Arrays.toString(ivan.getClass().getDeclaredFields()));

        if (ivan == grisha) {
            System.out.println("equals");
        } else {
            System.out.println("different"); // сравнение не объектов, а ссылок на объект
        }

        int a = 5;
        int b = 5;
        if (a == b) {
            System.out.println(a + " равно " + b);
        } else {
            System.out.println(a + " не равно " + b);
        } //сравниваются ячейки в памяти, результат "равно"

        Integer x = new Integer(5);
        Integer y = new Integer(5);
        if (x == y) {
            System.out.println(x + " равно " + y);
        } else {
            System.out.println(x + " не равно " + y);
        } //сравниваются ссылки на ячейку в памяти, результат "не равно", так как это разные объекты

        Integer i = new Integer(5);
        Integer j = new Integer(5);
        if (i.equals(j)) {
            System.out.println(x + " равно " + y);
        } else {
            System.out.println(x + " не равно " + y);
        } //сравнивает значения, результат "равно", integer переопределен
        System.out.println(ivan.toString());

        Date date; //импорт пакета через команду import
        java.sql.Date date1; //указание пакета в самом объекте, в данном случае пакет sql

    }
    //метод wait() позволяет приостановить выполнение потока
    //метод notifyAll() позволяет возобновить выполнение потока
    //метод finalize() можно переопределить, вызывается, когда уничтожается объект.
    //toString() позволяет вывести строковое описание объекта
    //метод clone() вызывается очень редко, нужен для того, чтобы клонировать объект
    //метод hasCode() возвращает число int, которое должно быть для каждого объекта уникальным
    //корневой пакет записывается как название сайта организации с доменом в обратном порядке
    //название пакетов принято писать с маленькой буквы, классов с большой


    /* Модификаторы доступа
    private - видим внутри класса
    default - видим внутри пакета (когда не указывается никакой модификатор)
    protected - видим внутри пакета и подклассам
    public - видим для всех
     */

    //ДЗ нет


}
