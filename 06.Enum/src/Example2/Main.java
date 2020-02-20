package Example2;

public class Main {
    public static void main(String[] args) {

        Human Pawel = new Human("Paweł", 31, Eyes.ZIELONE, Hair.BRAZOWE, TshirtSize.L);


        System.out.println(Pawel);
        System.out.println("oczy: " + Pawel.getOczy());
        System.out.println("wlosy: " + Pawel.getWlosy());
        System.out.println(TshirtSize.XL.getSleeveLength() + " cm");

        //petla for each do wylistowania
        for(Eyes o: Eyes.values()){
            System.out.println(o);
        }
        for (TshirtSize ts: TshirtSize.values()) {
            System.out.println(ts);
        }

    }

}