
public class Main {


    //execute OutOfMemoryError
    public static void main(String[] args) {
        long[][] criticalMemoryTable = new long[100000][20000];

        for (int i = 0; i < criticalMemoryTable.length; i++) {
            for (int j = 0; j < criticalMemoryTable[i].length ; j++) {
                criticalMemoryTable[i][j] = 1;
            }
        }
    }
}