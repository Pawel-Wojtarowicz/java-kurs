package Vehicles;

public class Rower implements Pojazd, Marka {

    @Override
    public void start() {
        System.out.println("Rower rusza");
    }
    @Override
    public void stop() {
        System.out.println("Rower hamuje");
    }
    public void wlaczLicznik() {
        System.out.println("Licznik wlączony");
    }
    @Override
    public void marka() {
        System.out.println("Romet");
    }
}

