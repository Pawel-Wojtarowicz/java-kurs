import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsList {
    public static void main(String[] args) {

        //roznice miedzy list na array list https://pl.gadget-info.com/difference-between-list
        //https://javastart.pl/baza-wiedzy/klasy/interfejs-list
        //wstep do kolekcji http://blog.akademiakodu.pl/kurs-java/wstep-do-kolekcji/
        List<String> people = new ArrayList<>();

        people.add("Pawel");
        people.add("Wojtek");
        people.add("Adam");
        people.add("Ela");
        people.add("Grzesiek");
        people.add("Ola");
        System.out.println("Rozmiar ArrayListy to: " + people.size());

        System.out.println("Wyświetla 3 osobe z listy: " + people.get(2));
        System.out.println("Wyświetla ilosc elementów: " + people.size());
        System.out.println("Usuwa jedna osobe: " + people.remove(0));  //people.remove("Pawel");
        System.out.println("Wyświetla ilosc elementów po usunieciu osoby " + people.size());

        for (int i = 0; i < people.size(); i++) {
            System.out.println("petla: " + people.get(i));
        }

        for ( String element: people) {
            System.out.println(element);
            System.out.println(people);
        }

        String imie = people.get(0);
        System.out.println("Pierwszy element tablicy people to: " +imie);

        List<String> people2 = new ArrayList<>();

        people2.add("Janek");
        String imie2 = people2.get(0);
        System.out.println("Pierwszy element tablicy people2 to: " +imie2);

        System.out.println("--------------");
        people.forEach(System.out::println);
        System.out.println("--------------");
        Collections.sort(people);
        people.forEach(System.out::println);
        System.out.println("--------------");

    }
}
