package learn.library;

import java.io.File;
import java.util.Scanner;

public class ScannerFileTest {
    public static void main(String[] args) throws Exception {

        Scanner sc=new Scanner(new File("src/learn/library/ScannerFileTest.java"));
        System.out.println("ScannerFileTest.java内容如下：");
        while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }

    }
}
