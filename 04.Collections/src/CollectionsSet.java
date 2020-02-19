import java.util.*;
import java.util.Scanner;

public class CollectionsSet
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = new String();

        Set<String> imiona = new HashSet<>();

        do {
            System.out.printf("Podaj imie: ");
            input = scanner.next();
            if (!input.equals("-")) {
                imiona.add(input);
            }
        } while (!input.equals("-"));

        for(String s : imiona) {
            System.out.println(s + " " + s.hashCode());
        }
        System.out.println(imiona.hashCode());
        System.out.println(imiona.contains("Paweł"));


    }
}