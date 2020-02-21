package Time;

public class Main {
    public static void main(String[] args) {
        Main instance = new Main();
        int hours = -5;
        int numberOfSeconds = 0;

        try {
            numberOfSeconds = instance.getNumberOfSeconds(hours);
        }
        catch (IllegalArgumentException exception) {
            numberOfSeconds = instance.getNumberOfSeconds(hours * -1);
        }
        System.out.println(numberOfSeconds);

    }
    public int getNumberOfSeconds(int hour) {
        if (hour < 0) {
            throw new IllegalArgumentException("Hour must be >= 0: " + hour);
        }
        return hour * 60 * 60;
    }
}