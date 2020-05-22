import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StatefullOperation {

    private final Set<Integer> seen = new HashSet<>();

    private int modify(int number) {
        if (seen.contains(number)) {
            return number;
        }
        seen.add(number);
        return 0;
    }

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            Stream<Integer> numbers = Stream.of(1, 2, 3, 1, 2, 3, 1, 2, 3);
            StatefullOperation requriements = new StatefullOperation();
            int sum = numbers.parallel()
                    .map(requriements::modify)
                    .mapToInt(n -> n.intValue()).sum();
            System.out.println(sum);
        }

        System.out.println("IntStream: ");
        IntStream.range(1950, 2150)
                .filter(y -> (y % 4 == 0 && y % 100 != 0) || y % 400 == 0)
                .forEach(x -> System.out.print(x + ", "));


        System.out.println("LeapYear: ");
        List<Integer> list = new ArrayList<>();

        IntStream.range(1950, 2150)
                .filter(x -> isLeapYear(x))
                .filter(x -> list.add(x))
                .forEach(x -> System.out.print(x + ", "));

    }
    public static boolean isLeapYear(int year) {
        boolean every4Years = year % 4 == 0;
        boolean notEvery100Years = year % 100 != 0;
        boolean every400Years = year % 400 == 0;

        return (every4Years && notEvery100Years) || every400Years;
    }
}