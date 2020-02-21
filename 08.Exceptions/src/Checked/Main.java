package Checked;

//checked exception, runtime exception
public class Main {
    public static void main(String[] args) {

        Main test = new Main();

        try{
            test.divide(8, 0);
        }
        catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println("Catch in main.");
        }
        finally {
            System.out.println("Finally in Main.");
        }

        int a = 100;
        System.out.println(a);
    }

    private int divide(int a, int b) {
        int result = 0;

        try {
            result = a / b;
        }
        catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println("Catch in divide.");
        }
        finally {
            System.out.println("Finally in divide.");
        }
        return result;
    }
}