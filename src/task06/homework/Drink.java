package task06.homework;

public enum Drink {
    COFFE(100, 1, "Кофе"), TEA(80, 2, "Чаёчек"),
    CHICKORY(100, 3, "Цикорий"), MILK(70, 4, "Молочко"),
    JUICE(120, 5, "Сок"), SOMARASA(128, 6, "Сома Раса");

    private int cost;
    private int num;
    private String title;

     Drink(int cost, int num, String title) {
        this.cost = cost;
        this.num = num;
        this.title = title;
    }

    public int getCost() {
        return cost;
    }

    public int getNum() {
        return num;
    }

    public String getTitle() {
        return title;
    }

    public static String getNameByNumber(int num) {
        for (Drink value : Drink.values()) {
            if (num == value.getNum()) {
                return value.getTitle();
            }
        }
        return null;
    }
}
