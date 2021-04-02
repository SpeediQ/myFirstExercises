package test2.frame;

        import javax.swing.*;

public class Main {
    public Main() {
        JFrame frame = new JFrame();
        frame.setTitle("Tytuł ramki");
        frame.setSize(1000,1000);
        frame.setLocation(100,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new Main();
    }
}
