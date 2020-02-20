package Example3;

public class Main {

    String name;
    String surname;
    Integer age = new Integer("30");
    String PESEL;

    public Main(String name, String surname, int age, String PESEL) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.PESEL = PESEL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPESEL() {
        return PESEL;
    }

    public void setPESEL(String PESEL) {
        this.PESEL = PESEL;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Main main = (Main) o;
        return age == main.age &&
                PESEL == main.PESEL &&
                name.equals(main.name) &&
                surname.equals(main.surname);
        //tutaj sobie wybieramy co chcemy porównywać
    }

    @Override
    public int hashCode() {
        //return Objects.hash(name, surname, age, PESEL);
        return 17 * name.hashCode() + 31 * surname.hashCode() + 7 * PESEL.hashCode() + 15 * age.hashCode();
    }

    public static void main(String[] args) {
        Main human = new Main("Pawel", "Wojtarowicz", 31, "88072808977");
        Main human1 = new Main("Ela", "Letka", 29, "90061712345");
        Main human2 = new Main("Pawel", "Wojtarowicz", 30, "88072808977");
        Main human3 = new Main("Pawel", "Wojtarowicz", 31, "88072808977");

        System.out.println("human == human1: " + human.equals(human1));
        System.out.println("human == human2: " + human.equals(human2));
        System.out.println("human == human3: " + human.equals(human3));
        System.out.println(human.hashCode());
        System.out.println(human1.hashCode());
        System.out.println(human2.hashCode());
        System.out.println(human3.hashCode());

    }
}

