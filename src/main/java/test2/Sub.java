package test2;

public class Sub {
    public static void main(String[] args) {
        String test = "123456789";
        String testSub = test.substring(test.length()-2);
        System.out.println(test.length()-2);
        System.out.println(testSub);
    }
}
