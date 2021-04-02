package test2020.polimorfizm.przykladZYT;

public class Lekcja09 {
    public static void main(String[] args) {

        StudentDzienny sd = new StudentDzienny();
        sd.imie = "Jan";
        sd.nazwisko = "Student Dzienny";
        sd.obecnoscNaWykladzie();

        StudentZaoczny sz = new StudentZaoczny();
        sz.imie = "Mirek";
        sz.nazwisko = "Student Zaoczny";
        sz.obecnoscNaWykladzie();

        StudentOnline so = new StudentOnline();
        so.imie = "Mirek";
        so.nazwisko = "Student Online";
        so.obecnoscNaWykladzie();

        System.out.println("\nsprawdzenie dziedziczenia klas dziedziczących\n");

        StudentDzienniInny sdi = new StudentDzienniInny();
        sdi.imie = "Marek";
        sdi.nazwisko = "Wołoszczak";
        sdi.obecnoscNaWykladzie();
        sdi.metodaDzienna();




    }
}
