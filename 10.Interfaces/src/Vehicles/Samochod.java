package Vehicles;

public class Samochod implements Pojazd, Marka {

    @Override
    public void start() {
        System.out.println("Samochód rusza");
    }
    @Override
    public void stop() {
        System.out.println("Samochod hamuje");
    }
    public void zatrab() {
        System.out.println("Samochód trąbi");
    }
    @Override
    public void marka() {
        System.out.println("Volvo");
    }
}
