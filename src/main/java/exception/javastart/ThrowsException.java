package exception.javastart;

public class ThrowsException {
    public static void main(String[] args) {
        int a=10, b=5, c=0;

        try{
            System.out.println(divide(a,c));
        }catch (ArithmeticException exception){
            System.out.println("Nie dzielimy przez zero!\n"+"Exception: "+exception);
        }
    }

    private static int divide (int a, int b) throws ArithmeticException{
        return a/b;
    }
}
