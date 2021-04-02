package kursUdemy;

public class Bottle {
    @Override
    public String toString() {
        return "Bottle{" +
                "contect=" + contect +
                '}';
    }

    public static void main(String[] args) {
        Bottle[] bottle = new Bottle[3];


        bottle[0] = new Bottle(10);
        bottle[1] = new Bottle(15);
        bottle[2] = new Bottle(32);

        bottle[0].transferContent(30, bottle[1]);
        bottle[1].transferContent(30, bottle[2]);

        for (Bottle bottle1 : bottle) {
            System.out.println(bottle1);
        }
    }

    int contect;
    int exc = 0;


    public Bottle(int contect) {
        this.contect = contect;
    }

    void subtractContent(int value) {
        if (this.contect - value < 0) {
            System.out.println("Zawartość jest mniejsza od deklarowanej ilości\nPrzeniesiono " + this.contect + ",. Butelka jest już pusta.");
            this.contect = 0;
        } else {
            this.contect -= value;
        }
    }

    void addContent(int value) {
        this.contect += value;
    }

    void transferContent(int value, Bottle target) {
        if (this.contect - value < 0) {
            value = this.contect;
        }
        this.subtractContent(value);
        target.addContent(value);
    }

}


