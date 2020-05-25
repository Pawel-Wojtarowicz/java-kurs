import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.DoubleToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BoardGame {
    public final String name;
    public final double rating;
    public final BigDecimal price;
    public final int minPlayers;
    public final int maxPlayers;

    public BoardGame(String name, double rating, BigDecimal price, int minPlayers, int maxPlayers) {
        this.name = name;
        this.rating = rating;
        this.price = price;
        this.minPlayers = minPlayers;
        this.maxPlayers = maxPlayers;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "BoardGame{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                ", price=" + price +
                ", minPlayers=" + minPlayers +
                ", maxPlayers=" + maxPlayers +
                '}';
    }

    public static void main(String[] args) {

        List<BoardGame> games = Arrays.asList(
                new BoardGame("Terraforming Mars", 8.38, new BigDecimal("123.49"), 1, 5),
                new BoardGame("Codenames", 7.82, new BigDecimal("64.95"), 2, 8),
                new BoardGame("Puerto Rico", 8.07, new BigDecimal("149.99"), 2, 5),
                new BoardGame("Terra Mystica", 8.26, new BigDecimal("252.99"), 2, 5),
                new BoardGame("Scythe", 8.3, new BigDecimal("214.95"), 1, 5),
                new BoardGame("Power Grid", 7.92, new BigDecimal("145"), 2, 6),
                new BoardGame("7 Wonders Duel", 8.15, new BigDecimal("109.95"), 2, 2),
                new BoardGame("Dominion: Intrigue", 7.77, new BigDecimal("159.95"), 2, 4),
                new BoardGame("Patchwork", 7.77, new BigDecimal("75"), 2, 2),
                new BoardGame("The Castles of Burgundy", 8.12, new BigDecimal("129.95"), 2, 4)
        );

        for (BoardGame game : games) {
            System.out.println(game);
        }
        System.out.println("\n#### FILTERED by 4 PLAYERS ####");
        Stream<BoardGame> gamesStream = games
                .stream()
                .filter(x -> x.maxPlayers >4);

        gamesStream.forEach(System.out::println);

        System.out.println("\n#### ONLY NAMES ####");
        Stream<Object> gameStream1 = games
                .stream()
                .map(x -> x.name.toUpperCase());
        gameStream1.forEach(x -> System.out.println("* " + x));


        System.out.println("\n#### FILTERED by PRICE ####");
        Comparator<BoardGame> comparator = Comparator.comparing(BoardGame::getPrice);
        BoardGame price = games.stream().max(comparator).get();
        System.out.println(price);

        System.out.println("\n#### FILTERED by NAME Length ####");
        Comparator<BoardGame> comparator1 = Comparator.comparingInt(x -> x.getName().length());
        BoardGame NameLength = games.stream()
                .reduce(BinaryOperator.minBy(comparator1)).get();
        System.out.println(NameLength);

        System.out.println("\n########");
        games.stream()
                .map(x -> x.getName() + " " + x.getPrice())
                .forEach(System.out::println);

    }
}

