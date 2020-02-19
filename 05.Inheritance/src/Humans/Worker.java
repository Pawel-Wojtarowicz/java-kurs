package Humans;

import java.time.LocalDate;

public class Worker extends Human {

    String imie;
    String nazwisko;
    LocalDate dataUrodzenia;
    String PESEL;

    public Worker(String imie, String nazwisko, LocalDate dataUrodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
    }
    void idzNaUrlop() {
        System.out.println("Metoda jest dostępna bo kierownik dziedziczy po pracowniku");
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", dataUrodzenia=" + dataUrodzenia +
                '}';
    }
}
