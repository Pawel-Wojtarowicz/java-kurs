package Vehicles;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        //interfejsy
        Marka marka = new Samochod();
        Pojazd pojazd = new Rower();
        Pojazd czolg = new Rower();

        marka.marka();   //wyswietli marke samochodu
        pojazd.start();  //wyswietli rower rusza
        czolg.stop();	//wyswietli rower hamuje
        //////////////


        //jezeli teraz stworzymy sobie tablice obiektów które implementuja dany interfejs to mozemy na tych obiektach wykonac dostepne metody (z interfejsu) w petli za jednym zamachem.
        //tworzenie instancji class
        Rower rower = new Rower();
        rower.wlaczLicznik();  //wyswietli start licznika
        Samochod samochod = new Samochod();
        Pojazd czolg1 = new Czolg(); //tworzac instancje czolg przez interfejs pojazd ktory jest rozszezony przez interfejs marka mamy dostep do marki czolgu.
        //
        //dodawanie obiektow do arraylist
        List<Pojazd> pojazdy = new ArrayList<Pojazd>();  //tworzenie arraylist na interfejs pojazd
        pojazdy.add(samochod);
        pojazdy.add(rower);
        pojazdy.add(czolg1);
        // ...
        // zatrzymaj wszystkie pojazdy
        for(Pojazd kierowanyPojazd : pojazdy) {
            kierowanyPojazd.stop();
            kierowanyPojazd.start();
            kierowanyPojazd.marka();
        }
        //
    }
}