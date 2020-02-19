package Animals;

import Animals.Animal;
import Animals.Goldfish;
import Animals.Human;

public class Main {
    public static void main(String[] args) {

        Animal human = new Human();
        Animal goldfish = new Goldfish();

        System.out.println(goldfish);
        System.out.println(human);


    }
}
