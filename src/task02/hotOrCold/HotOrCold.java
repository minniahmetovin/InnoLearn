package task02.hotOrCold;

import java.util.Random;
import java.util.Scanner;

public class HotOrCold {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи любое число");
        int userInput = scanner.nextInt();
        Random random = new Random(100);
        int userInput2 = scanner.nextInt();
        while (userInput != 101 || userInput != random) {
            if (
                    userInput - random >= scanner.nextInt()
            )
                System.out.println("Горячо");
        }

      //  System.out.println(random);
        //int i = 5;
        //if (scanner.hasNext() < i){
        //    System.out.println("Горячо");
        //}
        //if (scanner - random > i){
          //  System.out.println("Холодно");
        }
    }
