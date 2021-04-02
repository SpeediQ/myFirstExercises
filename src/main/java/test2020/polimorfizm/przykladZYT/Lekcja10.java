package test2020.polimorfizm.przykladZYT;

public class Lekcja10 {
    public static void main(String[] args) {
        Student[] studentTable = new Student[4];
        studentTable[0]= new StudentDzienny();
        studentTable[1]= new StudentDzienniInny();
        studentTable[2]= new StudentOnline();
        studentTable[3]= new StudentZaoczny();

        for (int i = 0; i < studentTable.length; i++) {
            studentTable[i].obecnoscNaWykladzie();
        }
        for (Student student : studentTable) {
            student.obecnoscNaWykladzie();
        }

    }
}
