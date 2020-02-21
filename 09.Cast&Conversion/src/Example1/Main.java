package Example1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe 1: ");
        int input = scanner.nextInt();
        mnozenie1(input);   //bez rzutowania
        mnozenie2(input);   //rzutowanie na int

        System.out.println("Podaj liczbe 2 do dzielenia: ");
        int input2 = scanner.nextInt();
        dzielenie(input, input2);

        System.out.println("Podaj znak: ");
        char input3 = scanner.next().charAt(0);
        asci(input3);
        System.out.println("Podaj liczbe by odczytac znak: ");
        int input4 = scanner.nextInt();
        asci2(input4);

    }
    public static void mnozenie1(int x){
        System.out.println("Mnozenie zmiennoprzecinkowe (z liczbą PI): " + x * Math.PI);
    }
    public static void mnozenie2(int x){
        System.out.println("Mnożenie całkowite: " +(x * (int) Math.PI));
    }
    public static void dzielenie(int x, int y) {
        double z = y;
        System.out.println("Wynik dzielenia liczb "+ x + " i "+ y + ": " + x/z);
    }
    public static void asci(char x) {
        System.out.println((int) x);
    }
    public static void asci2(int x) {
        System.out.println((char) x);
    }


}
