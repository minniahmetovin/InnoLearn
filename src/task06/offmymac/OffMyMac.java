package task06.offmymac;

import task04.lesson.Progress;

import java.io.IOException;

public class OffMyMac {
    public static void main(String[] args) throws IOException {
        Runtime runtime = Runtime.getRuntime();
        Progress proc = runtime.exec("shutdown -s -t 0");
        System.exit(0);
    }
}
