package task05.homeworkrepeat;

import task05.homeworkrepeat.lanka.Demon;

public class Lanka {
    public static void main(String[] args) {
        Demon demon = new Demon();
        System.out.println("Было демонов на Ланке: " + demon.getQuantity());
        System.out.println("Стало демонов на Ланке: " + demon.getQuantityAfterFight());
    }
}
