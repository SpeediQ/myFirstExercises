package test2.lambda;

public class Test2 {
    public static void main(String[] args) {
        ZachowaniePoWcisnieciu c = () -> {
            System.out.println("Tutaj coś jest napisane");
        };
        c.akcja();
        intKalkulator add = (int a, int b) -> a + b;
        Przycisk przycisk = new Przycisk();
        int i = przycisk.metodaImplInterface(1000, 800, add);
        System.out.println(i);
        Przycisk2 przycisk2 = new Przycisk2();

        NowyInterface newInterface = (int a, int b, int d ) -> {
            return a+b+d;
        };
        System.out.println(przycisk2.nowaMetoda(10, 50, 60, newInterface));

    }
}

interface ZachowaniePoWcisnieciu {
    void akcja();
}

interface NowyInterface {
    int action(int a, int b, int c);
}

class Przycisk {
    int metodaImplInterface(int a, int b, intKalkulator z) {
        return z.action(a, b);
    }
}

class Przycisk2 {
    int nowaMetoda(int a, int b, int c, NowyInterface z) {
        return z.action(a, b, c);
    }
}

