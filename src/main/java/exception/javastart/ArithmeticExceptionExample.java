package exception.javastart;

public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = 5;

        divide(a,b);
        divide(a,c);

    }
    private static void divide(int a, int b){
        try{
            System.out.println(a/b);
        } catch (ArithmeticException exception){
            System.out.println("Nie dzielimy przez zero!");

        }
    }
}
