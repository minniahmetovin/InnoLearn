package task06.lesson;

public class EnumExample {
    public static void enumExample(String[] args) {
        enum Season {WINTER, SPRING, SUMMER, AUTUMN}
        ;
        Season season = Season.SPRING;
        if (season == Season.SPRING) season = Season.SUMMER;
        System.out.println(season);
    }
}