package Humans;

import java.time.LocalDate;

public class Manager extends Worker {

    String dzial;

    public Manager(String imie, String nazwisko, LocalDate dataUrodzenia, String dzial) {
        super(imie, nazwisko, dataUrodzenia);
        this.dzial = dzial;
    }
    void przydzielPremie(){
        System.out.println("premia przyznana");
    }

    @Override
    public String toString() {
        return "Kierownik{" +
                "dzial='" + dzial + '\'' +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", dataUrodzenia=" + dataUrodzenia +
                '}';
    }
}