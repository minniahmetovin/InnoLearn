package task03.lesson;

public class BitOps { //битовые операции
    public static void main(String[] args) {
        int a = 13;
        // 128 64 32 16  8  4  2  1
        //   0  0  0  0  0  0  0  0 = 0
        //   1  1  1  1  1  1  1  1 = 255
        //   0  0  0  0  1  1  0  1 = 13
        //   0  0  0  0  0  1  1  0 = 6 - сдвинули на один бит вправо - по факту деление на 2
        //   0  0  0  1  1  0  1  0 = 26 - сдвинули на один бит влево - по факту умножение на 2
        System.out.println(a >> 1);
        System.out.println(a << 1);
        System.out.println(a & 13); //битовое сложение, остается тем же самым, если складывается само на себя
        System.out.println(a | 0); /* оператор или, если в коде в одном из чисел есть "0", он становится "0",
                                   если есть "1" - становится "1" */
        System.out.println(-1 << 1);
        System.out.println(-1 >>> 1); // сдвиг с учетом старшего бита
        System.out.println(26 ^ 6); // исключающее или, работает так же как в операторе if

    }
}
