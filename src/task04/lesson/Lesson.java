package task04.lesson;

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

    }

}
