package sda.wzorceProjektowe.singleton;

public enum SingletonEnum {
    INSTANCE;

    SingletonEnum(){
        System.out.println("Instance created");
    }
}
