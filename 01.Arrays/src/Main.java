public class Main {

    public static void main(String[] args) {
        BiggestIndex biggestindex = new BiggestIndex();
        //deklarujemy tablice
        int[] numbers = {4,5,8,105,3,5,2,1};
        int[] numbers2 = {433,108,521};
        //ustawiamy max na 1 element
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Tablica 1. Największa to: " + max);
        System.out.println("Tablica 2. Największa to: " + biggestindex.big(numbers2));

    }
}
