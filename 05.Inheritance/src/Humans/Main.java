package Humans;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker("Paweł", "Wojtarowicz", LocalDate.of(1988,07,28));
        Manager manager = new Manager("Adam", "Kowalski", LocalDate.of(1980,01,20), "IT");

        //polimorfizm (kierownik1 jest pracownikiem)
        //kierownik1 operuje tylko na zmiennych i metodach które są w klasie pracownik
        Worker manager1 = new Manager("Tomasz", "Nowak", LocalDate.of(1970, 02, 13), "HR");

        manager.zjedz();
        manager1.zjedz();
        worker.zjedz();

        manager.PESEL = "pesel jest dostepny bo kierownik dziedziczy po pracowniku";
        manager.idzNaUrlop();  //Metoda jest dostępna bo kierownik dziedziczy po pracowniku
        manager.przydzielPremie();
        System.out.println(worker);
        System.out.println(manager);
        System.out.println(manager1);

    }
}
