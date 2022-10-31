package task03;

public class Cycles {
    int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //цикл foreach

    public enum Drinks {
        COLA, TEA, COFFEE
    }

    public Cycles() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " ");
        }
        System.out.println();
        int i = 0;
        for (; i < 10; i++) {
            System.out.println(i + " ");
        }
        System.out.println();
        for (int y = 0; y < 10; y += 2) { //с шагом в два
            System.out.println(y + " ");
        }
        System.out.println();
        for (int element : arr) {
            System.out.println(element + " "); //для цикла foreach, чтобы вывести все элементы массива
        }
        System.out.println();
        for (Drinks element : Drinks.values()) {
            System.out.println(element + " "); //для enum, чтобы вывести все элементы enum
        }
        System.out.println();
        i = 0;
        while (i < 100) {
            System.out.println(i + " "); //цикл while, который выводит переменную с шагом 10, пока она меньше 100
            i += 10;
        }
        System.out.println();
        do {
            System.out.println(i + " ");
            i += 10;
        }
        while (i < 100); // цикл do while
        System.out.println();
        for (int a = 0; a < 4; a++) {
            for (int b = 0; b < 4; b++) { //вложенный цикл
                System.out.printf("%3d " + a * 4 + b + " ");
                if (a * 4 + b > 5)
                    break;
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {
        new Cycles();
    }
}
