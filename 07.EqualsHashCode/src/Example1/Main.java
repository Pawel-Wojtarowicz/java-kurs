package Example1;

public class Main {
    public static void main(String[] args) {

        String name = "Paweł";
        String name1 = name;  //nowa referencja do obiektu name
        String name2 = new String(name);  //tworzymy nowy obiekt w innym miejscu w pamieci
        String name3 = "Paweł";
        String name4 = "Tomek";

        /*
        == porownanie miejsca w pamieci
        equals porównanie wartosci
         */

        System.out.println(name==name1);  //porownanie miejsca w pamieci(referencji), a nie obiektu (referencje sa sznurkami wskazujacymi na obiekty).
        System.out.println(name==name2);  //false bo tworzony jest nowy String name2 i jest on juz w innym miejscu w pamieci. Metoda equals bedzie true

        System.out.println(name==name3);  //istnieje optymalizacja poola stringów dlatego zwraca true a powinno false.
        System.out.println(name.equals(name1));
        System.out.println(name.equals(name2));
        System.out.println(name.equals(name3));
        System.out.println(name.equals(name4));

    }
}

