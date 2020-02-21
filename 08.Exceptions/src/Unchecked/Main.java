package Unchecked;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//unchecked exception, exception
public class Main {
    public static void main(String[] args) {
        Main test = new Main();
        File file = new File("C:/path/path");
        Scanner scanner = null;

        try {
            scanner = test.openScannerOnFIle(file);
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.err.println(e.getMessage());
        }
        System.out.println("Instrukcja po catch w main.");
    }

    private Scanner openScannerOnFIle(File f) throws FileNotFoundException {
        return new Scanner(f);
    }

}