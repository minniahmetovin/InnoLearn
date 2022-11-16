package task06.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class VendingMachine { //написать программу для вендингового аппарата, реализовать enum
    public static void main(String[] args) {
        String mainMenu = "Добрый день! Выберите действие меню: \n" +
                "                1 - Посмотреть меню напитков \n" +
                "                2 - Внести деньги на внутренний счет \n" +
                "                3 - Выбрать номер напитка и получить его \n" +
                "                0 - Выход из меню \n" +
                "                Внимание! Автомат сдачи не выдает\")";
        System.out.println(mainMenu);
        Scanner scanner = new Scanner(System.in);
        int type1 = scanner.nextInt();
        List<Integer> available = new ArrayList<>();
        switch (type1) {
            case 1: {
                for (Drink d : Drink.values()) {
                    System.out.println(d.getNum() + ". " + "Напиток " + d.getTitle() + ". " + "Цена - " + d.getCost() + " P.");
                }
                break;
            }
            case 2: {
                System.out.println("Введите вносимую сумму");
                Integer balance = scanner.nextInt();
                do {
                    System.out.println("Вы внесли " + balance + " рублей. Выберите напиток");
                    for (Drink d : Drink.values()) {
                        System.out.println(d.getNum() + ". " + "Напиток " + d.getTitle() + ". " + "Цена - " + d.getCost() + " P.");
                        available.add(d.getNum());

                        if (balance < d.getCost()) {
                            System.out.println("Суммы недостаточно. Введите еще " + (d.getCost() - balance) + " рублей.");
                        }
                        Integer type2 = scanner.nextInt();
                        if (available.contains(type2)) {
                            System.out.println("Вы выбрали " + Drink.getNameByNumber(type2));
                            break;
                        } else {
                            System.out.println("Выберите напиток из списка " + available.toString());
                        }
                    }
                    break;
                }

                while (true);
            }
            case 3: {
                System.out.println(Arrays.toString(Drink.values()));
                Integer type3 = scanner.nextInt();
                break;
            }

//            while (type1 != 0) {
//             //   System.out.println(mainMenu);
//            }


            default: {
                System.out.println("Введено некорректное значение. Выберите из списка");
            }
        }
    }
}