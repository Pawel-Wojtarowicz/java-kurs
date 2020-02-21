package Checked;

//checked exception, runtime exception
public class Main2 {
    public static void main(String[] args) {

        Main2 test = new Main2();

        try{
            test.divide(8, 0);
        }
        catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println("Catch in main.");
        }

        int a = 100;
        System.out.println(a);
    }

    private int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }
}