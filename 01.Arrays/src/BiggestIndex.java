public class BiggestIndex {


    public int big(int[] numbers) {
        int biggest = numbers[0];
        if (numbers[1] > biggest) {
            biggest = numbers[1];
        }
        if (numbers[2] > biggest) {
            biggest = numbers[2];
        }
        return biggest;
    }

}
