package task02.price;

import java.util.Scanner;

public class Price {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько надо литров бензина?");
        double price = 49.7;
        System.out.println("Бензин стоит "+ scanner.nextDouble()*price + " рублей");
    }
}