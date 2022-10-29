package task02.sectohour;

import java.util.Scanner;

public class SecToHour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество секунд");
        int sih = 60*60;
        double hours = scanner.nextDouble()/sih;
        System.out.println("Часов в этих секундах: " + hours);
    }
}
