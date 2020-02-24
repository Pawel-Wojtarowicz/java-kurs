package Computation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Computation computation;

        if (main.shouldMultiply()) {
            computation = new Multiplication();
        }
        else {
            computation = new Addition();
        }

        double argument1 = main.getArgument();
        double argument2 = main.getArgument();

        double result = computation.compute(argument1, argument2);
        System.out.println("Wynik: " + result);

    }
    private boolean shouldMultiply() {
        System.out.println("Co chcesz zrobic? 1. Mnożenie 2. Dodawanie");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        switch (x) {
            case 1:
                return true;
            case 2:
                return false;

            default: throw new IllegalArgumentException("illegal");
        }
    }

    private double getArgument() {
        System.out.println("Podaj liczbe: ");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        return x;
    }
}
