package wzorceProjektowe.Singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        Singleton2 s3 = Singleton2.INSTANCE;
        Singleton2 s4 = Singleton2.INSTANCE;

        s1.name = "Zbyszek";
        s2.name = "Frodo";

        s3.name = "Marcin";
        s4.name = "Łukasz";

        System.out.println(s1.name);
        System.out.println(s2.name);
        // s1.name został przysłonięty, gdyż referencje prowadzą do tego samego obiektu.

        System.out.println(s3.name);
        System.out.println(s4.name);
    }
}
