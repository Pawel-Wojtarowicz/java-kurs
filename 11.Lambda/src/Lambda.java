import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Lambda {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> stringList = new ArrayList<>();

        System.out.println("podaj 5 stringow");
        for (int i = 0; i < 5; i++) {
            String input = scanner.next();
            stringList.add(input);
        }
        stringList.forEach(System.out::println);
        System.out.println("##################");

        stringList.sort(Comparator.comparing(String::length).reversed());
        stringList.forEach(System.out::println);
        System.out.println("##################");

        stringList.sort((a,b) -> a.length() - b.length());
        stringList.forEach(System.out::println);

    }

}
