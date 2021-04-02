package sda.wzorceProjektowe.command;

public class SumOf implements CommandWithUndo {

    private int sum;
    private int element;
    private int counter = 0;

    @Override
    public void execute() {
        sum += element;
        counter++;
    }

    @Override
    public void undo() {
        if (counter > 0) {
            sum -= element;
            counter--;

        }
    }

    public SumOf(int sum, int element) {
        this.sum = sum;
        this.element = element;
    }

    @Override
    public String toString() {
        return "SumOf{" +
                "sum=" + sum +
                ", element=" + element +
                ", counter=" + counter +
                '}';
    }
}
