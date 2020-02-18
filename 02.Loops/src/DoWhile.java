public class DoWhile {

    public static void main(String[] args){
        int licznik = 0;

        do{
            System.out.println("To jest petla [licznik " + licznik+ "]");
            licznik++;
        }
        while(licznik<10);
        System.out.println("Koniec pętli");
    }
}