import java.util.*;
import java.util.Scanner;

public class CollectionsMap
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = new String();
        String input2 = new String();

        Map<String, String> imiona = new HashMap<>();

        do {
            System.out.printf("Podaj 1 imie: ");
            input = scanner.next();
            System.out.printf("Podaj 2 imie: ");
            input2 = scanner.next();
            if (!input.equals("-") && !input2.equals("-")) {
                imiona.put(input, input2);
            }
        } while (!input.equals("-") && !input2.equals("-"));

        ///////////////////////////////////////////////////////////////////////////////
        imiona.values().forEach(System.out::println);
        for(String v : imiona.values()) {
            System.out.println(v);
        }
        imiona.keySet().forEach(System.out::println);
        for(String k : imiona.keySet()) {
            System.out.println(imiona.get(k));
        }
        ///////////////////////////////////////////////////////////////////////////////
        System.out.println("Iterowanie po kluczach i pobieranie wartosci");
        for(String k : imiona.keySet()) {
            String v = imiona.get(k);
            System.out.println(k + ": " + v);
        }
        ///////////////////////////////////////////////////////////////////////////////
        for (Map.Entry<String, String> entry : imiona.entrySet()) {
            String k = entry.getKey();
            System.out.println(k +" ");
        }
        ///////////////////////////////////////////////////////////////////////////////
        System.out.println("podaj imie partera: ");
        input = scanner.next();
        System.out.println("Partnerka dla: "+input+" to "+imiona.get(input));

    }
}