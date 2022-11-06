package task04.lesson;

import java.util.Arrays;

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

        if(ivan == grisha){
            System.out.println("equals");
        } else {
            System.out.println("different"); // сравнение не объектов, а ссылок на объект
        }

    }

}
