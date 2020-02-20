package Example2;

public class Human {

    String name;
    int wiek;
    Eyes oczy;
    Hair wlosy;
    TshirtSize tshirtSize;

    public Human(String name, int wiek, Eyes oczy, Hair wlosy, TshirtSize tshirtSize) {
        this.name = name;
        this.wiek = wiek;
        this.oczy = oczy;
        this.wlosy = wlosy;
        this.tshirtSize = tshirtSize;
    }

    public String getName() {
        return name;
    }

    public int getWiek() {
        return wiek;
    }

    public Eyes getOczy() {
        return oczy;
    }

    public Hair getWlosy() {
        return wlosy;
    }
    public TshirtSize TshirtSize() {
        return  tshirtSize;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", wiek=" + wiek +
                ", oczy=" + oczy +
                ", wlosy=" + wlosy +
                ", tshirtSize=" + tshirtSize +
                '}';
    }
}
