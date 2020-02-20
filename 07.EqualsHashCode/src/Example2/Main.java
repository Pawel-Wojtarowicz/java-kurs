package Example2;

public class Main {
    public static void main(String[] args) {
        String pablo1 = "pablo";
        String pablo2 = "pablo";
        String pablo3 = new String(pablo1);
        String pablo4 = new String(pablo2);


        System.out.println(pablo1 == pablo2);
        System.out.println(pablo3 == pablo4);
        System.out.println(pablo1.equals(pablo3));
        System.out.println(pablo3.equals(pablo4));
    }
}
        /*
        true
        false
        true
        true


        Zauważ, że porównanie pablo1 i pablo2 przy użyciu operatora == zwraca nam prawdę,
        lecz gdy porównamy pablo1 i pablo3 (utworzony przez new) to zwraca już fałsz.

        Dzieje się, tak ponieważ operator == sprawdza referencję obiektów (nie ich zawartość)
        - w pierwszym przypadku, otrzymujemy prawdę, ponieważ oba obiekty wskazują na ten sam obszar w pamięci. (pablo1 i pablo2 wskazuje na ten sam string "pablo").
        Zaś w drugim przypadku pomimo tego, że Stringi są takie same to operator == sprawdza tylko adresy, które są różne. (poniewaz pablo3 i pablo4 sa w roznych miejscach w pamieci).

         */