package test2.kolejnyTest;

public interface Monster {
    int value = 126;
    void move();
    void atack();
    default void deff(){
        System.out.println("test 1 ");
    }

}
