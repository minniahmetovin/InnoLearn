package task03.homework.multiplicationtable;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int t = 1; t < 10; t++) {
            int x;
            for (x = 1; x < 10; x++) {
                System.out.print(t + "*" + x + "=" + t * x + " ");
            }
            System.out.println();
        }
        // программа на вложенные циклы
    }
}