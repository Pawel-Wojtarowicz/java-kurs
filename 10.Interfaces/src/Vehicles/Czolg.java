package Vehicles;

public class Czolg implements Pojazd, Marka {

    @Override
    public void start() {
        System.out.println("Czołg rusza");
    }
    @Override
    public void stop() {
        System.out.println("Czołg hamuje");
    }
    public void strzelaj() {
        System.out.println("Czołg strzela");
    }
    @Override
    public void marka() {
        System.out.println("Abrams");
    }
}

