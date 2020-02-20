package Example4;

public class Main {
    private final String name;
    private final String surname;
    private final String pesel;

    public Main(String name, String surname, String pesel) {
        this.name = name;
        this.surname = surname;
        if (pesel == null) {
            throw new IllegalArgumentException("Every human needs to have PESEL!");
        }
        this.pesel = pesel;
    }

    @Override
    public int hashCode() {
        return 17 * pesel.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Main)) {
            return false;
        }

        Main otherHuman = (Main) obj;
        return pesel.equals(otherHuman.getPesel());
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + pesel;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPesel() {
        return pesel;
    }

    public static void main(String[] args) {
        Main human1 = new Main("Paweł", "Wojtarowicz", "850223000000");
        Main human2 = new Main("Jan", "Kowalski", "891213000000");
        Main human3 = new Main("Jan", "Kowalski", "850223000000");

        System.out.println(human1 + " == " + human2 + " " + human1.equals(human2));
        System.out.println(human2 + " == " + human3 + " " + human2.equals(human3));
        System.out.println(human1 + " == " + human3 + " " + human1.equals(human3));
        System.out.println(human1.hashCode());
        System.out.println(human2.hashCode());
        System.out.println(human3.hashCode());
    }
}

